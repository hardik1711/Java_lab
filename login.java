import java.awt.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class login extends Frame  {


    login()
    {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

       Label l1,l2;
       TextField t1,t2;
       Button b1;
       l1=new Label("Username", (int) LEFT_ALIGNMENT);
       l2=new Label("Password", (int) LEFT_ALIGNMENT);
       b1=new Button("Login");
       t1=new TextField(15);
       t2=new TextField(15);
       add(l1);
       add(t1);
       add(l2);
       add(t2);
       add(b1);





    }


    public static void main(String[] args) {

        login l=new login();
        l.setSize(400,400);
        l.setVisible(true);
        l.setLayout(new FlowLayout());
    }
}
