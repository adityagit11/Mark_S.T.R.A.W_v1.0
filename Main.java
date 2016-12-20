import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application
{
	public static WebDriver driver;
	public static void main(String args[])
	{
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium Webdriver Files\\geckodriver.exe");
		driver = new FirefoxDriver();
		launch();
	}
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		Button start = new Button("Start Facebook!");
		//adding actions to button btn
		start.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent ev)
			{
				try {
					facebookAutomate.initiateFacebookLogin(driver);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Button profile = new Button("My Profile");
		profile.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent ev)
			{
				facebookAutomate.clickProfile(driver);
			}
		});
		
		VBox root = new VBox();
		root.getChildren().addAll(start,profile);
		
		Scene sc = new Scene(root,200,200);
		
		primaryStage.setScene(sc);
		primaryStage.setTitle("My room");
		primaryStage.show();
	}
}