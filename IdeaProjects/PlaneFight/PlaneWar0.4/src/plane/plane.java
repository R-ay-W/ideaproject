package plane;

import java.awt.*;
import java.awt.event.KeyEvent;

public class plane extends GameObject {

    boolean left,right,up,down;//飞机的方向控制

    public plane(Image img, double x, double y, int speed) {
        super(img, x, y, speed);
    }

    public plane(Image img, double x, double y, int speed, int width, int height) {
        super(img, x, y, speed);
        super.height = height;
        super.width = width;
    }
    @Override
    public void drawMyself(Graphics g) {
        super.drawMyself(g);

        //飞机飞行的算法可以自行设定
        if(left){
            x -= speed;
        }
        if(right){
            x += speed;
        }
        if(up){
            y -= speed;
        }
        if(down){
            y += speed;
        }

    }

    public void addDirection(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            left = true;
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            right = true;
        }
        if(e.getKeyCode() == KeyEvent.VK_UP){
            up = true;
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN){
            down = true;
        }
    }

    public void deductDirection(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            left = false;
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            right = false;
        }
        if(e.getKeyCode() == KeyEvent.VK_UP){
            up = false;
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN){
            down = false;
        }
    }
}
