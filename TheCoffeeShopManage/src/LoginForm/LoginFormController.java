
package LoginForm;

import Controller.DAO;
import MenuForm.MenuFormController;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Hida
 */
public class LoginFormController implements Initializable {
    @FXML public Pane boxHi;
    @FXML public Label lblPosition;
    @FXML Label lblNameAccount;
    @FXML public AnchorPane MainPane;
    @FXML public AnchorPane imagePane;
    @FXML public AnchorPane boxLogin;
    @FXML public Label lblExit;  
    @FXML public TextField txtUsername;
    @FXML public TextField txtPassword;
    @FXML public Button btnLogin; 
    @FXML private Label lblError;
    @FXML private AnchorPane rootPane; 
    @FXML private Button btnLogout;
    @FXML private Pane avatar;

        
    
    @FXML
    private void Cliked(MouseEvent event) throws InterruptedException{
        
       
        
       if(event.getSource() == btnLogin){
           if(login().equals("Success")){
               
               System.out.println("ok");
           }
           
       }
    }
    
    public LoginFormController(){
        con = DAO.Connect();
    }
    
    Connection con = null;
    PreparedStatement preparedStatement = null;    
    ResultSet resultSet = null;
    
    public String login(){
        String status = "Success";
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        String position = null;
        if(username.isEmpty() || password.isEmpty()) {
            setLblError(Color.TOMATO, "Chưa điền tài khoản/mật khẩu");
            status = "Error";
        }else{
            String sql1 = "SELECT * FROM ACCOUNT Where USERNAME = ? and PASSWORD = ? ";
            try {
                preparedStatement = con.prepareStatement(sql1);
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
           
                resultSet = preparedStatement.executeQuery();
                if (!resultSet.next()) {
                    setLblError(Color.TOMATO, "Sai tài khoản/mật khẩu");
                    status = "Error";
                } 
                else if(resultSet.getString("AccountStatus").equals("Disable")) {
                    setLblError(Color.TOMATO, "Sai tài khoản/mật khẩu");
                    status = "Error";
                }
                else{   
                    position = resultSet.getString("Position");
                    System.out.println(position);
                    if(position.equalsIgnoreCase("Nhân viên")){
                        setLblError(Color.rgb(123, 187, 20), "Đăng nhập thành công, chức vụ: Nhân Viên");
                        lblPosition.setText("Nhân viên");
                    }
                    else if (position.equalsIgnoreCase("Quản lý")){
                        setLblError(Color.rgb(123, 187, 20), "Đăng nhập thành công, chức vụ: Quản Lý ");
                        lblPosition.setText("Quản lý");
                    }
                    String name=resultSet.getString("Name");
                    lblNameAccount.setText(name);
                    loadSplashScreen(name, position, username);
                    
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
                status = "Exception";
            }
        }
        
        return status;
    }    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
          
    }
    
    public void logout(MouseEvent event){
        if(event.getSource() == btnLogout ){ 
            try {
                AnchorPane pane = FXMLLoader.load(getClass().getResource("/LoginForm/LoginForm.fxml"));
                MainPane.getChildren().setAll(pane);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public void autoLogout(boolean check){
        if(check==true){
            try {
                AnchorPane pane = FXMLLoader.load(getClass().getResource("/LoginForm/LoginForm.fxml"));
                MainPane.getChildren().setAll(pane);
            } catch(Exception e) {
                e.printStackTrace();
                System.out.println("Lỗi auto logout");
            }
        }
    }
    
    public void setLblError(Color color, String text){
        lblError.setTextFill(color);
        lblError.setText(text);
        System.out.println(text);
    }
    
    public void enter(KeyEvent ev){
        if(ev.getCode()== KeyCode.ENTER){
            System.out.println("ok");
            if(login().equals("Success")){
                txtUsername.setText("");
               System.out.println("ok");
           }  
        }
    }
    private void loadSplashScreen(String name, String position, String username) {
    try {
        avatar.setVisible(false);
        boxLogin.setVisible(false);
        imagePane.setVisible(false);
        //Load splash screen view FXML
        rootPane.setVisible(true);
        AnchorPane pane = FXMLLoader.load(getClass().getResource(("/SplashScreen/SplashScreen.fxml")));        
        //Add it to root container (Can be StackPane, AnchorPane etc)
        rootPane.getChildren().setAll(pane);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/MenuForm/MenuForm.fxml"));
        Parent root = loader.load();
        //Load splash screen with fade in effect
        FadeTransition fadeIn = new FadeTransition(Duration.seconds(3), pane);
        fadeIn.setFromValue(0);
        fadeIn.setToValue(1);
        fadeIn.setCycleCount(1);
 
        //Finish splash with fade out effect
        FadeTransition fadeOut = new FadeTransition(Duration.seconds(3), pane);
        fadeOut.setFromValue(1);
        fadeOut.setToValue(0);
        fadeOut.setCycleCount(1);
 
        fadeIn.play();
 
        //After fade in, start fade out
        fadeIn.setOnFinished((e) -> {
            fadeOut.play();
        });
 
        //After fade out, load actual content
        fadeOut.setOnFinished((e) -> {
            rootPane.getChildren().setAll(root);
            MenuFormController menuForm = loader.getController();
            menuForm.getUsername(name.toUpperCase(), position, username);
            menuForm.authorize();
        });
    } catch (IOException ex) {
        
    }
}
}


