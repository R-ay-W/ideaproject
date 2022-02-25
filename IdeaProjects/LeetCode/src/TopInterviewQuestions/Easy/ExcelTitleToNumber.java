package TopInterviewQuestions.Easy;
import java.lang.Math;
public class ExcelTitleToNumber {
    public int titleToNumber(String columnTitle) {
        int length = columnTitle.length();
        int count = columnTitle.charAt(length-1)-64;
        int times = 1;
        for(int i = length-2;i>=0;i--){
            int a = columnTitle.charAt(i)-64;

            count += a*Math.pow(26,times);
            times++;
        }
        return count;

    }

    public static void main(String[] args) {
        ExcelTitleToNumber t1 = new ExcelTitleToNumber();
        System.out.println(t1.titleToNumber("AA"));
    }

}
