package TopInterviewQuestions.Easy;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        digits[digits.length - 1] = digits[digits.length - 1] + 1;
        for (int i = digits.length - 1; i >= 1; i--) {
            if (digits[i] == 10) {
                digits[i] = 0;
                digits[i - 1] = digits[i - 1] + 1;
            }
        }
        if (digits[0] == 10) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            newDigits[1] = 0;
            for (int i = 2; i < newDigits.length; i++) {
                newDigits[i] = digits[i - 1];
            }
            return newDigits;
        }
        return digits;
    }

}
