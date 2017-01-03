package com.reader.impl;

import com.reader.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by alan on 16/12/26.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestRepo testRepo;

    @Override
    public String addTime() {
        try {
            System.out.println("Date time!");
            return testRepo.count().toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "none";
        }
    }
}
