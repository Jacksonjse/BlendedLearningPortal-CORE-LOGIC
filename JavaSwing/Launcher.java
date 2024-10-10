package JavaSwing;

import javax.swing.SwingUtilities;

public class Launcher{
    public static void main(String arg[]){                  // invokeLater method is used to perform all the in UI updates 
                                                           //in a single thread called the Event Dispatch Thread (EDT), coz Swing is not Thread safe.                                                           
        SwingUtilities.invokeLater(new Runnable() {       // Annonymous Innerclass.
             @Override
             public void run(){
                MainWindow main = new MainWindow();
                main.show(); 
             }
        });
    }
}