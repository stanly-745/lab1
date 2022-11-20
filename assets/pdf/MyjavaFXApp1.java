import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class MyjavaFXApp1 extends Application
{
@Override
public void start(Stage primaryStage)
{
Button B_top=new Button("One");
Button B_center=new Button("Two");
Button B_bottom=new Button("Three");
Button B_left=new Button("Four");
Button B_right=new Button("Five");
BorderPane root=new BorderPane();
root.setTop(B_top);
root.setCenter(B_center);
root.setBottom(B_bottom);
root.setLeft(B_left);
root.setRight(B_right);
Scene scene= new Scene(root,250,250);
primaryStage.setScene(scene);
primaryStage.setTitle("BorderPaneDemo");
primaryStage.show();
}
public static void main(String[] args)
{
launch(args);
}
}