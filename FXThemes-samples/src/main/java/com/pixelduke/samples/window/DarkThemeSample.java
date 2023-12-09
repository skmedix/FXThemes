package com.pixelduke.samples.window;

import com.pixelduke.window.ThemeWindowManager;
import com.pixelduke.window.ThemeWindowManagerFactory;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class DarkThemeSample extends Application {

    private final String darkModeOnLabel = "Switch to Dark mode";
    private final String lightModeOnLabel = "Switch to Light mode";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        ThemeWindowManager themeWindowManager = ThemeWindowManagerFactory.create();

        // Create a simple JavaFX window
        StackPane root = new StackPane();
        Button button = new Button(darkModeOnLabel);
        root.getChildren().add(button);

        Scene scene = new Scene(root, 400, 200);

        button.setOnAction(event -> {
            if (button.getText().equals(darkModeOnLabel)) {
                themeWindowManager.setDarkModeForWindowFrame(primaryStage, true);
                button.setText(lightModeOnLabel);
            } else {
                themeWindowManager.setDarkModeForWindowFrame(primaryStage, false);
                button.setText(darkModeOnLabel);
            }
        });

        primaryStage.setTitle("True Dark Mode");
        primaryStage.setScene(scene);

        primaryStage.show();

    }
}

