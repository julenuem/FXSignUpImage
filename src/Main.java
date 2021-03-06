import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Clase principal de la aplicación
 * @author Julen Bujanda
 */
public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("view/SignUp.fxml"));
        Font.loadFont(Main.class.getResource("fonts/TitilliumWeb-Regular.ttf").toExternalForm(), 20);
        primaryStage.setTitle("Sign Up");
        primaryStage.getIcons().add(new Image("img/tablet.png"));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(new Scene(root, 900, 500));
        primaryStage.show();
    }

}
