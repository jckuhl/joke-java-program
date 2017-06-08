/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author jonathankuhl
 */
public class JavaFXApplication1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label lbl = new Label("CLICK FOR CHEESE!");
        lbl.setTranslateX(-150);
        Label lbl2 = new Label();
        lbl2.setTranslateY(200);
        Button btn = new Button();
        btn.setText("CHEESE!");
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            int cheese = 0;
            @Override
            
            public void handle(ActionEvent event) {
                
                btn.setText("MOAR CHEESE!");
                cheese++;
                if(cheese >= 100) {
                    btn.setText("EVEN MOAR CHEESE!");
                }
                
                lbl2.setText("YOU HAVE " + cheese + " POUNDS OF CHEESE");
            }
        });
        
        Button btn2 = new Button();
        btn2.setTranslateX(200);
        btn2.setTranslateY(200);
        btn2.setText("EXIT NAO");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        root.getChildren().add(btn2);
        root.getChildren().add(lbl);
        root.getChildren().add(lbl2);
        
        Scene scene = new Scene(root, 500, 500);
        
        primaryStage.setTitle("Quite Possibly the Dumbest Program Ever Written!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
