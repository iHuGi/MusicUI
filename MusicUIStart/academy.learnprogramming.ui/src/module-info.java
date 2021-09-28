module academy.learnprogramming.ui {
    requires javafx.controls;
    requires javafx.fxml;
//    requires academy.learnprogramming.common;
    requires academy.learnprogramming.db;

    exports academy.learnprogramming.ui;
    opens academy.learnprogramming.ui;
}