package DisplayUI;
import GameNotifications.GameNotifications;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * class GameBoard creates and places on the game screen the game grid, title on the game screen, the "Play Again" button, and the "Quit" button
 */
public class GameBoard {
  //Global "Play Again" and "Quit" buttons to be set visible and invisible as needed
  public static Button playAgainBtn;
  public static Button quitBtn;

  public static void gameBoard(Stage primaryStage){
    GridPane grid=CreateGrid.createGrid();//Create Grid
    VBox vBox = CreateTitle.createTitle(grid);//Set Title
    //The notification space will go here
    Label notification = GameNotifications.createNotification(); vBox.getChildren().add(notification); //End-of-game notification; whether the user won, lost, secured a draw.
    quitBtn = CreateBtn.quitBtn(primaryStage); vBox.getChildren().add(quitBtn); //create Quit btn and add to vBox
    playAgainBtn = CreateBtn.playAgainBtn(); vBox.getChildren().add(playAgainBtn); //create Play again btn and add to vBox
    playAgainBtn.setVisible(false); //its initially invisible
    Scene scene=new Scene(vBox, 1000,600); scene.setFill(Color.gray(0.88));
    primaryStage.setScene(scene); primaryStage.setTitle("TicTacToe Game"); primaryStage.setResizable(false); primaryStage.show();
  }

}
