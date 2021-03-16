
import javax.swing.*;
import java.awt.*;

public class tabbed extends JFrame {



    tabbed(){
        //container
        Container c=getContentPane();

        JTabbedPane jt=new JTabbedPane();

        jt.add("Name",new name());
        jt.add("Last name",new lastname());
        c.add(jt);





    }
public class name extends JPanel
{
    name(){
    JButton b1=new JButton("1");
    JButton b2=new JButton("2");
    JButton b3=new JButton("3");
    JButton b4=new JButton("4");
    add(b1);
    add(b2);
    add(b3);
    add(b4);
}


}
public class lastname extends JPanel{
       lastname(){
        JCheckBox c1=new JCheckBox("A");
    JCheckBox c2=new JCheckBox("b");
    JCheckBox c3=new JCheckBox("c");
    JCheckBox c4=new JCheckBox("d");
    add(c1);
    add(c2);
    add(c3);
    add(c4);
}
}
    public static void main(String[] args) {
tabbed t=new tabbed();
t.setSize(400,400);
t.setVisible(true);
t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
