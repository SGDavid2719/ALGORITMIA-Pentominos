package PracticaFinal_DavidSantome_MaciaSalva;

import java.awt.Color;

/**
 * @author David Santomé Galván
 * @author Macià Salvà Salvà
 */
public abstract class Figure {
    
    public boolean used = false;
    
    /**
     * Abstract getSquares.
     * @param i
     * @param i0
     * @return 
     */
    public abstract int getSquares(int i, int i0);

    /**
     * Abstract getColor.
     * @return 
     */
    public abstract Color getColor();

    /**
     * Abstract getRotations.
     * @return 
     */
    public abstract int getRotations();
    
    public abstract boolean getUsed();
    
    public abstract void setUsed(boolean used);
}
