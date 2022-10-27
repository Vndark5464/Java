package javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ContactController implements Initializable {
    public TextField txtName;
    public TextField txtEmail;
    public ListView<javafx.Contact> lv;
    private ObservableList<javafx.Contact> ls = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ls.add(new javafx.Contact("Nguyễn Trường Giang","giang@abc.com"));
        ls.add(new javafx.Contact("Nguyễn Hoàng Long","long@abc.com"));
        print();
    }

    public void submit(ActionEvent actionEvent) {
        String name = txtName.getText();
        String email = txtEmail.getText();
        // System.out.println("Submitted..."+name);
        javafx.Contact ct = new javafx.Contact(name,email);
        ls.add(ct);
        print();
    }

    public void print(){
        lv.setItems(ls);
    }
}