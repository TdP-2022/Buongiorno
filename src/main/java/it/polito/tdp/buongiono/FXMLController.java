package it.polito.tdp.buongiono;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private Label txtMessaggio;

    @FXML
    private TextField txtNome;

    @FXML
    void handleBuongiorno(ActionEvent event) {
//    	System.out.println("Bottone premuto");
    	String nome = txtNome.getText();
    	if (nome.length()==0) {
    		txtMessaggio.setText("Per favore inserisci il tuo nome");
    	} else {
    		txtMessaggio.setText("Buongiorno, "+nome+".");
    		txtNome.setText("");
    	}

    }

}
