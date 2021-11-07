package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author afkda
 */

public class keyboardController implements KeyListener {
    public boolean keyUp, keyDown, keyLeft, keyRight;
    @Override
    public void keyTyped(KeyEvent e) {
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_W){
            keyUp = true;
        }
        if(key == KeyEvent.VK_A){
            keyLeft = true;
        }
        if(key == KeyEvent.VK_S){
            keyDown = true;
        }
        if(key == KeyEvent.VK_D){
            keyRight= true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_W){
            keyUp = false;
        }
        if(key == KeyEvent.VK_A){
            keyLeft = false;
        }
        if(key == KeyEvent.VK_S){
            keyDown = false;
        }
        if(key == KeyEvent.VK_D){
            keyRight= false;
        }
        
    }
    
}
