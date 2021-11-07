package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyListener;
import javax.swing.JComponent;
import javax.swing.JPanel;


public class GamePlatform extends JPanel implements Runnable {

    final int originalTileSize = 16; // create 16x16 map
    final int multiplier = 3;

    final int TileSize = originalTileSize * multiplier; // create 48x48 map
    final int collum = 16; // set screen 16:12 (4:3)
    final int row = 12;// set screen 16:12 (4:3)
    final int ScreenWidth = TileSize * collum; // set screen width 768
    final int ScreenHeight = TileSize * row; // set screen height 576

    keyboardController controller = new keyboardController();
    
    int PosX = 100;
    int PosY = 100;
    int moveSpeed = 5;
    
    int FPS = 60;
            
    Thread GameThread;

    public GamePlatform() {
        this.setPreferredSize(new Dimension(ScreenWidth, ScreenHeight));
        this.setBackground(Color.CYAN);
        this.setDoubleBuffered(true);
        this.addKeyListener(controller);
        this.setFocusable(true);
    }

    public void StartGameThread() {
        GameThread = new Thread(this);
        GameThread.start();

    }

    @Override
    public void run() {
        double drawInterval = 1000000000/FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        
        
        while (GameThread != null) {
            currentTime = System.nanoTime();
            delta += (currentTime - lastTime)/ drawInterval;
            
            lastTime = currentTime;
            
            
            if(delta >= 1){
            update();
            repaint();
            delta--;
            }
        }

    }

    public void update() {
        if(controller.keyUp == true){
            PosY -= moveSpeed;
            
        }else if(controller.keyDown == true){
            PosY += moveSpeed;
            
        }else if(controller.keyLeft == true){
            PosX -= moveSpeed;
        }else if(controller.keyRight == true){
            PosX += moveSpeed;
        }

    }

    public void paintComponent(Graphics c) {
        super.paintComponent(c);

        Graphics2D c1 = (Graphics2D) c;
        c1.setColor(Color.RED);
        c1.fillRect(PosX, PosY, TileSize, TileSize);
        c1.dispose();
    }
}
