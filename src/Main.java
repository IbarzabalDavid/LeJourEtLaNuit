import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Collections;

import static java.lang.StrictMath.cos;
import static java.lang.StrictMath.sin;

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
        QuadCurve bird1Left=new QuadCurve(15,110,35,70,60,95);
        QuadCurve bird1Right=new QuadCurve(105,110,85,70,60,95);
        QuadCurve bird2Left=new QuadCurve(15,110,35,70,60,95);
        QuadCurve bird2Right=new QuadCurve(105,110,85,70,60,95);

             //star
        Circle test=new Circle(400,200,200);
        test.setFill(Color.WHITE);
        Polygon star1=new Polygon(400,0, 455,138, 589,138, 475,220, 518,362, 400,280, 282,362, 325,220, 211,138, 345,138);
        Polygon star2=new Polygon(400,0, 455,138, 589,138, 475,220, 518,362, 400,280, 282,362, 325,220, 211,138, 345,138);;
        Polygon star3=new Polygon(400,0, 455,138, 589,138, 475,220, 518,362, 400,280, 282,362, 325,220, 211,138, 345,138);;
        Polygon star4=new Polygon(400,0, 455,138, 589,138, 475,220, 518,362, 400,280, 282,362, 325,220, 211,138, 345,138);;

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
        bird1Left.setFill(Color.TRANSPARENT);
        bird1Right.setFill(Color.TRANSPARENT);
        bird1Left.setStroke(Color.BLACK);
        bird1Right.setStroke(Color.BLACK);
        bird2Left.setFill(Color.TRANSPARENT);
        bird2Right.setFill(Color.TRANSPARENT);
        bird2Left.setStroke(Color.BLACK);
        bird2Right.setStroke(Color.BLACK);
        bird2Left.setTranslateX(150);
        bird2Right.setTranslateX(150);
        bird2Left.setTranslateY(-50);
        bird2Right.setTranslateY(-50);

             //star
        star1.setFill(Color.YELLOW);
        star2.setFill(Color.YELLOW);
        star3.setFill(Color.YELLOW);
        star4.setFill(Color.YELLOW);
        star1.setScaleX(0.07);
        star1.setScaleY(0.07);
        star1.setTranslateX(70);
        star1.setTranslateY(-150);
        star2.setScaleX(0.04);
        star2.setScaleY(0.04);
        star2.setTranslateX(102);
        star2.setTranslateY(-95);
        star3.setScaleX(0.07);
        star3.setScaleY(0.07);
        star3.setTranslateX(159);
        star3.setTranslateY(-115);
        star4.setScaleX(0.095);
        star4.setScaleY(0.095);
        star4.setTranslateX(219);
        star4.setTranslateY(-95);

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

             //Stars
        FadeTransition fade = new FadeTransition(Duration.seconds(2), star1);
        fade.setFromValue(1.0);
        fade.setToValue(0);
        fade.setCycleCount(Timeline.INDEFINITE);
        fade.setAutoReverse(true);
        fade.play();
        FadeTransition fade2 = new FadeTransition(Duration.seconds(2), star2);
        fade2.setFromValue(0);
        fade2.setToValue(1.0);
        fade2.setCycleCount(Timeline.INDEFINITE);
        fade2.setAutoReverse(true);
        fade2.play();
        FadeTransition fade3 = new FadeTransition(Duration.millis(1200), star3);
        fade3.setFromValue(1.0);
        fade3.setToValue(0);
        fade3.setCycleCount(Timeline.INDEFINITE);
        fade3.setAutoReverse(true);
        fade3.play();
        FadeTransition fade4 = new FadeTransition(Duration.millis(2800), star4);
        fade4.setFromValue(0);
        fade4.setToValue(1.0);
        fade4.setCycleCount(Timeline.INDEFINITE);
        fade4.setAutoReverse(true);
        fade4.play();

             //Birds
        Group birds = new Group(bird1Left, bird1Right, bird2Left, bird2Right);
        KeyValue kv1=new KeyValue(bird1Left.startYProperty(),bird1Left.getStartY()-25,Interpolator.LINEAR);
        KeyValue kv2=new KeyValue(bird1Left.endYProperty(),bird1Left.getEndY()+8,Interpolator.LINEAR);
        KeyValue kv3=new KeyValue(bird1Right.startYProperty(),bird1Right.getStartY()-25,Interpolator.LINEAR);
        KeyValue kv4=new KeyValue(bird1Right.endYProperty(),bird1Right.getEndY()+8,Interpolator.LINEAR);

        KeyValue kv5=new KeyValue(bird2Left.startYProperty(),bird2Left.getStartY()-25,Interpolator.LINEAR);
        KeyValue kv6=new KeyValue(bird2Left.endYProperty(),bird2Left.getEndY()+8,Interpolator.LINEAR);
        KeyValue kv7=new KeyValue(bird2Right.startYProperty(),bird2Right.getStartY()-25,Interpolator.LINEAR);
        KeyValue kv8=new KeyValue(bird2Right.endYProperty(),bird2Right.getEndY()+8,Interpolator.LINEAR);

        KeyFrame kf1 = new KeyFrame(Duration.seconds(1), kv2,kv1,kv4,kv3,kv6,kv5,kv8,kv7);

        Timeline timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.getKeyFrames().addAll(kf1);
        timeline.setAutoReverse(true);
        timeline.play();


        //GROUPE
        Group root=new Group(bigBlack,bigLightGrey,maisonJT,maisonJB,maisonNB,maisonNT,doorJ,doorN,
                poigneeJ,poigneeN,windowJ,windowN,line2J,lineJ,line2N,lineN,ray1,ray2,ray3,ray4,sun,
                moon,night,day,star1,star2,star3,star4,birds);
        primaryStage.setScene(
                new Scene(root)
        );

        //SHOW
        primaryStage.show();
    }

}
