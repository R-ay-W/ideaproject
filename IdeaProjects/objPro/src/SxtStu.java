import jdk.nashorn.api.tree.ArrayLiteralTree;

public class SxtStu {

    //field
    int id;
    String sname;
    int age;

    //Method
    void study(){
        System.out.println("I am studying");
    }



    //Constructor
    SxtStu(int id, String sname, int age){
        this.id = id;
        this.sname = sname;
        this.age = age;
    }

    public static void main(String[] args) {
        SxtStu s1 = new SxtStu(12138,"Ray",22);
        System.out.println(s1.id);
        System.out.println(s1.sname);
        System.out.println(s1.age);


    }
    /**
     * garbage collection
     * 回收：堆中的对象
     * 栈没有必要回收，栈执行完自动就没有了
     * 引用计数法 根搜索法
     * 年轻代 年老代 永久代
     * System.gc 建议启动垃圾回收进程（只能建议）
     * this的本质是创建好的对象的地址
     * 创建对象的四步：
     * 1. 分配对象空间，并将对象成员变量初始化为0或空
     * 2. 执行属性值的显式初始化（int id = 3;）
     * 3. 执行构造方法
     * 4. 返回对象的地址给相关的变量
     *
     * 隐式参数 this
    **/

}
