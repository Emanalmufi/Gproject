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
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class E_Profile_P2_01Controller implements Initializable {
   private Stage stage;
   private Scene scene;
   private Parent root;
    @FXML
    private Label AnswerHealthQ;
    
    @FXML
   private RadioButton YesAnswer, NoAnswer;
   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    //profile Button
    
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


    @FXML
    public void GoToProfile1_E(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("E_Profile_P1_01.fxml"));
        scene  = new Scene(root); 
        stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        
    }

       @FXML
       public void AnswerHealthQ(ActionEvent event) {
       
         /*    if(YesAnswer.isSelected()) {
             AnswerHealthQ.setText(YesAnswer.getText());
             }
                 else if(NoAnswer.isSelected()) {
                  AnswerHealthQ.setText(NoAnswer.getText());
                  }*/
         }

  




    
}
