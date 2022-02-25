public class User {

    int id;
    String name;
    String pwd;
    static String company = "UW";

    public User(int id, String name){
        this.id = id;
        this.name = name;
    }

    public User(int id, String name, String pwd){
        this(id, name);
        /**可用于调用其他构造器，且必须位于第一行
         * this.id = id;
         * this.name = name;
         * **/
        this.pwd = pwd;
    }

    public void login(){
        System.out.println("logining in: "+name);
        System.out.println(company);
        printCompany();
    }

    public static void printCompany(){
        System.out.println(company);


    }
}
