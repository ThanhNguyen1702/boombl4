
package g;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
public class GamePlatform extends JPanel{
    final int originalTileSize = 16; // create 16x16 map
    final int multiplier = 3;
    
    final int TileSize = originalTileSize * multiplier; // create 48x48 map
    final int collum = 16; // set screen 16:12 (4:3)
    final int row  = 12 ;// set screen 16:12 (4:3)
    final int ScreenWidth = TileSize *collum; // set screen width 768
    final int ScreenHeight = TileSize * row; // set screen height 576
    
    public GamePlatform(){
        this.setPreferredSize(new Dimension(ScreenWidth,ScreenHeight));
        this.setBackground(Color.CYAN);
        this.setDoubleBuffered(true);
    }
}
