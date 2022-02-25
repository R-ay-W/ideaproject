package TopInterviewQuestions.Easy;

import java.util.HashSet;


public class HappyNumber {
    public boolean isHappy(int n){
        HashSet<Integer> set = new HashSet<>();
        int happy = getBitSquareSum(n);
        while (happy!=1){
            if(set.contains(happy)){
                return false;
            }
            else {
                set.add(happy);
                happy = getBitSquareSum(happy);
            }
        }
        return true;
    }

    public int getBitSquareSum(int n){
        int ans = 0;
        while(n>0){
            int d = n%10;
            n = n/10;
            ans += d*d;
        }
        return ans;
    }

    public static void main(String[] args) {
        HappyNumber t1 = new HappyNumber();
        System.out.println(t1.isHappy(19));

    }
}
