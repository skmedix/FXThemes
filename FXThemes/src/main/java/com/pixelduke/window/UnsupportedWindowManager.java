package com.pixelduke.window;

import javafx.scene.paint.Color;
import javafx.stage.Window;

public class UnsupportedWindowManager implements ThemeWindowManager {
    @Override
    public void setDarkModeForWindowFrame(Window window, boolean darkMode) {
        // Do nothing
    }

    @Override
    public void setWindowFrameColor(Window window, Color color) {

    }
}