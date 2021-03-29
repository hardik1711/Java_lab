
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class tree {
    Frame f=new Frame("Jtree");

    tree(){
        DefaultMutableTreeNode Desktop=new DefaultMutableTreeNode("Desktop");
        DefaultMutableTreeNode College_file=new DefaultMutableTreeNode("College_file");
        DefaultMutableTreeNode Semester=new DefaultMutableTreeNode("Semester");
        DefaultMutableTreeNode Notes=new DefaultMutableTreeNode("Notes");
        DefaultMutableTreeNode Subject=new DefaultMutableTreeNode("Subject");
        DefaultMutableTreeNode JAVA=new DefaultMutableTreeNode("JAVA");
        Desktop.add(College_file);
        College_file.add(Semester);
        College_file.add(Notes);
        College_file.add(Subject);
        Subject.add(JAVA);
        JTree t=new JTree(Desktop);
        f.add(t);
        f.setSize(500,500);
        f.setVisible(true);






    }


    public static void main(String[] args) {
 tree tr=new tree();
    }
}
