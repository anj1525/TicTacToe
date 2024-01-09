import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe {
    int boardwidth = 600;
    int boardheight = 650;

    JFrame board = new JFrame("Tic Tac Toe");
    JLabel tJLabel = new JLabel();
    JPanel tPanel = new JPanel(new BorderLayout());

    JButton[][] frame = new JButton[3][3];
    String playerX = "X";
    String playerO = "O";
    String currentP = playerX;

    boolean gameFinished = false;
    int turns = 0;

    TicTacToe() {
        board.setVisible(true);
        board.setSize(boardwidth, boardheight);
        board.setLocationRelativeTo(null);
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board.setLayout(new BorderLayout());

        tJLabel.setBackground(new Color(179, 208, 203));
        tJLabel.setForeground(new Color(49, 89, 94));
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

                tile.setBackground(new Color(179, 208, 203));
                tile.setForeground(new Color(49, 89, 94)); // Text color
                tile.setFont(new Font("Arial", Font.BOLD, 120));
                tile.setFocusable(false);

                tile.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JButton tile = (JButton) e.getSource();
                        if (!gameFinished && tile.getText().equals("")) {
                            tile.setText(currentP);
                            turns++;
                            checkWinner();
                            if (!gameFinished) {
                                currentP = currentP.equals(playerX) ? playerO : playerX;
                                tJLabel.setText(currentP + "'s turn.");
                            }
                        }
                    }
                });
            }
        }
    }

    private void checkWinner() {
        // Check for a winner
        for (int r = 0; r < 3; r++) {
            if (!frame[r][0].getText().equals("") &&
                    frame[r][0].getText().equals(frame[r][1].getText()) &&
                    frame[r][1].getText().equals(frame[r][2].getText())) {
                setWinner(frame[r][0], frame[r][1], frame[r][2]);
                return;
            }
        }

        for (int c = 0; c < 3; c++) {
            if (!frame[0][c].getText().equals("") &&
                    frame[0][c].getText().equals(frame[1][c].getText()) &&
                    frame[1][c].getText().equals(frame[2][c].getText())) {
                setWinner(frame[0][c], frame[1][c], frame[2][c]);
                return;
            }
        }

        if (!frame[0][0].getText().equals("") &&
                frame[0][0].getText().equals(frame[1][1].getText()) &&
                frame[1][1].getText().equals(frame[2][2].getText())) {
            setWinner(frame[0][0], frame[1][1], frame[2][2]);
            return;
        }

        if (!frame[0][2].getText().equals("") &&
                frame[0][2].getText().equals(frame[1][1].getText()) &&
                frame[1][1].getText().equals(frame[2][0].getText())) {
            setWinner(frame[0][2], frame[1][1], frame[2][0]);
            return;
        }

        if (turns == 9) {
            setTie();
        }
    }
     private void setWinner(JButton... buttons) {
        for (JButton button : buttons) {
            button.setBackground(new Color(129, 177, 169)); // Color: 81B1A9
            button.setForeground(Color.black);
        }
        tJLabel.setText(currentP + " is the winner!");
        gameFinished = true;
    }

    private void setTie() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                frame[r][c].setBackground(new Color(129, 177, 169)); // Color: 81B1A9
                frame[r][c].setForeground(Color.black);
            }
        }
        tJLabel.setText("Tie!");
        gameFinished = true;
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TicTacToe());
    }
}
