package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Button Submit;

    @FXML
    private Label Gender;
    @FXML
    private Label StudentFirstName;
    @FXML
    private Label StudentLastName;
    @FXML
    private Label EmailAddress;
    @FXML
    private Label ConfirmEmailAddress;
    @FXML
    private Label PassWord;
    @FXML
    private Label ConfirmPassWord;
    @FXML
    private Label Department;


    @FXML
    private TextField tfFirsName;
    @FXML
    private TextField tfLastName;
    @FXML
    private TextField tfEmailAddress;
    @FXML
    private TextField tfConfirmEmailAddress;
    @FXML
    private TextField tfPassword;
    @FXML
    private TextField tfConfirmPassWord;

    @FXML
    private TextArea textArea;
    @FXML
    private Button Cancel;

    @FXML
    private DatePicker datePicker;

    @FXML
    private RadioButton Male;
    @FXML
    private RadioButton Female;
    @FXML
    private RadioButton CM;
    @FXML
    private RadioButton ComputerEngineering;
    @FXML
    private RadioButton Electrical;
    @FXML
    private RadioButton ElectronicsCommunication;
    @FXML
    private RadioButton Mechanical;


    @FXML
    private void handleButtonAction(ActionEvent event){
        Student student=new Student();
        String StudentFirstName =tfFirsName.getText();
        student.setStudentFirstName( tfFirsName.getText() );
        student.setStudentLastName( tfLastName.getText() );
        student.setEmailAddress( tfEmailAddress.getText() );
        student.setConfirmEmailAddress( tfConfirmEmailAddress.getText() );
        student.setPasssWord( tfPassword.getText() );
        student.setConfirmPassWord( tfConfirmPassWord.getText());

        if(Male.isSelected()){
            textArea.appendText( Male.getText() + "\n");
        }
        else if(Female.isSelected()){
            textArea.appendText( Female.getText() + "\n");
        }

        textArea.appendText( datePicker.getValue().toString() +"\n" );


        textArea.appendText( student.toString()+ "\n" );

       if(CM.isSelected()){
            textArea.appendText( CM.getText()+"\n");
        }
        else if(ComputerEngineering.isSelected()){
            textArea.appendText( ComputerEngineering.getText() + "\n");
        }
        else if(Electrical.isSelected()){
            textArea.appendText( Electrical.getText() + "\n" );
        }
        else if(ElectronicsCommunication.isSelected()){
            textArea.appendText( ElectronicsCommunication.getText() + "\n");
        }
        else if(Mechanical.isSelected()){
            textArea.appendText( Mechanical.getText() + "\n" );
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private void handleCancelButton(ActionEvent event){
        tfFirsName.setText( " " );
        tfLastName.setText( null );
        tfEmailAddress.setText( null );
        tfConfirmEmailAddress.setText( null );
        tfPassword.setText( null );
        tfConfirmPassWord.setText( null );
        textArea.appendText( null );

    }

}
