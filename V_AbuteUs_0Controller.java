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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class V_AbuteUs_0Controller implements Initializable {
      private Stage stage;
      private Scene scene;
      private Parent root;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
     //V_homeButton
    public void BackToHome_V(ActionEvent event) throws IOException{       
        Parent root = FXMLLoader.load(getClass().getResource("V_AcceptRequest_4.fxml"));
        scene  = new Scene(root); 
        stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    } 

    //V-request Button
    public void GoToRequest_V(ActionEvent event) throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("V_AllRequest_7.fxml"));
        scene  = new Scene(root); 
        stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    } 

    //V-more Button
    public void GoToMore_V(ActionEvent event) throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("V_More_00.fxml"));
        scene  = new Scene(root); 
        stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    } 
    
    
}
