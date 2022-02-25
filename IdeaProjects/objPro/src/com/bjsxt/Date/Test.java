package com.bjsxt.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

    public static void main(String[] args) throws ParseException {
        long a  = Long.MAX_VALUE/(1000L*3600*24*365);
        System.out.println(a);//大约表示到2.9亿年后

        long nowNum = System.currentTimeMillis(); //代表当前时刻的毫秒数
        System.out.println(nowNum);

        Date d1 = new Date();  //如果没有传参，则代表当前时刻
        System.out.println(d1);
        System.out.println(d1.getTime());

        //new出SimpleDateFormat对象
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        SimpleDateFormat s2 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        //将时间对象转换成字符串
        String daytime = s1.format(new Date());
        System.out.println(daytime);
        System.out.println(s2.format(d1));

        //将字符串转成Date对象
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        Date d2 = df.parse("1983-12-10 10:40:52");
        System.out.println(d2);
    }
}
