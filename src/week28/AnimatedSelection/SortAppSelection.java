package week28.AnimatedSelection;

import java.awt.*;
import javax.swing.*;

public class SortAppSelection {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.add(new SortControllSelection());
		frame.setTitle("Sorty Selection");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
