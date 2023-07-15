import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(){
        setTitle("300x300프레임 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Container contentPane = getContentPane();



        contentPane.add(new JButton("add"));
        contentPane.add(new JButton("sub"));
        contentPane.add(new JButton("mul"));
        contentPane.add(new JButton("div"));
        contentPane.add(new JButton("Calculate"));

        setSize(300, 200);
        setVisible(true);

    }
}
