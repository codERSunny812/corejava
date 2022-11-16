package com.example.javafx.javafx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Collection;

import static javafx.application.Application.launch;

public class Controller extends Application {
    public static void main(String [] args){

        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        System.out.println("Start");

        FXMLLoader loader = new
                FXMLLoader(getClass().getResource(" layoutapp.fxml"));
        VBox rootNode = loader.load();

        //menu is created
        MenuBar menuBar = createMenu();
//to get all the menu on the app layout
        rootNode.getChildren().addAll(menuBar);

        Scene scene = new Scene(rootNode);

        primaryStage.setScene(scene);
        ///used to set the title of the app
        primaryStage.setTitle(" Hola coder's ");
        primaryStage.show();

    }
    private MenuBar createMenu(){


        //file menu
        Menu fileMenu = new Menu("File");

//        items is added to the file menu

        MenuItem newMenuItem = new MenuItem("New");

//click event is added  the new menu
//        click event is added to the this

//        newMenuItem.setOnAction(event -> System.out.println(" new menu is clicked  "));





        newMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println(" item is clicked which is present in new item  ");
            }
        });


//       it's used  to add separator(lines) between the items

        SeparatorMenuItem separatorMenuItem =  new SeparatorMenuItem();



        //another item is added to the file menu




        MenuItem quitItem = new MenuItem("Quit");

        //        NOW LET'S USE LAMBDA
//        quitItem.setOnAction(event -> {
//            System.out.println("quit is clicked ");
//            Platform.exit(); //used to shut dowm the app
//            System.exit();
//
//        }    );

        quitItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("quit is clicked ");
                Platform.exit(); //used to shut dowm the app
//                System.exit();
            }
        });








        //help menu

        Menu helpMenu =new Menu("Help");
        MenuItem aboutApp= new MenuItem("About");
        helpMenu.getItems().addAll(aboutApp);
        aboutApp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                aboutApp();
            }

            private void aboutApp() {
                //write something

            }
        });


        //menu bar
        MenuBar MenuBar = new MenuBar();
        MenuBar.getMenus().addAll(fileMenu,helpMenu);



        return MenuBar;

    }


}
