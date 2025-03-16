package com.product.productmanagement.services;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ProductController {
    @FXML
    private TextField nameField;
    @FXML
    private TextField priceField;
    @FXML
    private ListView<Product> productListView;

    private ObservableList<Product> productList;

    @FXML
    public void initialize() {
        productList = FXCollections.observableArrayList();
        productListView.setItems(productList);
    }

    @FXML
    private void handleAddProduct() {
        String name = nameField.getText();
        double price = Double.parseDouble(priceField.getText());
        Product product = new Product(name, price);
        productList.add(product);
        nameField.clear();
        priceField.clear();
    }
}
