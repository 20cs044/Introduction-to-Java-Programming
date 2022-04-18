/*
@author:-Devraj Parmar(20cs044)
Exercise07_09, you can enter any number and you get approximated square root by given formula
*/

/*
(Game: play a tic-tac-toe game) In a game of tic-tac-toe,
two players take turnsmarking an available cell in a grid
with their respective tokens (either X or O).
When one player has placed three tokens in a
horizontal, vertical, or diagonal row on the grid,
the game is over and that player has won.
A draw (no winner) occurs when all the cells on the grid
have been filled with tokens and neither player has achieved a win.
Create a program for playing tic-tac-toe.
The  program  prompts two players to enter an X token and O token alternately.
Whenever a token is entered, the program redisplays the board on the
console and determines the status of the game (win, draw, or continue).
*/

import java.util.Scanner;

package Exercise07;

public class Exercise07_09 {
  public static Scanner input = new Scanner(System.in);

       public static void main(String []args) {
       String[][] board = getBoard();

       String[] tokens = {"X","0"};
       int result;

       do {
       print(board);
       int[] cell = getCell(board, tokens[0]);

       placeToken(board, cell, Tokens[0]);

       result = gameStatus(board, Tokens[0]);

       if (result == 2) {
           swap(tokens);
       }
       } while (result == 2);
       print(board);

       if (result == 0) {
       System.out.print(token[0] + "player won");
       else
       System.out.print("players draw");
       }

       public static int gameStatus(String[][] m, String e)
       if
       }
}

/*
Output:-
Enter a number: 9
The approximated square root of 9 is: 3.0
*/
