//package JavaSwing_1;
import javax.swing.*;

public class JFrame_2 {
    private JFrame frame;

    public JFrame_2(){
        initialize();
    }

    public void initialize(){
        frame = new JFrame();
        this.frame.setTitle("JFrame_1");
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame.setSize(500,800);
        this.frame.setVisible(true);
        this.frame.setLocationRelativeTo(null);
        this.frame.setResizable(false);
    }
}
