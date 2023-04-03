import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AddressBookUI extends Application {
    private AddressBook addressBook;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        addressBook = new AddressBook();

        // Create UI controls
        Label nameLabel = new Label("Name:");
        TextField nameTextField = new TextField();
        Label addressLabel = new Label("Address:");
        TextField addressTextField = new TextField();
        Label phoneLabel = new Label("Phone:");
        TextField phoneTextField = new TextField();
        Button addButton = new Button("Add");
        Button removeButton = new Button("Remove");
        Button searchByNameButton = new Button("Search by Name");
        Button searchByPhoneButton = new Button("Search by Phone");
        ListView<Contact> contactListView = new ListView<>();

        // Add event handlers
        addButton.setOnAction(event -> {
            String name = nameTextField.getText();
            String address = addressTextField.getText();
            String phone = phoneTextField.getText();
            Contact contact = new Contact(name, address, phone);
            addressBook.addContact(contact);
            contactListView.getItems().add(contact);
            nameTextField.clear();
            addressTextField.clear();
            phoneTextField.clear();
        });

        removeButton.setOnAction(event -> {
            Contact selectedContact = contactListView.getSelectionModel().getSelectedItem();
            if (selectedContact != null) {
                addressBook.removeContact(selectedContact);
                contactListView.getItems().remove(selectedContact);
            }
        });

        searchByNameButton.setOnAction(event -> {
            String name = nameTextField.getText();
            Contact contact = addressBook.findContactByName(name);
            if (contact != null) {
                contactListView.getSelectionModel().select(contact);
            }
        });

        searchByPhoneButton.setOnAction(event -> {
            String phone = phoneTextField.getText();
            Contact contact = addressBook.findContactByPhone
