package SXT;

import java.util.Arrays;

public class storeTableUsingArrays {

    public static void main(String[] args) {
        //每一个一维数组代表一行数据
        Object[] emp0 = {1001,"高小一",18,"程序员","2019-2-14"};
        Object[] emp1 = {1001,"高小二",19,"产品经理","2019-10-9"};
        Object[] emp2 = {1001,"高小三",20,"Leader","2018-1-1"};

        Object[][] emps = new Object[3][];
        emps[0] = emp0;
        emps[1] = emp1;
        emps[2] = emp2;

        //打印二维数组的内容
        for (int i = 0; i < emps.length; i++) {
            System.out.println(Arrays.toString(emps[i]));
        }
        System.out.println();

        for (int i = 0; i < emps.length; i++) {
            for (int j = 0; j < emps[i].length; j++) {
                System.out.print(emps[i][j]+"\t");
            }
            System.out.println();
        }
    }

}
