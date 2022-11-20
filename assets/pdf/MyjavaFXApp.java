import java.io.FileInputStream;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class MyjavaFXApp extends Application
{
@Override
public void start(Stage primaryStage)throws Exception
{
Label L1=new Label("Enter Name");
TextField tf1=new TextField();
Label L2=new Label("Enter Password");
TextField tf2=new PasswordField();
Button btn=new Button("Submit");
GridPane root=new GridPane();
root.setVgap(10);
root.addRow(0,L1,tf1);
root.addRow(0,L2,tf2);
root.addRow(2,btn);
Scene scene= new Scene(root,300,200);
primaryStage.setTitle("Text Field Demo");
primaryStage.setScene(scene);
primaryStage.show();
}
public static void main(String[] args)
{
launch(args);
}
}