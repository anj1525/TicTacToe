import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe {
    int boardwidth = 600;
    int boardheight = 650;

    JFrame board = new JFrame("Tic Tac Toe"); // names the window
    JLabel tJLabel = new JLabel();
    JPanel tPanel = new JPanel(new BorderLayout());

    JButton[][] frame = new JButton[3][3];
    String playerX = "X";
    String playerO = "O";
    String currentP = playerX;

    TicTacToe() {
        // creating a board to build the game on top of
        board.setVisible(true);
        board.setSize(boardwidth, boardheight);
        board.setLocationRelativeTo(null); // Will print it in the middle of the screen
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board.setLayout(new BorderLayout());

        tJLabel.setBackground(new Color(179, 208, 203));// set the background
        tJLabel.setForeground(new Color(49, 89, 94)); // set font color
        tJLabel.setFont(new Font("Dialog", Font.BOLD, 50));
        tJLabel.setHorizontalAlignment(JLabel.CENTER);
        tJLabel.setText("Tic Tac Toe");
        tJLabel.setOpaque(true);

        tPanel.add(tJLabel, BorderLayout.NORTH);

        JPanel gridPanel = new JPanel(new GridLayout(3, 3));
        gridPanel.setBackground(new Color(7, 50, 75));
        tPanel.add(gridPanel, BorderLayout.CENTER);

        board.add(tPanel);

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                JButton tile = new JButton();
                frame[r][c] = tile;
                gridPanel.add(tile);

                tile.setBackground(Color.white);
                tile.setForeground(Color.black);
                tile.setFont(new Font("Arial", Font.BOLD, 120));
                tile.setFocusable(false);

                tile.setBackground(new Color(179, 208, 203));
                tile.setForeground(new Color(49, 89, 94));//remeber this is the text
                tile.setFont(new Font("Arial", Font.BOLD, 120));
                tile.setFocusable(false);
 
            }
        }
    }
}
