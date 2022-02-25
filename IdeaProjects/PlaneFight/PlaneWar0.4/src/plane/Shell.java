package plane;

import java.awt.*;

/**
 * 炮弹类
 */
public class Shell extends GameObject{

    double degree; //角度，炮弹沿着指定的角度飞行

    public Shell(){
        //生成炮弹的初始位置
        x = 200;
        y = 200;

        degree = Math.random()*Math.PI*2; //生成0到2pi之间的随机数

        width = 6;
        height = 6;

        speed = 3;
    }

    @Override
    public void drawMyself(Graphics g) {
//        super.drawMyself(g);
        Color c = g.getColor();
        g.setColor(Color.YELLOW);
        g.fillOval((int)x,(int)y,width,height);

        g.setColor(c);
        //根据自己的算法制定移动的路径
        x += speed*Math.cos(degree);
        y += speed*Math.sin(degree);

        //碰到边界改变方向
        if(y>MyGameFrame.GAME_HEIGHT-height-2||y<32){
            degree = -degree;
        }
        if(x<0||x>MyGameFrame.GAME_WIDTH-width-2){
            degree = Math.PI-degree;
        }
    }
}
