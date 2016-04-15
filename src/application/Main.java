package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application
{
	@Override
	public void start(Stage primaryStage)
	{
		GridPane pane=new GridPane();
		
				  
		Scene scene = new Scene(pane,350,350);
		primaryStage.setTitle("Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();

	}
    public static void main(String[] args)
    {
        launch(args);
    }
}