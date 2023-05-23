package ehtiwaa;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TouchEvent;
import javafx.stage.Stage;
import javafx.util.Duration;
/**
 * FXML Controller class
 *
 * @author hp
 */
public class ALL_LogoController implements Initializable {
   private Stage stage;
   private Scene scene;
   private Parent root;
    @FXML
    private ImageView ehtiwa;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         //translate
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(ehtiwa);
        translate.setDuration(Duration.millis(1200));
        translate.setByY(-290);
        translate.play();

    } 
    
    public void changeScene(MouseEvent event)throws IOException{
           //     Parent root = FXMLLoader.load(getClass().getResource("ALL_Welcome_1.fxml"));
          //      Scene roott = new Scene(root);    
          //      Stage Window = (Stage) ((Node) event.getSource()).getScene().getWindow();
          //      Window.setScene(roott);
          //      Window.show();
          
          
       Parent root = FXMLLoader.load(getClass().getResource("ALL_Welcome_1.fxml"));
      scene  = new Scene(root); 
      stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.setScene(scene);
      stage.show();
                
    }
    
  
}
