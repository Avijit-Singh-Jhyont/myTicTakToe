package DisplayUI;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

/**
 * class CreateTitle writes the "Tic-Tac-Toe" heading at top of the game screen.
 */
public class CreateTitle {

  public static VBox createTitle(GridPane grid){
    Label title = new Label("Tic-Tac-Toe"); //title words
    title.setFont(new Font("Comic Sans MS",28)); //title font preferences
    VBox vBox = new VBox(title, grid);
    vBox.setAlignment(Pos.CENTER); vBox.setStyle("-fx-background-color: transparent;"); vBox.setSpacing(10);
    return vBox;
  }

}
