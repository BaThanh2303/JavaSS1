package javafx;

import database.Connector;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.mindrot.jbcrypt.BCrypt;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Main extends Application {

    public static void main(String[] args) {
        //add users with hash password
            String name = "abc xyz";
            String email = "abcxyz@gmail.com";
            String pwd = "1234";
            //hash password
            String salt = BCrypt.gensalt();
            String hashedPwd = BCrypt.hashpw(pwd,salt);
            //save to db
//            String sql = "insert into users(name,email,password) values(?,?,?)";
//            try {
//                Connection conn = Connector.getInstance().getConn();
//                PreparedStatement ptt = conn.prepareStatement(sql);
//                ptt.setString(1,name);
//                ptt.setString(2,email);
//                ptt.setString(3,hashedPwd);
//                ptt.executeUpdate();












































































//            }catch (Exception e){
//
//            }
        System.out.println(hashedPwd);
        launch(args);
    }
    public static Stage mainStage;
    @Override
    public void start(Stage primaryStage) throws Exception {
        mainStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        primaryStage.setScene(new Scene(root,800,600));
        primaryStage.setTitle("T2210A JavaFX Demo");
        primaryStage.show();
    }
}