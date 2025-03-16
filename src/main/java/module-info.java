module com.product.productmanagement {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.product.productmanagement to javafx.fxml;
    exports com.product.productmanagement;
    exports com.product.productmanagement.services;
    opens com.product.productmanagement.services to javafx.fxml;
}