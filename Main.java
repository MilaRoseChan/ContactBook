package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("contact.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static Scanner scanner = new Scanner(System.in);
    public static ContactBook contactBook = new ContactBook("Mila Rose","+4475704422");


    public static void main(String[] args) {
        launch(args);

        boolean quit = false;

        while (!quit){
            System.out.println("Controls");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    quit = true;
                    break;
                case 1:
                    //add contact
                    break;
                case 2:
                    //remove contact
                    break;
                case 3:
                    //search contact
                case 4:
                    //update contact details
                case 5:
                    //Show all contacts
                    break;
                case 6:
                    //show controls again
                    break;
                default:
                        System.out.println("Please enter a correct input 6 to show controls");
                    break;


            }
        }






    }
}
