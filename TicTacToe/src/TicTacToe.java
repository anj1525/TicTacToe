import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe {
 int boardwidth = 600;
 int boardheight = 650;
 
 JFrame board = new JFrame("Tic Tac Toe");//names the window
 JLabel tJLabel = new JLabel();
 JPanel tPanel = new JPanel();

 TicTacToe(){
   //creating a board to build the game on top of 
    board.setVisible(true);
    board.setSize(boardwidth,boardheight);
    board.setLocationRelativeTo(null); //Will print it in the middle of the screen
    board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    board.setLayout(new BorderLayout());

    tJLabel.setBackground(Color.darkGray); //set the background
    tJLabel.setForeground(Color.white); //set font colour
    tJLabel.setFont(new Font("Arial",Font.BOLD,50));
    tJLabel.setHorizontalAlignment(JLabel.CENTER);
    tJLabel.setText("Tic Tac Toe");
    tJLabel.setOpaque(true);

    tPanel.setLayout(new BorderLayout());
    tPanel.add(tJLabel);
    board.add(tPanel, BorderLayout.NORTH);

    tPanel.setLayout(new GridLayout(3,3));
    tPanel.setBackground(Color.darkGray);
    board.add(tPanel);
 }
}
