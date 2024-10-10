//package JavaSwing_1;

import javax.swing.JFrame;

public class JFrame_1 extends JFrame {
    public JFrame_1(){
        initialize();
    }
    public void initialize(){
        setTitle("JFrame_1");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500,800);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
