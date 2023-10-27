package GameNotifications;
import javafx.scene.control.Label;

/**
 * 'class GameNotifications': used to notify a win,loss, or draw at the end of the game. The notification Label is created in the GameBoard class but is set invisible by
 * being set as in empty string. It turns visible again with the appropriate notification again only once a conclusion to the game has been reached.
 */
public class GameNotifications {

    public static Label notification = new Label();
  public static Label createNotification(){
    notification.setStyle("""
      -fx-text-fill:black; -fx-font-size:20;
    """);
    notification.setText("");
    return notification;
  }

  public static void userWon(){ notification.setText("Congrats! You Won! Play Again?");  }
  public static void computerWon(){ notification.setText("Sorry! You Lose! Play Again?");  }
  public static void draw(){ notification.setText("Its a Draw! Play Again?");  }
}
