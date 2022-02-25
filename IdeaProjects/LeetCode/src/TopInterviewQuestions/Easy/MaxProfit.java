package TopInterviewQuestions.Easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 动态规划：
 * 维持两个变量： minprice最小谷值 and maxprofit最大利润
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int minprice = prices[0];
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]<minprice){
                minprice = prices[i];
            }
            if(prices[i]-minprice>maxprofit){
                maxprofit = prices[i]-minprice;
            }

        }
        return maxprofit;

    }


    public static void main(String[] args) {
        MaxProfit t1 = new MaxProfit();
        System.out.println(t1.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        ;
    }

}
