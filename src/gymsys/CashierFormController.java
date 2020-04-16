package gymsys;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jfoenix.controls.JFXButton;
import gymsys.OwnerFormController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jomar
 */
public class CashierFormController implements Initializable {

    @FXML
    private JFXButton cashierBackBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleCashierBackBtn(ActionEvent event) {
        try {
            Parent changeToReg = FXMLLoader.load(getClass().getResource("LoginForm.fxml"));
            Scene changeRegScene = new Scene(changeToReg);
            Stage mainStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            mainStage.setScene(changeRegScene);
            mainStage.centerOnScreen();
            mainStage.sizeToScene();
            mainStage.show();
        } catch (IOException ex) {
            Logger.getLogger(OwnerFormController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
