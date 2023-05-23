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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class E_Profile_P1_01Controller implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;
    
    Button homepageAllmorebtn;
    @FXML
    private TextField usarName;
    @FXML
    private TextField usarName1;
    @FXML
    private TextField usarName11;
    @FXML
    private TextField usarName111;
    @FXML
    private TextField usarName1111;
    /**
     * Initializes the controller class.
    */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
        //E_homeButton
    @FXML
    public void BackToHome_E(ActionEvent event) throws IOException{       
        Parent root = FXMLLoader.load(getClass().getResource("E_CreateRequest_4.fxml"));
        scene  = new Scene(root); 
        stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    } 

    //request Button
    @FXML
    public void GoToRequest_E(ActionEvent event) throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("E_AllRequest_7.fxml"));
        scene  = new Scene(root); 
        stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    } 

    //more Button
    @FXML
    public void GoToMore_E(ActionEvent event) throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("E_More_00.fxml"));
        scene  = new Scene(root); 
        stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    } 
 
    //profile Button

    @FXML
    private void GoToProfile2_E(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("E_Profile_P2_01.fxml"));
        scene  = new Scene(root); 
        stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    

    
}
