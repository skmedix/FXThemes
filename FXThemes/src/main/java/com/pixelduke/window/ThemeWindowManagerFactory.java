package com.pixelduke.window;

public abstract class ThemeWindowManagerFactory {
    public static ThemeWindowManager create() {
        String osName = System.getProperty("os.name");

        // Check which operating system we're running and return appropriate ThemeWindowManager
        switch (osName) {
            case "Windows 10":
                return new Win10ThemeWindowManager();
            case "Windows 11":
                return new Win11ThemeWindowManager();
        }

        return new UnsupportedWindowManager();
    }
}
