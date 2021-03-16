
import javax.swing.*;

public class table {
JFrame f=new JFrame();




    table(){
    String data[][]={ {"101","hardik","CSE"},{"102","Sharma","CSE"},{"103","Shri","CSE"},{"104","somu","CSE"},
            {"101","hardik","CSE"},{"102","Sharma","CSE"},{"103","Shri","CSE"},{"104","somu","CSE"},
            {"101","hardik","CSE"},{"102","Sharma","CSE"},{"103","Shri","CSE"},{"104","somu","CSE"}};


    String column[]={" Roll no","Name ","Course "};
    JTable t=new JTable(data,column);
    t.setBounds(30,40,200,300);

         JScrollPane sp=new JScrollPane(t);
         f.add(sp);
        f.setSize(400,400);
        f.setVisible(true); f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
    public static void main(String[] args) {
table tb=new table();
    }
}
