package com.bjsxt.test;

import com.bjsxt.test2.*;//会降低编译速度,不会降低运行速度

import java.sql.Date;
import java.util.*;
//import static java.lang.Math.PI;
import static java.lang.Math.*;
import static com.bjsxt.test2.Student.school;

public class Test1 {

    public static void main(String[] args) {
        User u = new User();
        u.login();

        java.util.Date d1 = new java.util.Date();
        System.out.println(school);


    }
}
