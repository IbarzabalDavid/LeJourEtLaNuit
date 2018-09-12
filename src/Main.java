import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) { launch(args); }

    public void start(Stage primaryStage){



        //VARIABLES
        Rectangle bigBlack=new Rectangle(400,0,400,400);
        Rectangle bigLightGrey=new Rectangle(400,400);
        Rectangle maisonJB=new Rectangle(150,200,100,70);
        Rectangle maisonNB=new Rectangle(550,200,100,70);

        //PLACEMENTS & NAMES
        primaryStage.setWidth(800);
        primaryStage.setHeight(400);
        primaryStage.setTitle("Le jour et la nuit");
        bigBlack.setFill(Color.BLACK);
        bigLightGrey.setFill(Color.LIGHTGREY);
        maisonJB.setFill(Color.BEIGE);
        maisonNB.setFill(Color.BEIGE);

        //GROUPE
        Group root=new Group(bigBlack,bigLightGrey,maisonJB,maisonNB);
        primaryStage.setScene(
                new Scene(root)
        );

        //SHOW
        primaryStage.show();
    }
}
