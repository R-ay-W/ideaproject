package SXT;

public class storeTableUsingJavaBean {

    /**
     * 使用JavaBean和一维数组存储表格信息*/


    public static void main(String[] args) {
        employee emp0 = new employee(1001,"高小一",18,"程序员","2019-2-14");
        employee emp1 = new employee(1001,"高小二",19,"产品经理","2019-10-9");
        employee emp2 = new employee(1001,"高小二",19,"产品经理","2019-10-9");

        employee[] emps = new employee[]{emp0,emp1,emp2};
        for (int i = 0; i < emps.length; i++) {
//            System.out.println(
//                    emps[i].getID()+"\t"+
//                    emps[i].getName()+"\t"+
//                    emps[i].getAge()+"\t"+
//                    emps[i].getTitle()+"\t"+
//                    emps[i].getEnrollDate()+"\t"
//            );
            System.out.println(emps[i]);

        }
    }

}

class employee{
    private int ID;
    private String name;
    private int age;
    private String title;
    private String enrollDate;

    public employee(int ID, String name, int age, String title, String enrollDate) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.title = title;
        this.enrollDate = enrollDate;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEnrollDate(String enrollDate) {
        this.enrollDate = enrollDate;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTitle() {
        return title;
    }

    public String getEnrollDate() {
        return enrollDate;
    }

    @Override
    public String toString() {
        return
                getID() +
                "\t" + getName() +
                "\t" + getAge() +
                "\t" + getTitle() +
                "\t" + getEnrollDate() ;
    }
}
