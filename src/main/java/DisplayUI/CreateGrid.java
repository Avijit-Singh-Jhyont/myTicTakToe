package DisplayUI;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

/**
 * Class CreateGrid creates and customizes a global btn matrix to used in GameBoard
 */
public class CreateGrid {
  //A global btn matrix that serves as the grid the user plays on
  public static Button[][] btn = new Button[3][3];
  //The actual method where the creating of the grid takes place via use of the global btn matrix
  public static GridPane createGrid(){
    GridPane grid=new GridPane();
    grid.setAlignment(Pos.CENTER); grid.setHgap(2); grid.setVgap(2); grid.setStyle("-fx-background-color: transparent;"); //set preferences for the grid
    for(int i=0; i<3; i++) //uses createBtn to create,customize,and add the btn matrix to the grid
      for(int j=0; j<3; j++){  btn[i][j]=CreateBtn.createBtn(btn[i][j],grid); grid.add(btn[i][j], j, i);  }
    return grid;
  }

}
