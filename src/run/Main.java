package run;

import application.ActionBar;
import application.DrawerLayout;
import application.MaterialRootLayout;
import application.MaterialText;
import application.TabTitle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        ActionBar actionBar = new ActionBar("Traitment sur les arbres Rouges Noires");
        DrawerLayout drawerLayout = new DrawerLayout();
        drawerLayout.getChildren().add(FXMLLoader.load(getClass().getClassLoader().getResource("drawerLayout.fxml")));
        Color white = Color.WHITE;
        actionBar.addTab(new TabTitle(new MaterialText("Arbre Rouge Noire", white)), FXMLLoader.load(getClass().getClassLoader().getResource("arn.fxml")));
        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.setAlignment(Pos.CENTER);
        vBox.setPadding(new Insets(50));

        MaterialRootLayout root = new MaterialRootLayout(actionBar, drawerLayout);
        primaryStage.setTitle("Traitment sur les arbres Rouges Noires");
        primaryStage.getIcons().add(new Image("logo.jpg"));
        primaryStage.setScene(new Scene(root, 1000, 650));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}