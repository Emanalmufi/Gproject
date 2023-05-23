/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ehtiwaa;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class ALL_Welcome_1Controller implements Initializable {
   private Stage stage;
   private Scene scene;
   private Parent LoginPageV;
   
      private Button Vbtn;
      private Button Ebtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    /*      @FXML 
        public void GoToLoginE(ActionEvent event) throws IOException {
      Parent root = FXMLLoader.load(getClass().getResource("E_Login_2.fxml"));
      scene  = new Scene(root); 
      stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.setScene(scene);
      stage.show();
        }*/
       /*       @FXML 
       public void GoToLoginV(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("V_Login_2.fxml"));
      scene  = new Scene(root); 
      stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.setScene(scene);
      stage.show();
           
       }*/
       @FXML
    public void GoToLoginE(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("E_Login_2.fxml"));
        Parent root = loader.load();
        //ALL_Welcome_1Controller controller = loader.getController();
       // controller.display(); 
        scene  = new Scene(root); 
      stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.setScene(scene);
      stage.show();
    }
    
    
    
           @FXML
    public void GoToLoginV(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("V_Login_2.fxml"));
        Parent root = loader.load();
        //ALL_Welcome_1Controller controller = loader.getController();
       // controller.display(); 
        scene  = new Scene(root); 
       stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
       stage.setScene(scene);
       stage.show();
    }
}
