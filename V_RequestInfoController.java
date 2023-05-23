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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class V_RequestInfoController implements Initializable {
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

    @FXML
    private void changeScene(MouseEvent event) {
    }

    @FXML
    private void Cancel(ActionEvent event) throws IOException {
        
        
        Parent root = FXMLLoader.load(getClass().getResource("V_AcceptRequest_4.fxml"));
        scene  = new Scene(root); 
        stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();    
       
    }

    @FXML
    private void AcceptReq_V(ActionEvent event) {
        //this needs code to check what type of call eldery wants then tranfer to the chosen call page
    }

    @FXML
    private void GoToMore_V(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("V_More_00.fxml"));
        scene  = new Scene(root); 
        stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();    
    }

    @FXML
    private void GoToRequest_V(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("V_AllRequest_7.fxml"));
        scene  = new Scene(root); 
        stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void BackToHome_V(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("V_AcceptRequest_4.fxml"));
        scene  = new Scene(root); 
        stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
}
