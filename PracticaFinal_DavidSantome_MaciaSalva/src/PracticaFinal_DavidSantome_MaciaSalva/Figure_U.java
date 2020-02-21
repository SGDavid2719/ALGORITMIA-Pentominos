package PracticaFinal_DavidSantome_MaciaSalva;

import java.awt.Color;

/**
 * @author David Santomé Galván
 * @author Macià Salvà Salvà
 */
public class Figure_U extends Figure {

    public final Color MAGENTA = Color.magenta;
    
    /**
     * Array with all different positions.
     */
    private static final int[][] piece_data_U = {
        {0, 0, 0, 2, 1, 0, 1, 1, 1, 2}, // U both sides
        {0, 0, 0, 1, 1, 0, 2, 0, 2, 1},
        {0, 0, 0, 1, 0, 2, 1, 0, 1, 2},
        {0, 0, 0, 1, 1, 1, 2, 0, 2, 1},};

    /**
     * Gets positions from array.
     *
     * @param x x
     *
     * @return int
     */
    public int[] getPosition_U(int x) {
        return piece_data_U[x];
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
        return piece_data_U[x][y];
    }

    /**
     * Gets the array.
     *
     * @return int[][]
     */
    public static int[][] getPiece_data_U() {
        return piece_data_U;
    }

    /**
     * Gets the color of the figure. Overrides abstract method.
     *
     * @return color
     */
    @Override
    public Color getColor() {
        return MAGENTA;
    }

    /**
     * Gets the rotations of the figure. Overrides abstract method.
     *
     * @return number of rotations
     */
    @Override
    public int getRotations() {
        return piece_data_U.length;
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
