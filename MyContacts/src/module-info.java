module MyContacts {
    requires javafx.controls;
    requires  javafx.fxml;
    requires java.xml;

    opens sample;
    opens sample.datamodel;
}