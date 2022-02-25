package TopInterviewQuestions.Easy;

/**
 * 动态规划
 * 第1级台阶：1种
 * 第2级台阶：2种
 * 第n级台阶：从第n-1级台阶爬1级或从第n-2级台阶爬2级
 * Fn = Fn-1+Fn-2
 * <p>
 * ****记忆化递归 或 自底向上
 */
public class ClimbStairs {

    //    public int climbStairs(int n) {
//        if(n == 1){
//            return 1;
//        }
//        if(n == 2){
//            return 2;
//        }
//        else{
//            return climbStairs(n-1)+climbStairs(n-2);
//        }
//    }
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        long a = 1;
        long b = 2;

        for (int i = 4; i <= n; i++) {
            long temp = a;
            a = b;
            b = temp+b;
//            System.out.println("a="+a+"  b="+b);

        }
        int ans = (int)((int)a+(int)b);
        return ans;
    }

    public static void main(String[] args) {
        ClimbStairs t1 = new ClimbStairs();
//         System.out.println(t1.C(2,5));
        System.out.println(t1.climbStairs(45));
    }

}
