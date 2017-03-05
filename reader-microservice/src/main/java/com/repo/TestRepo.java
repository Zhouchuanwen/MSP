package com.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by alan on 17/2/27.
 */

@Component
public class TestRepo {

    @Autowired
    private UserRepo userRepo;

    public void sayHi(){
        System.out.println("HI.....");
    }

    public void sayHello(){
        System.out.println("HII......");
        userRepo.hi();
    }

}
