
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
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class E_signup1Controller implements Initializable {
   private Stage stage;
   private Scene scene;
   private Parent root;



    @FXML
    public TextField userName;
    @FXML
    public TextField nationality;
    @FXML
    public TextField educationLevel;
    @FXML
    public TextField phoneNumber;
    @FXML
    public TextField city;

    @FXML
    public Label userNameError;
    @FXML
    public Label nationalityError;
    @FXML
    public Label educationLevelError;
    @FXML
    public Label phoneNumberError;
    @FXML
    public Label cityError;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    public void GoToNextSingup(ActionEvent event) throws IOException {
        if (CheckInput()) {
            // go to another scene..
            Parent root = FXMLLoader.load(getClass().getResource("E_signup2.fxml"));
            scene  = new Scene(root);
            stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
    }

    @FXML
    public void BackToPage_E(ActionEvent event) throws IOException {
        
      Parent root = FXMLLoader.load(getClass().getResource("E_Login_2.fxml"));
      scene  = new Scene(root); 
      stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.setScene(scene);
      stage.show();
    }


    private boolean CheckInput() {
        String userNameText = userName.getText().trim();
        String nationalityText = nationality.getText().trim();
        String phoneNumberText = phoneNumber.getText().trim();
        String educationLevelText = educationLevel.getText().trim();
        String cityText = city.getText().trim();

        userNameError.setVisible(userNameText.isEmpty());

//        nationalityError.setVisible(nationalityText.isEmpty());
//        educationLevelError.setVisible(educationLevelText.isEmpty());
//        cityError.setVisible(cityText.isEmpty());

        if (nationalityText.isEmpty()) {
            nationalityError.setText("هذا الحقل مطلوب");
            nationalityError.setVisible(true);
        } else if (!IsInputString(nationalityText)) {
            nationalityError.setText("هذا الحقل يقبل حروف فقط");
            nationalityError.setVisible(true);
        } else {
            nationalityError.setVisible(false);
        }

        if (educationLevelText.isEmpty()) {
            educationLevelError.setText("هذا الحقل مطلوب");
            educationLevelError.setVisible(true);
        } else if (!IsInputString(educationLevelText)) {
            educationLevelError.setText("هذا الحقل يقبل حروف فقط");
            educationLevelError.setVisible(true);
        } else {
            educationLevelError.setVisible(false);
        }

        if (cityText.isEmpty()) {
            cityError.setText("هذا الحقل مطلوب");
            cityError.setVisible(true);
        } else if (!IsInputString(cityText)) {
            cityError.setText("هذا الحقل يقبل حروف فقط");
            cityError.setVisible(true);
        } else {
            cityError.setVisible(false);
        }

        if (phoneNumberText.isEmpty()) {
            phoneNumberError.setText("هذا الحقل مطلوب");
            phoneNumberError.setVisible(true);
        } else if (!IsInputNumber(phoneNumberText)) {
            phoneNumberError.setText("هذا الحقل يقبل أرقام فقط");
            phoneNumberError.setVisible(true);
        } else if (phoneNumberText.length() != 10) {
            phoneNumberError.setText("يجب أن يتكون من 10 أرقام");
            phoneNumberError.setVisible(true);
        } else {
            phoneNumberError.setVisible(false);
        }

        return !userNameText.isEmpty() &&
                (!nationalityText.isEmpty() && IsInputString(nationalityText)) &&
                (!educationLevelText.isEmpty() && IsInputString(educationLevelText)) &&
                (!cityText.isEmpty() && IsInputString(cityText)) &&
                (!phoneNumberText.isEmpty() && IsInputNumber(phoneNumberText) &&
                        phoneNumberText.length() == 10 && phoneNumberText.startsWith("05"));
    }

    private boolean IsInputNumber(String value) {
        try {
            Integer.parseInt(value);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean IsInputString(String value) {
        for (char c :
                value.toCharArray()){
            if (IsInputNumber(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }
}