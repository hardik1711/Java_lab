
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class check implements ItemListener {
    CheckboxGroup c;
    Checkbox c1,c2,c3,c4;
    TextField t1;
    Frame f;
    check(){
        f=new Frame();
        c1=new Checkbox("Hardik",c,false);
        c2=new Checkbox("Shri",c,false);
        c3=new Checkbox("somu",c,false);
        c4=new Checkbox("Shivay",c,false);
        t1=new TextField(10);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(c4);
        f.add(t1);
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
    }

    public static void main(String[] args) {
        check che=new check();
    }


    public void itemStateChanged(ItemEvent e) {
        Object obj=e.getSource();
        Checkbox ch=(Checkbox)obj;
        if(ch==c1){
            t1.setText(c1.getLabel());
        } else if(ch==c2){
            t1.setText(c2.getLabel());
        } else if (ch==c3){
            t1.setText(c3.getLabel());
        } else if (ch==c4){
            t1.setText(c4.getLabel());
        }
    }
}
