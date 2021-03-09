
import javax.swing.*;
import java.awt.*;

public class grid_layout {
    JFrame f =new JFrame();
    grid_layout(){

        JButton b1=new JButton("1");
                JButton b2=new JButton("2");
        JButton b3=new JButton("3");
                JButton b4=new JButton("4");
        JButton b5=new JButton("5");
                JButton b6=new JButton("6");
        JButton b7=new JButton("7");
                JButton b8=new JButton("8");

                f.add(b1);
                f.add(b2);
                f.add(b3);
                f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);

f.setSize(300,300);
f.setVisible(true);
f.setLayout(new GridLayout(3,3));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {

        grid_layout g =new grid_layout();

    }
}
