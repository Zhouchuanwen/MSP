package com.reader.repo;

import com.reader.bean.User;
import com.reader.config.MongoConfigTemplate;
import org.mongodb.morphia.Datastore;
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

    public User getUserByStuId(String stuId) {
        try {
            return template.queryForObject("SELECT * FROM user WHERE stuId=?",USER_MAPPER,stuId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Long test1(){
        Datastore datastore=mongoConfigTemplate.get();
        if(datastore!=null){
            long num=datastore.createQuery(Object.class).countAll();
            return num;
        }
        return null;
    }


    public String test(){
        return " User";
    }

}
