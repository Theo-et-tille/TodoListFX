package appli.accueil;

import appli.StartApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class InscriptionController {

    @FXML
    private TextField confirmmdp;

    @FXML
    private TextField email;

    @FXML
    private Label erreur;

    @FXML
    private Label validation;

    @FXML
    private TextField mdp;

    @FXML
    private TextField nom;

    @FXML
    private TextField prenom;

    @FXML
    void onInscription(ActionEvent event) {
        System.out.println(nom.getText());
        System.out.println(prenom.getText());
        System.out.println(email.getText());
        System.out.println(mdp.getText());
        System.out.println(confirmmdp.getText());
        if (nom.getText().isEmpty() || prenom.getText().isEmpty() || email.getText().isEmpty() || mdp.getText().isEmpty() || confirmmdp.getText().isEmpty()) {
            erreur.setText("Champs vide");
            System.out.println(erreur.getText());
        }else if ( !mdp.getText().equals(confirmmdp.getText())){
            erreur.setText("mdp != confirmmdp");
            System.out.println(erreur.getText());
        }else if (email.getText().equals("f@f")){
            erreur.setText("le email est déjà utilisé");
            System.out.println(erreur.getText());
        }else {
            validation.setText("Incription réussie");
            System.out.println(validation.getText());
        }
    }

    @FXML
    void onRetour(ActionEvent event) throws IOException {
        StartApplication.changeScene("accueil/Login");
    }

}
