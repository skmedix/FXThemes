package com.pixelduke.window;

import javafx.scene.paint.Color;
import javafx.stage.Window;

public interface ThemeWindowManager {
    void setDarkModeForWindowFrame(Window window, boolean darkMode);

    void setWindowFrameColor(Window window, Color color);
}