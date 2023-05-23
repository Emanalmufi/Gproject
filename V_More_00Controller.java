/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ehtiwaa;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class V_More_00Controller implements Initializable {

   
   private Stage stage;
   private Scene scene;
   private Parent root;
    
    Button homepageAllmorebtn;
    /**
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
     //E_homeButton
    @FXML
    public void BackToHome_V(ActionEvent event) throws IOException{       
        Parent root = FXMLLoader.load(getClass().getResource("V_AcceptRequest_4.fxml"));
        scene  = new Scene(root); 
        stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    } 

    //request Button
    @FXML
    public void GoToRequest_V(ActionEvent event) throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("V_AllRequest_7.fxml"));
        scene  = new Scene(root); 
        stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    } 

    //more Button
    @FXML
    public void GoToMore_V(ActionEvent event) throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("V_More_00.fxml"));
        scene  = new Scene(root); 
        stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    } 
 
    //Logout Button
    @FXML
    public void Logout_GoTowelcome_V(ActionEvent event) throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("ALL_Welcome_1.fxml"));
        scene  = new Scene(root); 
        stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    //profile Button
    @FXML
    public void GoToProfile_V(ActionEvent event) throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("V_profile1.fxml"));
        scene  = new Scene(root); 
        stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    // AbuteUs Button
    @FXML
    public void GoToAbuteUs_Page_V(ActionEvent event) throws IOException{

        Parent root = FXMLLoader.load(getClass().getResource("V_AbuteUs_0.fxml"));
        scene  = new Scene(root); 
        stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }


    public void ShareApp(ActionEvent actionEvent) {
        String space = "%20";
        String line = "%0D%0A";

        Desktop desktop;
        if (Desktop.isDesktopSupported()
                && (desktop = Desktop.getDesktop()).isSupported(Desktop.Action.MAIL)) {
            URI mailto = null;
            try {
                String link = "https://www.google.com/";

                String body = "مرحبا." + line +
                        "أعزائنا" +  space +
                        "الكرام." + line +
                        "حملوا" + space +
                        "برنامجنا" + space +
                        "عبر" + space +
                        "الرابط" + space +
                        "التالي:" + line + line +
                        link;

                mailto = new URI("mailto:?subject=Hello%20World&body="+body);
                try {
                    desktop.mail(mailto);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            } catch (URISyntaxException e) {
                throw new RuntimeException(e);
            }
        } else {
            // TODO fallback to some Runtime.exec(..) voodoo?
            throw new RuntimeException("desktop doesn't support mailto; mail is dead anyway ;)");
        }
    }
}