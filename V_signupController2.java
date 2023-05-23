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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author huawei
 */
public class V_signupController2 implements Initializable {

    @FXML
    public TextField qualification;
    @FXML
    public TextField password;
    @FXML
    public TextField confirmPassword;

    @FXML
    public Label qualificationError;
    @FXML
    public Label passwordError;
    @FXML
    public Label confirmPasswordError;



    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    private Stage stage;
    private Scene scene;
    private Parent root;


    @FXML
    private Label AskForAudioCall;

    @FXML
    private RadioButton YesAnswer, NoAnswer;

    @FXML
    private void UploadDegree_V(ActionEvent event) {
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
    private void BackSignUp1_V(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("V_signup.fxml"));
        scene  = new Scene(root);
        stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void SignUp_V(ActionEvent event) throws IOException {
        if (CheckInput()) {

            Parent root = FXMLLoader.load(getClass().getResource("V_AcceptRequest_4.fxml"));
            scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
    }

    private boolean CheckInput() {
        String qualificationText = qualification.getText().trim();
        String passwordText = password.getText().trim();
        String confirmPasswordText = confirmPassword.getText().trim();

        if (qualificationText.isEmpty()) {
            qualificationError.setText("هذا الحقل مطلوب");
            qualificationError.setVisible(true);
        } else if (!IsInputString(qualificationText)) {
            qualificationError.setText("هذا الحقل يقبل حروف فقط");
            qualificationError.setVisible(true);
        } else {
            qualificationError.setVisible(false);
        }

        passwordError.setVisible(passwordText.isEmpty());

        if (confirmPasswordText.isEmpty()) {
            confirmPasswordError.setText("هذا الحقل مطلوب");
            confirmPasswordError.setVisible(true);
        } else if (!confirmPasswordText.equals(passwordText)) {
            confirmPasswordError.setText("كلمات المرور غير متطابقة");
            confirmPasswordError.setVisible(true);
        } else {
            confirmPasswordError.setVisible(false);
        }

        return (!qualificationText.isEmpty() && IsInputString(qualificationText)) &&
                !passwordText.isEmpty() &&
                (!confirmPasswordText.isEmpty() &&
                confirmPasswordText.equals(passwordText));
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
