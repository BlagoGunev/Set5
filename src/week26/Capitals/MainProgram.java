package week26.Capitals;

import javax.swing.*;
import java.awt.*;

public class MainProgram {

    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow("Guess the capital in Europe!!");
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainWindow.setSize(400, 200);
        mainWindow.setVisible(true);
    }

}
