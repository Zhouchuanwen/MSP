package com.reader.repo;

import com.reader.bean.User;
import com.reader.config.MongoConfigTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;

/**
 * Created by alan on 17/1/3.
 */
@Repository
public class UserRepo {

    @Inject
    private JdbcTemplate template;

    @Inject
    private MongoConfigTemplate mongoConfigTemplate;

    public RowMapper<User> USER_MAPPER=new BeanPropertyRowMapper<>(User.class);



//    public User create(final User user) {
//        final String SQL = "INSERT INTO user(stuName,idCard,gender,joinSchool,sdept,stuType,major,phone,email,mask,stuId,register,password,salt) " +
//                " VALUES(?,?,?,?,?,?,?,?,?,0,?,?,?,?)";
//        GeneratedKeyHolder holder = new GeneratedKeyHolder();
//        template.update(connection -> {
//            PreparedStatement ps = connection.prepareStatement(SQL, new String[]{"id"});
//            ps.setString(1,user.getStuName());
//            ps.setString(2,user.getIdCard());
//            ps.setString(3,user.getGender());
//            ps.setString(4,user.getJoinSchool());
//            ps.setString(5,user.getStuName());
//            ps.setString(6,user.getStuName());
//            ps.setString(7,user.getStuName());
//            ps.setString(8,user.getStuName());
//            ps.setString(9,user.getStuName());
//            ps.setString(11,user.getStuName());
//            ps.setString(12,user.getStuName());
//            ps.setString(13,user.getStuName());
//            return ps;
//        }, holder);
//        return user;
//    }
//
//





    public User getUserByStuId(String stuId) {
        try {
            return template.queryForObject("SELECT * FROM user WHERE stuId=?",USER_MAPPER,stuId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public User getUserByStuName(String stuName) {
        try {
            return template.queryForObject("SELECT * FROM user WHERE stuName LIKE '%'+stuName+'%'",USER_MAPPER);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public User updateUserByStuId(Long stuId){
        template.update("UPDATE user SET ");
        return null;

    }

    public void delete(Long readerId){
        try {
            template.update("UPDATE user SET mask=1 WHERE readerId=?", readerId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void disable(Long readerId){
        try {
            template.update("UPDATE user SET mask=2 WHERE readerId=?", readerId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enable(Long readerId){
        try {
            template.update("UPDATE user SET mask=0 WHERE readerId=?", readerId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


//    public Long test1(){
//        Datastore datastore=mongoConfigTemplate.get();
//        if(datastore!=null){
//            long num=datastore.createQuery(Object.class).countAll();
//            return num;
//        }
//        return null;
//    }


}
