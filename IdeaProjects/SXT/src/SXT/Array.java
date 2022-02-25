package SXT;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        exam[] a1 = new exam[4];
        a1[0] = new exam("java",60);
        a1[1] = new exam("python",70);
        a1[2] = new exam("bigData",80);
        a1[3] = new exam("AI",90);

        exam[] a2 = new exam[10];
        System.arraycopy(a1,0,a2,0,a1.length);
        System.out.println(Arrays.toString(a2));
        System.out.println(a2);
//        for (int i = 0; i < a2.length; i++) {
//            System.out.println(Arrays.toString(a2));
//
//        }
    }

}

class exam{
    private String subject;
    private int score;

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getSubject() {
        return subject;
    }

    public int getScore() {
        return score;
    }

    public exam(String subject, int score) {
        this.subject = subject;
        this.score = score;
    }

    @Override
    public String toString() {
        return "exam{" +
                "subject='" + subject + '\'' +
                ", score=" + score +
                '}';
    }
}
