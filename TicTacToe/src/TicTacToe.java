import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe {
 int boardwidth = 600;
 int boardheight = 650;
 
 JFrame board = new JFrame();

 TicTacToe(){
   //creating a board to build the game on top of 
    board.setVisible(true);
    board.setSize(boardwidth,boardheight);
    board.setLocationRelativeTo(null); //Will print it in the middle of the screen
    board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    board.setLayout(new BorderLayout());

 }
}
