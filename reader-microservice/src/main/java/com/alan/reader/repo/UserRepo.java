package com.alan.reader.repo;

import com.alan.reader.util.MyDateUtils;
import com.alan.reader.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.Date;
import java.util.List;

/**
 * Created by alan on 17/1/3.
 */
@Repository
@Component
public class UserRepo {

    @Bean
    public UserRepo getUserRepo() {
        return new UserRepo();
    }

    @Autowired
    public JdbcTemplate template;

    public RowMapper<User> USER_MAPPER=new BeanPropertyRowMapper<>(User.class);

    public User create(final User user) {
        final String SQL = "INSERT INTO user(stuName,idCard,gender,joinSchool,sdept,stuType,major,phone,email,mask,stuId,register,password,salt,role) " +
                " VALUES(?,?,?,?,?,?,?,?,?,0,?,?,?,?,0)";
        String school=user.getJoinSchool()!=null? MyDateUtils.date2String(user.getJoinSchool()):null;
        GeneratedKeyHolder holder = new GeneratedKeyHolder();
        template.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(SQL, new String[]{"id"});
            ps.setString(1,user.getStuName());
            ps.setString(2,user.getIdCard());
            ps.setInt(3,user.getGender());
            ps.setString(4,school);
            ps.setString(5,user.getSdept());
            ps.setString(6,user.getStuType());
            ps.setString(7,user.getMajor());
            ps.setString(8,user.getPhone());
            ps.setString(9,user.getEmail());

            ps.setString(10,user.getStuId());
            ps.setString(11,MyDateUtils.time2String(new Date()));
            ps.setString(12,user.getPassword());
            ps.setString(13,user.getSalt());
            return ps;
        }, holder);
        return user;
    }


    public User getUserByStuId(String stuId) {
        try {
            return template.queryForObject("SELECT * FROM user WHERE stuId = ? AND mask=0", USER_MAPPER, stuId);
        } catch (DataAccessException e) {
            return null;
        }
    }


    public User getUserByReaderId(Integer readerId) {
        try {
            return template.queryForObject("SELECT * FROM user WHERE readerId = ? AND mask=0", USER_MAPPER, readerId);
        } catch (DataAccessException e) {
            return null;
        }
    }

    public User getUserByStuName(String stuName) {
        try {
            return template.queryForObject("SELECT * FROM user WHERE stuName LIKE '%'+stuName+'%' AND mask=0", USER_MAPPER);
        } catch (DataAccessException e) {
            return null;
        }
    }


    public List<User> findUserByPage(Integer page) {
        try {
            page = page == null ? 0 : page;
            return template.query("SELECT * FROM user WHERE mask=0 LIMIT ?,10", USER_MAPPER, page);
        } catch (DataAccessException e) {
            return null;
        }
    }


    public List<User> findLibrirans() {
        try {
            return template.query("SELECT * FROM user WHERE role=1 AND mask=0 ", USER_MAPPER);
        } catch (DataAccessException e) {
            return null;
        }
    }


    public User getLibriranByReaderId(Integer readerId) {
        try {
            return template.queryForObject("SELECT * FROM user WHERE readerId= ? AND role=1 AND mask=0 ", USER_MAPPER, readerId);
        } catch (DataAccessException e) {
            return null;
        }
    }

    public User getSuperUserByReaderId(Integer readerId) {
        try {
            return template.queryForObject("SELECT * FROM user WHERE readerId= ? AND role=2 AND mask=0 ", USER_MAPPER, readerId);
        } catch (DataAccessException e) {
            return null;
        }
    }


    public void delete(String stuId) {
        try {
            template.update("UPDATE user SET mask=1 WHERE stuId=? ", stuId);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }

    public void disable(Long readerId){
        try {
            template.update("UPDATE user SET mask=2 WHERE readerId=? ", readerId);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }

    public void enable(Long readerId){
        try {
            template.update("UPDATE user SET mask=0 WHERE readerId=? ", readerId);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }


    public void setLibrarian(Integer readerId) {
        try {
            template.update("UPDATE user SET role=1 WHERE readerId=? ", readerId);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }

    public void setSuperUser(Integer readerId) {
        try {
            template.update("UPDATE user SET role=2 WHERE readerId=? ", readerId);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }


    public void hi(){
        System.out.println("aaa..................> hi");
    }
}
