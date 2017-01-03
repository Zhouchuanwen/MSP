package com.reader.impl;

import com.reader.service.Student;

/**
 * Created by alan on 16/12/28.
 */
public class StudentImpl implements Student {

    @Override
    public void speak() {
        System.out.println("hi");
    }

    @Override
    public void walk() {
        System.out.println("move");
    }
}
