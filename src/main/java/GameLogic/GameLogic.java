package GameLogic;
import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 'class GameLogic' arranges for user to go a turn, make the computer have turn after that, and checking after each turn how many unclicked buttons are remaining and whether
 * the user or computer has won yet. As soon as one of them do win, the entire gird becomes un-clickable, the user is notified regarding the result of the game(win/lose/draw),
 * and the user the allowed to start over with the play again button. The user is also allowed to quit the game at any time using the Quit button.
 */
public class GameLogic {
  //'turns' lets user and computer take turns play the game
  public static void turns(Button[][] btn){
    for(int i=0; i<3; i++) //set logic for each button in the grid
      for(int j=0; j<3; j++){
        final Button f_btn = btn[i][j];
        f_btn.setOnAction(e->{
          usersMove(f_btn); //usr chooses a btn
          if(WhoWon.userWon(btn)) return; //if usr wins, game ends. no more turn-taking
          if(unClickedList(btn).isEmpty()) {  WhoWon.draw(btn); return;  } //game ends in draw if all btns in grid are used up before someone wins
          computersMove(btn); //computer selects a btn
          if(WhoWon.computerWon(btn)) return;  //if usr wins, game ends. no more turn-taking
        });
        btn[i][j] = f_btn;
      }
  }
  //'usersMove': for the btn that usr clicks, the btn is disabled and colored green
  public static void usersMove(Button f_btn){
    f_btn.setText("X");
    f_btn.setDisable(true);
    f_btn.setStyle(f_btn.getStyle()+"-fx-background-color:green; -fx-text-fill:white;");
  }
  //'computersMove': for the btn that computer clicks, the btn is disabled and colored red
  public static void computersMove(Button[][] btn) {
    List<Button> unClicked = unClickedList(btn);
    if(!unClicked.isEmpty()){
      Random random = new Random();
      Button randBtn = unClicked.get(random.nextInt(unClicked.size()));
      randBtn.setText("O");
      randBtn.setDisable(true);
      randBtn.setStyle(randBtn.getStyle()+"-fx-background-color:red; -fx-text-fill:white;");
    }
  }
  //'unClickedList' returns list of yet-to-be-clicked buttons
  public static List<Button> unClickedList(Button[][] btn){
    List<Button> unClicked = new ArrayList<>();
    for(int i=0; i<3; i++)
      for(int j=0; j<3; j++) if(btn[i][j].getText()=="") unClicked.add(btn[i][j]);
    return unClicked;
  }

}
