package PracticaFinal_DavidSantome_MaciaSalva;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 * @author David Santomé Galván
 * @author Macià Salvà Salvà
 */
public class Board extends JPanel {

    private int rows, columns;
    private final int side = 100;
    private static final Color WHITE = Color.white;
    private static final Color BLACK = Color.black;

    private boolean iBlocked;

    private boolean solving = false;

    private final BoardPanel[] panels = new BoardPanel[60];

    public Board() {
        MouseListener m;

        for (int i = 0; i < 60; i++) {
            JPanel p = new JPanel();
            panels[i] = new BoardPanel(false, WHITE);
            panels[i].paintPanel(p);

            m = new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent me) {
                }

                @Override
                public void mousePressed(MouseEvent me) {
                }

                @Override
                public void mouseReleased(MouseEvent me) {
                    if (solving == false) {
                        // blocked
                        int j = getComponentZOrder(p);
                        if (panels[j].getColor() == BLACK) {
                            panels[j].setColor(WHITE);
                            panels[j].setBlocked(false);
                            panels[j].paintPanel(p);
                        } else {
                            panels[j].setColor(BLACK);
                            panels[j].setBlocked(true);
                            panels[j].paintPanel(p);
                        }
                        iBlocked = false;
                        for (int k = 0; k < 60; k++) {
                            if (panels[k].isBlocked() == true) {
                                iBlocked = true;
                            }
                        }
                    }else {
                        System.out.println("Is solving, try again later");
                    }
                }

                @Override
                public void mouseEntered(MouseEvent me) {
                }

                @Override
                public void mouseExited(MouseEvent me) {
                }
            };
            p.addMouseListener(m);
            add(p);
        }
    }
    
    /**
     * Sets the new Layout of the grid.
     *
     * @param rows number of rows
     *
     * @param columns number of columns
     *
     * @return nothing
     */
    public void newLayout(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        setLayout(new GridLayout(rows, columns, 5, 5));
    }

    /**
     * Gets width of the grid.
     *
     * @return columns*side
     */
    @Override
    public int getWidth() {
        return columns * side;
    }

    /**
     * Gets height of the grid.
     *
     * @return columns*side
     */
    @Override
    public int getHeight() {
        return rows * side;
    }

    /**
     * Gets number of rows of the grid.
     *
     * @return rows
     */
    public int getRows() {
        return rows;
    }

    /**
     * Gets number of columns of the grid.
     *
     * @return columns
     */
    public int getColumns() {
        return columns;
    }

    /**
     * Gets total number of cells of the board.
     *
     * @return rows*columns
     */
    public int getBoardTotalSquares() {
        return rows * columns;
    }

    /**
     * Clears the board. Sets all Backgrounds to white.
     *
     * @return nothing
     */
    public void clearBoard() {
        for (int i = 0; i < getRows() * getColumns(); i++) {
            getComponent(i).setBackground(WHITE);
        }
    }

    /**
     * Gets boolean value of a cell.
     *
     * @param i
     *
     * @return boolean
     */
    public boolean getBlockedSquares(int i) {
        return panels[i].isBlocked();
    }

    /**
     * Sets boolean value to a cell.
     *
     * @param i
     *
     * @param blocked
     *
     * @return nothing
     */
    public void setBlockedSquares(int i, boolean blocked) {
        panels[i].setBlocked(blocked);
    }

    /**
     * Sets all cells to unblocked.
     *
     * @return nothing
     */
    public void setAllUnblocked() {
        for (int i = 0; i < 60; i++) {
            panels[i].setBlocked(false);
        }
    }

    /**
     * Gets the hole Board.
     *
     * @return board
     */
    public Color[] getBoard() {
        Color[] help = new Color[60];
        for (int i = 0; i < 60; i++) {
            help[i] = panels[i].getColor();
        }
        return help;
    }

    /**
     * Gets an especific cell color.
     *
     * @param i
     *
     * @return color
     */
    public Color getBoardCell(int i) {
        return panels[i].getColor();
    }

    /**
     * Sets color to a cell.
     *
     * @param col
     *
     * @param i
     *
     * @return nothing
     */
    public void setBoard(Color col, int i) {
        panels[i].setColor(col);
    }

    /**
     * Gets boolean if you blocked.
     *
     * @return iBlocked
     */
    public boolean getIBlocked() {
        return iBlocked;
    }

    /**
     * Gets boolean if is Solving.
     *
     * @return iBlocked
     */
    public boolean isSolving() {
        return solving;
    }

    /**
     * Sets boolean if is Solving.
     *
     * @param solving
     *
     * @return nothing
     */
    public void setSolving(boolean solving) {
        this.solving = solving;
    }

}
