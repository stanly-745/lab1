import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MyjavaFXApp2 extends Application
{
@ Override
public void start(Stage stage)
{
MenuBar menuBar = new MenuBar();

Menu fileMenu= new Menu("File");
Menu editMenu= new Menu("Edit");
Menu aboutMenu= new Menu("About");

MenuItem newitem=new MenuItem("New");
MenuItem openfileitem=new MenuItem("Open file");
MenuItem saveitem=new MenuItem("Save");
MenuItem exititem=new MenuItem("Exit");

MenuItem cutitem=new MenuItem("Cut");
MenuItem copyitem=new MenuItem("Copy");
MenuItem pasteitem=new MenuItem("Paste");

fileMenu.getItems().addAll(newitem,openfileitem,saveitem,exititem);
editMenu.getItems().addAll(cutitem,copyitem,pasteitem);

menuBar.getMenus().addAll(fileMenu,editMenu,aboutMenu);

BorderPane root= new BorderPane();

root.setTop(menuBar);
Scene scene= new Scene(root,400,300);

stage.setTitle("JavaFX Menu Demo");
stage.setScene(scene);
stage.show();
}
public static void main(String[] args)
{
Application.launch(args);

}
}