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

/**
 * FXML Controller class
 *
 * @author hp
 */
public class V_Login_2Controller implements Initializable {
 private Stage stage;
 private Scene scene;
 private Parent root;


 @FXML
 public TextField phoneNumber;
 @FXML
 public TextField password;

 @FXML
 public Label phoneNumberError;
 @FXML
 public Label passwordError;


 /**
  * Initializes the controller class.
  */
 @Override
 public void initialize(URL url, ResourceBundle rb) {
  // TODO
 }


 public void GoTologinV(ActionEvent event) throws IOException {
  if (CheckInput()) {

   Parent root = FXMLLoader.load(getClass().getResource("V_AcceptRequest_4.fxml"));
   scene  = new Scene(root);
   stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
   stage.setScene(scene);
   stage.show();
  }
 }



 public void GoTosingupV(ActionEvent event) throws IOException {
  Parent root = FXMLLoader.load(getClass().getResource("V_signup.fxml"));
  scene  = new Scene(root);
  stage  = (Stage)((Node)event.getSource()).getScene().getWindow();
  stage.setScene(scene);
  stage.show();

 }



 private boolean CheckInput() {
  String phoneNumberText = phoneNumber.getText().trim();
  String passwordText = password.getText().trim();

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

  passwordError.setVisible(passwordText.isEmpty());

  return (!passwordText.isEmpty() &&
          (!phoneNumberText.isEmpty() && IsInputNumber(phoneNumberText) &&
                  phoneNumberText.length() == 10 ) && phoneNumberText.startsWith("05"));
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
}
