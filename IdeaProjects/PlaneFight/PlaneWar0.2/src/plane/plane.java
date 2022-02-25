package plane;

import java.awt.*;

public class plane extends GameObject {

    public plane(Image img, double x, double y, int speed) {
        super(img, x, y, speed);
    }

    @Override
    public void drawMyself(Graphics g) {
        super.drawMyself(g);

        //飞机飞行的算法可以自行设定
        x += speed;
        y += speed;
    }
}
