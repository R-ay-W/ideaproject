import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame{
    Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.jpg");
    Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");

    double x = 200;
    double y = 200;

    double degree = Math.PI/3; //pi 180, PI/3=180/3=60

    //绘制窗口
    public void paint(Graphics g){
        System.out.println("Frame is drawn once!");
        g.drawImage(desk,0,0,null);
        g.drawImage(ball,(int)x,(int)y,null);

        x+=10*Math.cos(degree);
        y+=10*Math.sin(degree);

        if(x>856-60||x<30){
            degree=Math.PI-degree;
        }

        if(y>501-80||y<30){
            degree=-degree;
        }


    }


    //创建窗口
    void lunchFrame(){
        setSize(856,501);
        setLocation(100,100);
        setVisible(true);

        //实现动画，每秒绘制窗口25次
        while(true){
            repaint();

            try {
                Thread.sleep(40);//1s=1000ms.大约一秒绘制1000/40=25次
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args){
        System.out.println("My little game is on");

        BallGame game=new BallGame();
        game.lunchFrame();
    }


}
