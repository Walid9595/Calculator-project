package application;


import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application
{
private String s="";
double val1,val2;
boolean add,sub,div,mul,sqr,prec,ex;
BorderPane pane1=new BorderPane();
GridPane pane=new GridPane();
	@Override
	public void start(Stage primaryStage)
	   {	
		
		Buttons_Builder buttons = new Buttons_Builder();
		pane.setPadding(new Insets(10,10, 10, 10));
		pane.setHgap(10);
		pane.setVgap(10);
		pane.setStyle("-fx-background-color:rgb(230,230,230)");
		
		TextField tf=buttons.txtfield();
		tf.prefWidthProperty().bind(pane1.widthProperty().divide(4));
		tf.prefHeightProperty().bind(pane1.heightProperty().divide(4));
		Button bt0=buttons.zero();
		bt0.prefWidthProperty().bind(pane.widthProperty().divide(4));
		bt0.prefHeightProperty().bind(pane.heightProperty().divide(4));
		Button bt1=buttons.one();
		bt1.prefWidthProperty().bind(pane.widthProperty().divide(4));
		bt1.prefHeightProperty().bind(pane.heightProperty().divide(4));
		Button bt2=buttons.two();
		bt2.prefWidthProperty().bind(pane.widthProperty().divide(4));
		bt2.prefHeightProperty().bind(pane.heightProperty().divide(4));
		Button bt3=buttons.three();
		bt3.prefWidthProperty().bind(pane.widthProperty().divide(4));
		bt3.prefHeightProperty().bind(pane.heightProperty().divide(4));
		Button bt4=buttons.four();
		bt4.prefWidthProperty().bind(pane.widthProperty().divide(4));
		bt4.prefHeightProperty().bind(pane.heightProperty().divide(4));
		Button bt5=buttons.five();
		bt5.prefWidthProperty().bind(pane.widthProperty().divide(4));
		bt5.prefHeightProperty().bind(pane.heightProperty().divide(4));
		Button bt6=buttons.six();
		bt6.prefWidthProperty().bind(pane.widthProperty().divide(4));
		bt6.prefHeightProperty().bind(pane.heightProperty().divide(4));
		Button bt7=buttons.seven();
		bt7.prefWidthProperty().bind(pane.widthProperty().divide(4));
		bt7.prefHeightProperty().bind(pane.heightProperty().divide(4));
		Button bt8=buttons.eight();
		bt8.prefWidthProperty().bind(pane.widthProperty().divide(4));
		bt8.prefHeightProperty().bind(pane.heightProperty().divide(4));
		Button bt9=buttons.nine();
		bt9.prefWidthProperty().bind(pane.widthProperty().divide(4));
		bt9.prefHeightProperty().bind(pane.heightProperty().divide(4));
		Button add=buttons.add();
		add.prefWidthProperty().bind(pane.widthProperty().divide(4));
		add.prefHeightProperty().bind(pane.heightProperty().divide(4));
		Button sub=buttons.sub();
		sub.prefWidthProperty().bind(pane.widthProperty().divide(4));
		sub.prefHeightProperty().bind(pane.heightProperty().divide(4));
		Button mult=buttons.mul();
		mult.prefWidthProperty().bind(pane.widthProperty().divide(4));
		mult.prefHeightProperty().bind(pane.heightProperty().divide(4));
		Button div=buttons.div();
		div.prefWidthProperty().bind(pane.widthProperty().divide(4));
		div.prefHeightProperty().bind(pane.heightProperty().divide(4));
		Button equ=buttons.equal();
		equ.prefWidthProperty().bind(pane.widthProperty().divide(4));
		equ.prefHeightProperty().bind(pane.heightProperty().divide(4));
		Button par1=buttons.leftPar();
		par1.prefWidthProperty().bind(pane.widthProperty().divide(4));
		par1.prefHeightProperty().bind(pane.heightProperty().divide(4));
		Button par2=buttons.rightPar();
		par2.prefWidthProperty().bind(pane.widthProperty().divide(4));
		par2.prefHeightProperty().bind(pane.heightProperty().divide(4));
		Button dot=buttons.dot();
		dot.prefWidthProperty().bind(pane.widthProperty().divide(4));
		dot.prefHeightProperty().bind(pane.heightProperty().divide(4));
		Button mod=buttons.mod();
		mod.prefWidthProperty().bind(pane.widthProperty().divide(4));
		mod.prefHeightProperty().bind(pane.heightProperty().divide(4));
		Button sq=buttons.square();
		sq.prefWidthProperty().bind(pane.widthProperty().divide(4));
		sq.prefHeightProperty().bind(pane.heightProperty().divide(4));
		Button sqrt=buttons.sqRoot();
		sqrt.prefWidthProperty().bind(pane.widthProperty().divide(4));
		sqrt.prefHeightProperty().bind(pane.heightProperty().divide(4));
		Button dec =buttons.decimal();
		dec.prefWidthProperty().bind(pane.widthProperty().divide(4));
		dec.prefHeightProperty().bind(pane.heightProperty().divide(4));
		Button min =buttons.min();
		min.prefWidthProperty().bind(pane.widthProperty().divide(4));
		min.prefHeightProperty().bind(pane.heightProperty().divide(4));
		Button del=buttons.delete();
		del.prefWidthProperty().bind(pane.widthProperty().divide(4));
		del.prefHeightProperty().bind(pane.heightProperty().divide(4));
		Button cl=buttons.clear();
		cl.prefWidthProperty().bind(pane.widthProperty().divide(4));
		cl.prefHeightProperty().bind(pane.heightProperty().divide(4));
		 

		

		pane.add(mod, 0, 0);
		pane.add(sqrt, 1, 0);
		pane.add(sq, 2, 0);
		pane.add(dec, 3, 0);
		
		pane.add(cl, 0, 1);
		pane.add(del, 1, 1);
		pane.add(div, 3, 1);
		
		
		pane.add(bt7, 0, 2);
		pane.add(bt8,1, 2);
		pane.add(bt9,2, 2);
		pane.add(mult,3, 2);
		
		
		pane.add(bt4, 0, 3);
		pane.add(bt5, 1, 3);
		pane.add(bt6, 2, 3);
		pane.add(sub, 3, 3);
		
		
		pane.add(bt1,0,4);
		pane.add(bt2,1,4);
		pane.add(bt3, 2,4);
		pane.add(add, 3,4);
		
		
		pane.add(min,0,5);
		pane.add(bt0,1,5);
		pane.add(dot,2, 5);
		pane.add(equ,3,5);

		pane1.setTop(tf);
		pane1.setCenter(pane);

		

		Scene scene = new Scene(pane1,350,350);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setTitle("Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
    public static void main(String[] args)
    {
        launch(args);
    }
}