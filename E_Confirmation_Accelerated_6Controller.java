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
public class E_Confirmation_Accelerated_6Controller implements Initializable {
   private Stage stage;
   private Scene scene;
   private Parent root;
    @FXML
    private Button login121;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

  
    @FXML
    private void singin(ActionEvent event) {
    }
         
    
     //bar buttons
    //main icon
     @FXML
    public void BackToHomePage(ActionEvent event) throws IOException{
           // Parent root = FXMLLoader.load(getClass().getResource("E_AllRequest_7.fxml"));
           // Scene Erequestscene = new Scene (root);
            //Stage homepagescene = (Stage) ((Node) event.getSource()).getScene().getWindow();
           // homepagescene.setScene(Erequestscene);
           // homepagescene.show();
           
      Parent root = FXMLLoader.load(getClass().getResource("E_CreateRequest_4.fxml"));
      scene  = new Scene(root); 
      stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.setScene(scene);
      stage.show();
        } 
    

    
    
    
    //request icon
     @FXML
     public void GoToRequest(ActionEvent event) throws IOException{

      Parent root = FXMLLoader.load(getClass().getResource("E_AllRequest_7.fxml"));
      scene  = new Scene(root); 
      stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.setScene(scene);
      stage.show();
        } 

 
   
    //more icon
    @FXML
     public void GoToMore(ActionEvent event) throws IOException{

      Parent root = FXMLLoader.load(getClass().getResource("E_More_00.fxml"));
      scene  = new Scene(root); 
      stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.setScene(scene);
      stage.show();
}
    
    
    
    
}

