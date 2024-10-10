//package JavaSwing_1;
import javax.swing.*;

public class Launcher {
    public static void main(String arg[]){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run(){
                JFrame_1 frame_1 = new JFrame_1(); 
            }
        });
    }
}
