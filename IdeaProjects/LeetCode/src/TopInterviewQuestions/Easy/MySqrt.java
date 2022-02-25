package TopInterviewQuestions.Easy;

/**二分法
 *可以用二分查找的标准格式简化代码
 * */
public class MySqrt {
//    public int mySqrt(int x) {
//        if(x == 1){
//            return 1;
//        }
//        long upper = x;
//        long lower = 0;
//        long mid = (int)((upper+lower)/2);
//        while(!isSqrt(x,mid)&&upper>=lower){
//            if(mid*mid > x){
//                upper = mid-1;
//            }
//            else if(mid*mid < x){
//                lower = mid+1;
//            }
//            mid = (int)((upper+lower)/2);
//
//        }
//        int ans = (int) mid;
//        return ans;
//
//
//    }
//
//    public boolean isSqrt(long x, long i){
//        if(i*i == x){
//            return true;
//        }
//        if(i*i<x && (i+1)*(i+1)>x){
//            return true;
//        }
//        return false;
//    }


    public int mySqrt(int x) {
        int l = 0, r = x, ans = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
//            if ((long) mid * mid <= x) {
//                ans = mid;
//                l = mid + 1;
//            } else {
//                r = mid - 1;
//            }
            if((long)mid*mid<=x && (long)(mid+1)*(mid+1)>x){
                ans = mid;
            }
            if((long) mid*mid <x){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        MySqrt t1 = new MySqrt();
        System.out.println(t1.mySqrt(2147395599));
        System.out.println(Math.sqrt(2147395599));
    }

}
