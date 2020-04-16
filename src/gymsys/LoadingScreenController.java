/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymsys;

import com.jfoenix.controls.JFXProgressBar;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class LoadingScreenController implements Initializable {

    @FXML
    private JFXProgressBar pbar;
    @FXML
    private AnchorPane ap;
    private ProgressIndicator pIndicator;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        
        Task task = taskWorker(3);
        pbar.progressProperty().unbind();
        
        pbar.progressProperty().bind(task.progressProperty());
       
        task.setOnSucceeded(e->{
            Stage stage= (Stage) ap.getScene().getWindow();
            stage.close();
            
            try{
                Parent root = FXMLLoader.load(getClass().getResource("/gymsys/LoginForm.fxml"));
                        Scene scene = new Scene(root);

                        Stage window = new Stage();

                        window.setScene(scene);
                        window.show();
            } catch (IOException ex) {
                Logger.getLogger(LoadingScreenController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        Thread thread = new Thread(task);
        thread.start();
    }   
    private Task taskWorker(int seconds){
        return new Task(){
            @Override
            protected Object call() throws Exception {
                for(int i=0;i<seconds;i++){
                    updateProgress(i+1,seconds);
                    Thread.sleep(1000);
                }
                
                return true;
            };
            
        };
    }
    
}
