import javafx.animation.FillTransition;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {
    public static void main(String[] args) { launch(args); }

    public void start(Stage primaryStage){



        //VARIABLES
              //backgroung
        Rectangle bigBlack=new Rectangle(400,0,400,400);
        Rectangle bigLightGrey=new Rectangle(400,400);

              //house
        Rectangle maisonJB=new Rectangle(150,200,100,50);
        Rectangle maisonNB=new Rectangle(550,200,100,50);
        Polygon maisonJT=new Polygon(200,150,255,200,145,200);
        Polygon maisonNT=new Polygon(600,150,655,200,545,200);
        Rectangle doorJ=new Rectangle(170,220,20,30);
        Rectangle doorN=new Rectangle(570,220,20,30);
        Circle poigneeJ=new Circle(185,235,4);
        Circle poigneeN=new Circle(585,235,4);
        Rectangle windowJ=new Rectangle(210,210,30,20);
        Rectangle windowN=new Rectangle(610,210,30,20);
        Line lineJ=new Line(225,210,225,230);
        Line line2J=new Line(210,220,240,220);
        Line lineN=new Line(625,210,625,230);
        Line line2N=new Line(610,220,640,220);

             //sun
        Line ray1=new Line(320,0,320,120);
        Line ray2=new Line(320,5,320,115);
        Line ray3=new Line(320,0,320,120);
        Line ray4=new Line(320,5,320,115);
        Circle sun=new Circle(320,60,30);

             //moon
        Circle moon=new Circle(720,60,30);

             //bird

             //star

             //text
        Text night=new Text(565,320,"Nuit");
        Text day=new Text(165,320,"Jour");

        //PLACEMENTS & NAMES & COLORS
             //Background
        primaryStage.setWidth(800);
        primaryStage.setHeight(400);
        primaryStage.setTitle("Le jour et la nuit");
        bigBlack.setFill(Color.BLACK);
        bigLightGrey.setFill(Color.LIGHTGREY);

             //house
        maisonJB.setFill(Color.BEIGE);
        maisonJB.setEffect(new DropShadow(10,-10,10,Color.DARKGREY));
        maisonNB.setFill(Color.BEIGE);
        maisonJT.setFill(Color.BROWN);
        maisonJT.setEffect(new DropShadow(10,-10,10,Color.DARKGREY));
        maisonNT.setFill(Color.BROWN);
        doorJ.setFill(Color.SADDLEBROWN);
        doorN.setFill(Color.SADDLEBROWN);
        poigneeJ.setFill(Color.YELLOWGREEN);
        poigneeN.setFill(Color.YELLOWGREEN);
        windowJ.setFill(Color.AQUA);
        windowJ.setStroke(Color.DARKGREY);
        windowJ.setStrokeWidth(2);
        windowN.setFill(Color.AQUA);
        windowN.setStroke(Color.DARKGREY);
        windowN.setStrokeWidth(2);
        lineJ.setStroke(Color.DARKGREY);
        lineJ.setStrokeWidth(2);
        line2J.setStroke(Color.DARKGREY);
        line2J.setStrokeWidth(2);
        lineN.setStroke(Color.DARKGREY);
        lineN.setStrokeWidth(2);
        line2N.setStroke(Color.DARKGREY);
        line2N.setStrokeWidth(2);

             //sun
        ray1.setStroke(Color.YELLOW);
        ray2.setStroke(Color.YELLOW);
        ray3.setStroke(Color.YELLOW);
        ray4.setStroke(Color.YELLOW);
        ray2.setRotate(45);
        ray3.setRotate(90);
        ray4.setRotate(135);
        sun.setFill(Color.YELLOW);
        sun.setStroke(Color.LIGHTGREY);
        sun.setStrokeWidth(5);

             //moon
        Stop[] stops=new Stop[]{
                new Stop(0,Color.WHITE),
                new Stop(1,Color.BLACK)
        };
        LinearGradient grad=new LinearGradient(0,0,1,1,
                true,CycleMethod.NO_CYCLE,stops);
        moon.setFill(grad);

             //bird

             //star

             //Text
        night.setFill(Color.WHITE);
        night.setFont(new Font(40));
        day.setFill(Color.BLACK);
        day.setFont(new Font(40));

        //ANIMATION
             //sun
        RotateTransition trans=new RotateTransition(Duration.seconds(4),ray1);
        trans.setByAngle(360);
        trans.setInterpolator(Interpolator.LINEAR);
        trans.setCycleCount(Timeline.INDEFINITE);
        trans.play();
        RotateTransition trans2=new RotateTransition(Duration.seconds(4),ray2);
        trans2.setByAngle(360);
        trans2.setInterpolator(Interpolator.LINEAR);
        trans2.setCycleCount(Timeline.INDEFINITE);
        trans2.play();
        RotateTransition trans3=new RotateTransition(Duration.seconds(4),ray3);
        trans3.setByAngle(360);
        trans3.setInterpolator(Interpolator.LINEAR);
        trans3.setCycleCount(Timeline.INDEFINITE);
        trans3.play();
        RotateTransition trans4=new RotateTransition(Duration.seconds(4),ray4);
        trans4.setByAngle(360);
        trans4.setInterpolator(Interpolator.LINEAR);
        trans4.setCycleCount(Timeline.INDEFINITE);
        trans4.play();
        FillTransition trans5=new FillTransition(Duration.seconds(4),sun);
        trans5.setFromValue(Color.YELLOW);
        trans5.setToValue(Color.ORANGE);
        trans5.setCycleCount(Timeline.INDEFINITE);
        trans5.setAutoReverse(true);
        trans5.play();


        //GROUPE
        Group root=new Group(bigBlack,bigLightGrey,maisonJT,maisonJB,maisonNB,maisonNT,doorJ,doorN,
                poigneeJ,poigneeN,windowJ,windowN,line2J,lineJ,line2N,lineN,ray1,ray2,ray3,ray4,sun,
                moon,night,day);
        primaryStage.setScene(
                new Scene(root)
        );

        //SHOW
        primaryStage.show();
    }
}
