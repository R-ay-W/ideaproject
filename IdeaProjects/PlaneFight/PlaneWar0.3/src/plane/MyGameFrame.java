package plane;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 游戏主窗口
 */

public class MyGameFrame extends Frame {

    public static final int GAME_WIDTH = 500;
    public static final int GAME_HEIGHT = 500;

    Image planeImg = GameUtil.getImage("imgs/plane.png");
    Image bg = GameUtil.getImage("imgs/bg.jpg");

    static int count = 0;

    plane p1 = new plane(planeImg,100,100,5);






    @Override
    public void paint(Graphics g) {

        g.drawImage(bg,0,0,GAME_WIDTH,GAME_HEIGHT,null);

        p1.drawMyself(g);



    }

    /**   //测试画图工具
    @Override
    public void paint(Graphics g) { //g当作是一支画笔，实现绘制的功能
        Color original = g.getColor();//记录画笔本来的颜色，用完再复原（改变了别人传给你的对象的值，最后要修改回去）

        g.setColor(Color.green);
        g.setColor(new Color(0,255,255));
        //画直线
        g.drawLine(00,00,500,500);

        //画矩形
        g.drawRect(100,100,50,50);

        //画椭圆(正圆)
        g.drawOval(100,100,50,50);//根据外切矩形来画

        //画字符串
        g.drawString("www.weloveray,com",100,100);

        g.setColor(original);
    }*/



    //初始化窗口
    public void launchFrame(){
        this.setTitle("PlaneWar");
        setVisible(true); //设置窗口是否可见 默认不可见
        setSize(500,500); //窗口大小
        setLocation(500,200);//窗口打开的位置

        //增加关闭窗口的动作(点击×退出程序)
        this.addWindowListener(new WindowAdapter() {//匿名内部类
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0); //正常退出程序
            }
        });

        new PaintThread().start();//启动重画窗口的线程

        this.addKeyListener(new KeyMonitor());//启动键盘监听
    }

    /**
     * 定义了一个重画窗口的线程类
     * 用内部类创建一个线程，用内部类的好处是可以直接使用外部类的属性
     */
    class PaintThread extends Thread{
        @Override
        public void run() {
            while(true){
                repaint();//from Frame extended by MyGameFrame
                try {
                    Thread.sleep(25);//1s == 1000ms  一秒画40次
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 内部类，实现键盘的监听处理
     */
    class KeyMonitor extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
//            System.out.println("Press: " + e.getKeyCode());
            p1.addDirection(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
//            System.out.println("Release: "+e.getKeyCode());
            p1.deductDirection(e);
        }
    }


    /**
     * 添加双缓冲技术解决闪烁问题
     */
    private Image offScreenImage = null;
    @Override
    public void update(Graphics g) {
        if(offScreenImage == null){
            offScreenImage = this.createImage(GAME_WIDTH,GAME_HEIGHT);//这是游戏窗口的宽度和高度
        }
        Graphics gOff = offScreenImage.getGraphics();
        paint(gOff);
        g.drawImage(offScreenImage,0,0,null);
    }

    public static void main(String[] args) {
        MyGameFrame gameFrame = new MyGameFrame();
        gameFrame.launchFrame();
    }
}
