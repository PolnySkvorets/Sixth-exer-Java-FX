package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Text text1 = new Text(); //создание текстового объекта
        //настройка шрифта
        text1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.ITALIC, 50));
        //установка позиции текста
        text1.setX(50);
        text1.setY(130);
        text1.setFill(Color.SALMON);
        // интервалы символов
        text1.setStrokeWidth(2);
        text1.setStroke(Color.AZURE);
        text1.setText("Simple text");
        text1.setUnderline(true);
        Text text2 = new Text( 50.0, 200.0, "Text2" );
        text2.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        text2.setStrikethrough(true);
        Group root = new Group(text1, text2);
        Scene scene = new Scene(root, 600, 300);
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Text");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
