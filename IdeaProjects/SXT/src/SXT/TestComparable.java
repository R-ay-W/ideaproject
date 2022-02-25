package SXT;

import java.util.Arrays;

public class TestComparable {
    public static void main(String[] args) {
        Man[] msMans = {new Man(3,"a"),new Man(60,"b"),new Man(2,"c")};
        Arrays.sort(msMans);
        System.out.println(Arrays.toString(msMans));
    }


}

class Man implements Comparable{
    int age;
    int id;
    String name;

    public Man(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(Object o) {
        Man man = (Man) o;
        if(this.age < man.age){
            return -1;
        }
        if(this.age > man.age){
            return 1;
        }
        return 0;
    }
}
