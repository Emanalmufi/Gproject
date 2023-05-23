package ehtiwaa;

import java.io.File;
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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class V_signup1Controller implements Initializable {
   private Stage stage;
   private Scene scene;
   private Parent root;


    @FXML
    public TextField userName;
    @FXML
    public TextField nationality;
    @FXML
    public TextField idNumber;
    @FXML
    public TextField phoneNumber;
    @FXML
    public TextField city;

    @FXML
    public Label userNameError;
    @FXML
    public Label nationalityError;
    @FXML
    public Label idNumberError;
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
    private void GoToSugnU2_V(ActionEvent event) throws IOException {
       if (CheckInput()) {
           Parent root = FXMLLoader.load(getClass().getResource("V_signup2.fxml"));
           scene = new Scene(root);
           stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           stage.setScene(scene);
           stage.show();
       }
    }

    @FXML
    private void UploPic_V(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        File selectedFile = fileChooser.showOpenDialog(stage);

        if (selectedFile != null) {
            // Process the selected file
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
        } else {
            System.out.println("No file selected.");
        }
    }

    @FXML
    private void BackToPage_V(ActionEvent event) throws IOException {
        
      Parent root = FXMLLoader.load(getClass().getResource("V_Login_2.fxml"));
      scene  = new Scene(root); 
      stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.setScene(scene);
      stage.show();
    }


    private boolean CheckInput() {
        String userNameText = userName.getText().trim();
        String nationalityText = nationality.getText().trim();
        String phoneNumberText = phoneNumber.getText().trim();
        String idNumberText = idNumber.getText().trim();
        String cityText = city.getText().trim();

        userNameError.setVisible(userNameText.isEmpty());

        if (nationalityText.isEmpty()) {
            nationalityError.setText("هذا الحقل مطلوب");
            nationalityError.setVisible(true);
        } else if (!IsInputString(nationalityText)) {
            nationalityError.setText("هذا الحقل يقبل حروف فقط");
            nationalityError.setVisible(true);
        } else {
            nationalityError.setVisible(false);
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
        } else if (!phoneNumberText.startsWith("05")) {
            phoneNumberError.setText("يجب أن يبدأ الرقم بـ 05");
            phoneNumberError.setVisible(true);
        } else {
            phoneNumberError.setVisible(false);
        }

        if (idNumberText.isEmpty()) {
            idNumberError.setText("هذا الحقل مطلوب");
            idNumberError.setVisible(true);
        } else if (!IsInputNumber(idNumberText)) {
            idNumberError.setText("هذا الحقل يقبل أرقام فقط");
            idNumberError.setVisible(true);
        } else {
            idNumberError.setVisible(false);
        }

        return !userNameText.isEmpty() &&
                (!nationalityText.isEmpty() && IsInputString(nationalityText)) &&
                (!cityText.isEmpty() && IsInputString(cityText)) &&
                (!phoneNumberText.isEmpty() && IsInputNumber(phoneNumberText)
                        && phoneNumberText.length() == 10 && phoneNumberText.startsWith("05")) &&
                (!idNumberText.isEmpty() && IsInputNumber(idNumberText));
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