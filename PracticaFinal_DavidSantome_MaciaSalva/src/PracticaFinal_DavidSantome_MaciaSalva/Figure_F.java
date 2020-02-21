package PracticaFinal_DavidSantome_MaciaSalva;

import java.awt.Color;

/**
 * @author David Santomé Galván
 * @author Macià Salvà Salvà
 */
public class Figure_F extends Figure {

    private final Color YELLOW = Color.yellow;

    /**
     * Array with all different positions.
     */
    private static final int[][] piece_data_F = {
        {0, 1, 0, 2, 1, 0, 1, 1, 2, 1}, // F one side
        {0, 1, 1, 0, 1, 1, 1, 2, 2, 2},
        {0, 1, 1, 1, 1, 2, 2, 0, 2, 1},
        {0, 0, 1, 0, 1, 1, 1, 2, 2, 1},
        {0, 1, 0, 0, 1, 2, 1, 1, 2, 1}, // F other side
        {2, 1, 1, 0, 1, 1, 1, 2, 0, 2},
        {0, 1, 1, 1, 1, 0, 2, 2, 2, 1},
        {2, 0, 1, 0, 1, 1, 1, 2, 0, 1},};

    /**
     * Gets positions from array.
     *
     * @param x x
     *
     * @return int
     */
    public int[] getPosition_F(int x) {
        return piece_data_F[x];
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
        return piece_data_F[x][y];
    }

    /**
     * Gets the array.
     *
     * @return int[][]
     */
    public static int[][] getPiece_data_F() {
        return piece_data_F;
    }

    /**
     * Gets the color of the figure. Overrides abstract method.
     *
     * @return color
     */
    @Override
    public Color getColor() {
        return YELLOW;
    }

    /**
     * Gets the rotations of the figure. Overrides abstract method.
     *
     * @return number of rotations
     */
    @Override
    public int getRotations() {
        return piece_data_F.length;
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
