package PracticaFinal_DavidSantome_MaciaSalva;

import java.awt.Color;
import javax.swing.JPanel;

/**
 * @author David Santomé Galván
 * @author Macià Salvà Salvà
 */
public class BoardPanel extends JPanel{

    private boolean blocked;
    private Color color;
    
    /**
     * Constructor of a panel. Has a color and a boolean blocked.
     *
     * @param blocked
     * 
     * @param color
     *
     * @return nothing
     */
    public BoardPanel(boolean blocked, Color color){
        this.blocked = blocked;
        this.color = color;
    }

    /**
     * Returns boolean blocked.
     *
     * @return blocked
     */
    public boolean isBlocked() {
        return blocked;
    }

    /**
     * Returns color.
     *
     * @return color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Sets boolean blocked.
     *
     * @return nothing
     */
    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    /**
     * Sets color..
     *
     * @return nothing
     */
    public void setColor(Color color) {
        this.color = color;
    }
    
    /**
     * Paints a panel by its color.
     *
     * @return nothing
     */
    public void paintPanel(JPanel p){
        p.setBackground(color);
    }
   
}
