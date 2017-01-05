package com.reader.repo;

import com.reader.bean.User;
import com.reader.config.DataSourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * Created by alan on 17/1/3.
 */
@Repository
public class UserRepo {

    @Autowired
    private DataSourceConfig dataSourceConfig;

    public RowMapper<User> userRowMapper=new BeanPropertyRowMapper<>(User.class);

    public User getUserByStuId(String stuId) {
        try {
            JdbcTemplate template = dataSourceConfig.getJdbcTemplate();
            if(template!=null){
                String sql="SELECT * FROM user WHERE stuId=?";
                return template.queryForObject(sql,userRowMapper,stuId);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public String test(){
        return " User";
    }

}
