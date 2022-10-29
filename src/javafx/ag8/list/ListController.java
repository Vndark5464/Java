package javafx.ag8.list;

import javafx.ag8.Book;
import javafx.ag8.Main;
import javafx.ag8.edit.EditBookController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Collections;
import java.util.Comparator;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class ListController implements Initializable {
    public ListView<Book> lvBook;

    public static ObservableList<Book> bookList = FXCollections.observableArrayList();
    public TextField txtSearch;
    private boolean sortOrder = true;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lvBook.setItems(bookList);
    }

    public void goToAdd(ActionEvent actionEvent) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../add/add.fxml"));
        Main.rootStage.setTitle("Add book");
        Main.rootStage.setScene(new Scene(root, 800, 600));
    }

    public void goToEdit(ActionEvent actionEvent){
        try {
            if (lvBook.getSelectionModel().getSelectedItem() == null)
                throw new Exception("No book selected!");
            Alert confirmAlert = new Alert(Alert.AlertType.CONFIRMATION);
            confirmAlert.setTitle("Confirmation");
            confirmAlert.setHeaderText("Are you sure you want to edit this book info?");
            if (confirmAlert.showAndWait().get() == ButtonType.OK) {
                EditBookController.editedBook = lvBook.getSelectionModel().getSelectedItem();

                Parent root = FXMLLoader.load(getClass().getResource("../edit/edit.fxml"));
                Main.rootStage.setTitle("Edit book");
                Main.rootStage.setScene(new Scene(root, 800, 600));
            }

        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning!");
            alert.setHeaderText(e.getMessage());
            alert.show();
        }
    }

    public void delete(ActionEvent actionEvent) {
        try {
            if (lvBook.getSelectionModel().getSelectedItem() == null)
                throw new Exception("No book selected!");
            Alert confirmAlert = new Alert(Alert.AlertType.CONFIRMATION);
            confirmAlert.setTitle("Confirmation");
            confirmAlert.setHeaderText("Are you sure you want to delete this book?");
            if (confirmAlert.showAndWait().get() == ButtonType.OK)
                bookList.remove(lvBook.getSelectionModel().getSelectedItem());
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning!");
            alert.setHeaderText(e.getMessage());
            alert.show();
        }
    }

    public void sortByPrice(ActionEvent actionEvent) {
        bookList.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return sortOrder ? Double.compare(o1.getPrice(), o2.getPrice()) : Double.compare(o2.getPrice(), o1.getPrice());
            }
        });
        sortOrder = !sortOrder;
    }

    public void sortByQuantity(ActionEvent actionEvent) {
        bookList.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return sortOrder ? Integer.compare(o1.getQuantity(), o2.getQuantity()) : Integer.compare(o2.getQuantity(), o1.getQuantity());
            }
        });
        sortOrder = !sortOrder;
    }

    public void search(ActionEvent actionEvent) {
        String searchValue = txtSearch.getText();
        ObservableList<Book> searchResult = FXCollections.observableArrayList();
        searchResult = bookList.filtered(book -> book.getName().toLowerCase().contains(searchValue.toLowerCase()));
        lvBook.setItems(searchResult);
    }

    public void clearSearch(ActionEvent actionEvent) {
        txtSearch.clear();
        lvBook.setItems(bookList);
    }
}