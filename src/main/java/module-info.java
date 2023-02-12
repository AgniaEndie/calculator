module ru.senkosan.calculator.calculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens ru.senkosan.calculator to javafx.fxml;
    exports ru.senkosan.calculator;
}