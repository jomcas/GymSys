package gymsys;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author jomar
 */
public class LoginFormController implements Initializable {

    @FXML
    private JFXTextField usernameTxtField;
    @FXML
    private JFXButton loginBtn;
    @FXML
    private JFXPasswordField passwordTxtField;

    PreparedStatement pst;
    ResultSet rs;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

   @FXML
    private void handleLoginBtn(ActionEvent event) {
        int roleID;

        try {

            Connection con = DBconnect.connect();

            String query = "select * from Accounts where Account_Username= ? and Account_Password= HASHBYTES('SHA2_256',?)";
            pst = con.prepareStatement(query);

            pst.setString(1, usernameTxtField.getText());
            pst.setString(2, passwordTxtField.getText());

            rs = pst.executeQuery();

            if (rs.next()) {
                System.out.println(rs.getInt(4));
                String roleQuery = "select * from Accounts where Role_ID =  " + rs.getInt(4);
                pst = con.prepareStatement(roleQuery);                
                rs = pst.executeQuery();
                rs.next();
                roleID = rs.getInt(4);
                System.out.println(roleID);
                
                //Go to ownersform if superadmin
                if (roleID == 1) {
                    try {
                        
                        
                        Parent changeToReg = FXMLLoader.load(getClass().getResource("OwnerForm.fxml"));
                        Scene changeRegScene = new Scene(changeToReg);
                        Stage mainStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        mainStage.setScene(changeRegScene);
                        mainStage.centerOnScreen();
                        mainStage.sizeToScene();
                        mainStage.show();
                    } catch (IOException ex) {
                        Logger.getLogger(LoginFormController.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }// end of ownerform display
                //Go to cashierform if cashier
                else if (roleID == 3) {

                    
                    try {
                        Parent root = FXMLLoader.load(getClass().getResource("CashierForm.fxml"));

                        Scene scene = new Scene(root);

                        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

                        window.setScene(scene);
                        window.show();
                    } catch (IOException ex) {
                        Logger.getLogger(LoginFormController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }// end of cashierform display
                
                //Go to managerform if cashier
                else if (roleID == 2) {

                    JOptionPane.showMessageDialog(null, "Manager Form");
                    try {
                        Parent changeToReg = FXMLLoader.load(getClass().getResource("ManagerForm.fxml"));
                        Scene changeRegScene = new Scene(changeToReg);
                        Stage mainStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        mainStage.setScene(changeRegScene);
                        mainStage.centerOnScreen();
                        mainStage.sizeToScene();
                        mainStage.show();
                    } catch (IOException ex) {
                        Logger.getLogger(LoginFormController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }// end of managerform display

            } else {
                JOptionPane.showMessageDialog(null, "Username & Password does not match");
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginFormController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LoginFormController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
