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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class E_signup2Controller implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;


    @FXML
    public TextField password;
    @FXML
    public TextField confirmPassword;

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

    @FXML
    private void ModifyPage(ActionEvent event) {

    }

    @FXML
    public void BackToSignup1_E(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("E_signup1.fxml"));
        scene  = new Scene(root);
        stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }




    //main icon
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
    private void GoToSignUp1_E(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("E_signup1.fxml"));
        scene  = new Scene(root);
        stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    private void SignUP_E(ActionEvent event) throws IOException {
        if (CheckInput()) {
            // go to another scene..
            Parent root = FXMLLoader.load(getClass().getResource("E_CreateRequest_4.fxml"));
            scene  = new Scene(root);
            stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
    }

    private boolean CheckInput() {
        String passwordText = password.getText().trim();
        String confirmPasswordText = confirmPassword.getText().trim();

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

        return !passwordText.isEmpty() &&
                (!confirmPasswordText.isEmpty() &&
                confirmPasswordText.equals(passwordText));
    }
}