import javax.swing.*;
import java.awt.*;

class my_Panel_car extends JPanel {
    int x=200, y = 300, w;

    void slep()
    {
        try {
            Thread.sleep(200);
        }  catch(Exception ex) {
        }
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
            setBackground(Color.white);
            w=getWidth();
            Color c1=new Color(20,160,200);
            Color c2=new Color(200,60,200);
            g.setColor(c1);

            g.drawLine(0,y+75,w,y+75);
            g.setColor(c2);
            g.fillRoundRect(x,y+20,100,40,5,5);
            g.fillArc(x+90,y+20,20,40,270,180);

            g.setColor(c1);


            g.fillRoundRect(x+10,y,70,25,10,10);
            g.setColor(Color.white);
            g.fillRect(x+20,y+5,20,25);
            g.fillRect(x+50,y+5,20,25);
            g.setColor(Color.black);
            g.fillRoundRect(x+55,y+10,10,20,10,10);
            g.fillOval(x+10,y+50,25,25);
            g.fillOval(x+60,y+50,25,25);
            g.setColor(Color.white);
            g.fillOval(x+15,y+55,10,10);
            g.fillOval(x+65,y+55,10,10);
        x+=20;
        slep();

        if(x+100<w) {
            repaint();
        } else {
            repaint();
            x=20;
        }

    }
}
public class Car extends JFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Car Moving");
        f.setSize(600,450);
        Container c = f.getContentPane();
        my_Panel_car p = new my_Panel_car();
        c.add(p);

        f.setVisible(true);
    }
}
