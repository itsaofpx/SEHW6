module ku.cs.quack {
    requires javafx.controls;
    requires javafx.fxml;


    opens ku.cs.quack to javafx.fxml;
    exports ku.cs.quack;
    exports ku.cs.quack.Ducks;
    opens ku.cs.quack.Ducks to javafx.fxml;
    exports ku.cs.quack.QuackQuack;
    opens ku.cs.quack.QuackQuack to javafx.fxml;
}