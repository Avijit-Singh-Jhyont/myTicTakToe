package DisplayUI;
import GameLogic.Reset;
import GameNotifications.GameNotifications;
import com.myGame.myTictactoe.MyTictactoeApplication;
import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;

/**
 * class CreateBtn helps in creation of several buttons.
 * It provides template for the Play Again button and Quit Button.
 * It also designs the buttons that the grid utilizes
 */
public class CreateBtn {
  //CreateBtn helps in creation of the tictactoe playing grid of btns under CreateGrid class.
  public static Button createBtn(Button btn, GridPane grid){
    btn = new Button();
    btn.setPrefSize(100,100);
    btn.setStyle("-fx-font-size: 35; -fx-border-color: black; -fx-border-width: 4;"); // increasing the font size
    return btn;
  }
  //playAgainBtn allows for resetting the grid(clearing it) so a new game can be started
  public static Button playAgainBtn(){
    Button btn = customBtnUI();
    btn.setText("Play Again");
    btn.setVisible(false);
    btn.setOnAction(e->{
      Reset.resetGrid(CreateGrid.btn);
      btn.setVisible(false);
      GameNotifications.notification.setText(""); //Clear The notification
    });
    return btn;
  }

  //quitBtn closes the game window if user decides to quit midway
  public static Button quitBtn(Stage primaryStage){
    Button btn = customBtnUI();
    btn.setText("Quit");
    btn.setOnAction(e->{
      primaryStage.close();
      System.exit(0);
    });
    return btn;
  }
  //'customBtnUI': sets the appearance of the play-again and quit buttons
  private static Button customBtnUI() {
    Button btn = new Button();
    btn.setPrefSize(150,50);
    btn.setStyle("""
      -fx-font-size:18;  -fx-border-color:black;  -fx-border-width:4; 
      -fx-background-color:lightblue;  -fx-font-color:black;       
    """);
    return btn;
  }

}
