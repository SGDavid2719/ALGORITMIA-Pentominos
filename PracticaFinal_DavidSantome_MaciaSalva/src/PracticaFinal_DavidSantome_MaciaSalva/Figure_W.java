package PracticaFinal_DavidSantome_MaciaSalva;

import java.awt.Color;

/**
 * @author David Santomé Galván
 * @author Macià Salvà Salvà
 */
public class Figure_W extends Figure {

    public final Color BROWN = new Color(102, 51, 0);
    
    /**
     * Array with all different positions.
     */
    private static final int[][] piece_data_W = {
        {0, 0, 1, 0, 1, 1, 2, 1, 2, 2}, //W both sides
        {0, 1, 0, 2, 1, 0, 1, 1, 2, 0},
        {0, 0, 0, 1, 1, 1, 1, 2, 2, 2},
        {0, 2, 1, 1, 1, 2, 2, 0, 2, 1},};

    /**
     * Gets positions from array.
     *
     * @param x x
     *
     * @return int
     */
    public int[] getPosition_W(int x) {
        return piece_data_W[x];
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
        return piece_data_W[x][y];
    }

    /**
     * Gets the array.
     *
     * @return int[][]
     */
    public static int[][] getPiece_data_W() {
        return piece_data_W;
    }

    /**
     * Gets the color of the figure. Overrides abstract method.
     *
     * @return color
     */
    @Override
    public Color getColor() {
        return BROWN;
    }

    /**
     * Gets the rotations of the figure. Overrides abstract method.
     *
     * @return number of rotations
     */
    @Override
    public int getRotations() {
        return piece_data_W.length;
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
