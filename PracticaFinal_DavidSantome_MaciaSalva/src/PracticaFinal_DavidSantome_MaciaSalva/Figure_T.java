package PracticaFinal_DavidSantome_MaciaSalva;

import java.awt.Color;

/**
 * @author David Santomé Galván
 * @author Macià Salvà Salvà
 */
public class Figure_T extends Figure {

    public final Color CYAN = Color.cyan;
    
    /**
     * Array with all different positions.
     */
    private static final int[][] piece_data_T = {
        {0, 0, 0, 1, 0, 2, 1, 1, 2, 1}, // T both sides
        {0, 2, 1, 0, 1, 1, 1, 2, 2, 2},
        {0, 1, 1, 1, 2, 0, 2, 1, 2, 2},
        {0, 0, 1, 0, 1, 1, 1, 2, 2, 0},};

    /**
     * Gets positions from array.
     *
     * @param x x
     *
     * @return int
     */
    public int[] getPosition_T(int x) {
        return piece_data_T[x];
    }

    /**
     * Gets x and y from array.
     *
     * @param x x
     * 
     * @param y y
     *
     * @return int[]
     */
    @Override
    public int getSquares(int x, int y) {
        return piece_data_T[x][y];
    }

    /**
     * Gets the array.
     *
     * @return int[][]
     */
    public static int[][] getPiece_data_T() {
        return piece_data_T;
    }

    /**
     * Gets the color of the figure. Overrides abstract method.
     *
     * @return color
     */
    @Override
    public Color getColor() {
        return CYAN;
    }

    /**
     * Gets the rotations of the figure. Overrides abstract method.
     *
     * @return number of rotations
     */
    @Override
    public int getRotations() {
        return piece_data_T.length;
    }
    
    /**
     * Gets if the figure is used. Overrides abstract method.
     *
     * @return used
     */
    @Override
    public boolean getUsed() {
        return used;
    }

    /**
     * Sets if the figure is used. Overrides abstract method.
     *
     * @return nothing
     */
    @Override
    public void setUsed(boolean isused) {
        used = isused;
    }
}
