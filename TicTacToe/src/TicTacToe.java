import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe {
 int boardwidth = 600;
 int boardheight = 650;
 
 JFrame board = new JFrame();

 TicTacToe(){
    board.setVisible(true);
    board.setSize(boardwidth,boardheight);
 }
}
