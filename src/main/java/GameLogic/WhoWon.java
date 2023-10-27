package GameLogic;
import DisplayUI.GameBoard;
import GameNotifications.GameNotifications;
import javafx.scene.control.Button;

/**
 * 'class WhoWon' had a hasWon() method that is used to determine who, if anyone, has won the game. Once the win, loss(user's), or draw has been established, the script
 * disables the entire grid of buttons so on no more turns can be played, a notification is sent declaring the result of the game, and the play Again button is made
 * visible so the user can choose to start a new game. They may also choose to just quit by clicking the quit button.
 */
public class WhoWon {
  //'hasWon': when called, determines if there is 3 of the player's 'X' or computer's 'O', appropriately, in a horizontal, vertical, or diagonal line.
  public static boolean hasWon(Button[][] btn, String player){
    for(int i=0; i<3; i++) //horizontal lines
      if(btn[i][0].getText().equals(player) && btn[i][1].getText().equals(player) && btn[i][2].getText().equals(player)) return true;
    for(int i=0; i<3; i++) //Vertical lines
      if(btn[0][i].getText().equals(player) && btn[1][i].getText().equals(player) && btn[2][i].getText().equals(player)) return true;
    if(btn[0][0].getText().equals(player) && btn[1][1].getText().equals(player) && btn[2][2].getText().equals(player)) return true; //Diagonal Line
    if(btn[2][0].getText().equals(player) && btn[1][1].getText().equals(player) && btn[0][2].getText().equals(player)) return true; //Diagonal Line
    return false;
  }
  //'userWon': if true, disable grid, notify that user won, and make play again btn visible; otherwise return false
  public static boolean userWon(Button[][] btn){
    if(hasWon(btn,"X")){
      disableGrid(btn);
      GameNotifications.userWon();
      GameBoard.playAgainBtn.setVisible(true);
      return true;
    }
    return false;
  }
  //'computerWon': if true, disable grid, notify that computer won, and make play again btn visible; otherwise returns false
  public static boolean computerWon(Button[][] btn){
    if(hasWon(btn,"O")) {
      disableGrid(btn);
      GameNotifications.computerWon();
      GameBoard.playAgainBtn.setVisible(true);
      return true;
    }
    return false;
  }
  //'draw': if true, disable grid, declare a draw, and make play again btn visible
  public static void draw(Button[][] btn) {
    disableGrid(btn);
    GameNotifications.draw();
    GameBoard.playAgainBtn.setVisible(true);
  }
  //'disableGrid': actual logic behind disabling the grid of buttons
  private static void disableGrid(Button[][] btn) {
    for(int i=0; i<3; i++)
      for(int j=0; j<3; j++) btn[i][j].setDisable(true);
  }

}
