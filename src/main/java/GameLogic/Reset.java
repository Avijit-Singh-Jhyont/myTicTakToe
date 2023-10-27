package GameLogic;
import javafx.scene.control.Button;

/**
 * 'class Reset' resets the grid buttons so they clickable again and in their original un-clicked color with empty text in them.
 */
public class Reset {

  public static void resetGrid(Button[][] btn) {
    for(int i=0; i<3; i++)
      for(int j=0; j<3; j++){
        btn[i][j].setText("");
        btn[i][j].setDisable(false);
        btn[i][j].setStyle("""
          -fx-font-size: 35; -fx-border-color: black; -fx-border-width: 4;
          -fx-background-color:transparent;
        """);
      }
  }

}
