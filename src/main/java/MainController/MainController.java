package MainController;
import DisplayUI.CreateGrid;
import DisplayUI.GameBoard;
import GameLogic.GameLogic;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * 'class MainController': the entry point into the game and contains the main classes that define the interface and logic of the game, namely 'GameBoard' and 'GameLogic'.
 */
public class MainController extends Application {
//  public static boolean GameEnd=false;
  @Override
  public void start(Stage primaryStage){
    GameBoard.gameBoard(primaryStage);
    GameLogic.turns(CreateGrid.btn);
    //After game end, the play again btn becomes visible
  }
}
