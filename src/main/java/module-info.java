module org.example.fx.snakegame {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires eu.hansolo.tilesfx;

    opens org.example.fx.snakegame to javafx.fxml;
    exports org.example.fx.snakegame;
}