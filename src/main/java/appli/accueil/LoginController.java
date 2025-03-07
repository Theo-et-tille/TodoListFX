package appli.accueil;

import appli.StartApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController {

    @FXML
    private Button Inscription;

    @FXML
    private Button connexion;

    @FXML
    private TextField emailField;

    @FXML
    private Label erreurConnexion;

    @FXML
    private Button mdplost;

    @FXML
    private Label validation;

    @FXML
    private PasswordField passwordField;

    @FXML
    void onConnexion(ActionEvent event) {
        System.out.println(emailField.getText());
        System.out.println(passwordField.getText());
        if (emailField.getText().equals("f@f") && passwordField.getText().equals("Azerty1234")) {
            validation.setText("Connexion Réussie");
            System.out.println(validation.getText());
        }else {
            System.out.println("Erreur de connexion CONSOLE");
            erreurConnexion.setText("Erreur de connexion");
        }
    }

    @FXML
    void onInscription(ActionEvent event) throws IOException {
        StartApplication.changeScene("accueil/Inscription");
    }

    @FXML
    void onMdpLost(ActionEvent event) {

    }

}
