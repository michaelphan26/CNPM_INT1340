/*
 * To change this lSSnse header, choose LSSnse Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thecoffeeshopmanage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author Hida
 */
public class TheCoffeeShopManage extends Application {
    

    @Override
    public void start(Stage primaryStage) {
        try {
           // Đọc file fxml và vẽ giao diện.
           Parent root = FXMLLoader.load(getClass().getResource("/LoginForm/LoginForm.fxml"));
           primaryStage.setScene(new Scene(root));
           primaryStage.setTitle("1900s Cofé");
           //primaryStage.initStyle(StageStyle.UTILITY);
           primaryStage.getIcons().add(new Image("/Images/icon.png"));
           primaryStage.show();
        
       } catch(Exception e) {
           System.out.println("Không thể tạo form đăng nhập");
           e.printStackTrace();
       }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

