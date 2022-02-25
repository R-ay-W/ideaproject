package SXT;

import java.awt.*;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input exit to stop, input next to calculate another");

        while(true){

            System.out.println("pls input the month salary");
            int monthSalary = scanner.nextInt();
            System.out.println("pls input how many months you got for salary a year");
            int months = scanner.nextInt();
            int yearSalary = monthSalary*months;

            System.out.println("pls input commend");
            scanner.nextLine();
            String command = scanner.nextLine();
            System.out.println(command+"======================");

            if("exit".equals(command)){
                System.out.println("Quiting");
                break;
            }
            if("next".equals(command)){
                System.out.println("re input new datas");
                continue;
            }



            if(yearSalary >= 100000 && yearSalary < 200000){
                System.out.println("congrats, 100000");
            }
            if(yearSalary >= 200000){
                System.out.println("congrats, 200000");
            }

            System.out.println("Year salary is: "+yearSalary);
        }

    }
}
