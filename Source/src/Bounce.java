import javax.swing.*;
import java.awt.*;

public class Bounce {
    JFrame frame;

    Bounce(){
        frame = new JFrame("Bounce");
        Drawpanel pnl=new Drawpanel();
        frame.add(BorderLayout.CENTER,pnl);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(340,340);
        frame.setResizable(false);
        frame.setVisible(true);

        for(int z=0;z<250;z++){
            frame.repaint();

            try{
                Thread.sleep(50);

            }catch (Exception ex){

            }
        }
    }
    public static void main(String[] args) {
        new Bounce();
    }
}
class Drawpanel extends JPanel {
    static int x = 0, y = 0;
    public void paintComponent(Graphics g){
        int red = (int)(Math.random()*255);
        int blue = (int)(Math.random()*255);
        int green = (int)(Math.random()*255);
        Color grad = new Color(red, blue , green);

        g.setColor(grad);
        g.fillOval(x, y, 50,50);
        x++;
        y++;
    }
}
