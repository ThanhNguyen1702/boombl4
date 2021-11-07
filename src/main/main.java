
package main;
import g.GamePlatform;
import javax.swing.JFrame;

public class main {


    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // press X to close
        window.setResizable(false); //not resizable
        window.setTitle("boombl4"); // set tittle
        
        
        GamePlatform gamePlatform = new GamePlatform();
        window.add(gamePlatform);
        window.pack(); // set size = platform's size
        
        
        
        
        
        
        
        
        window.setLocationRelativeTo(null); // window always centered
        window.setVisible(true); // visible
    }
    
    
    
}
