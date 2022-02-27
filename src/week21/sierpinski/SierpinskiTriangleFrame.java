package week21.sierpinski;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SierpinskiTriangleFrame extends JFrame {
	static int r = 0, gr = 0, b = 255;

	private JButton minusButton = new JButton("-");
	private JButton plusButton = new JButton("+");
	private SierpinskiTrianglePanel trianglePanel = new SierpinskiTrianglePanel(); // To display the pattern
	private int order = 0;

	public SierpinskiTriangleFrame() {
// Panel to hold label, text field, and a button

		minusButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (order > 0) {
					order--;
					trianglePanel.setOrder(order);
				}
			}
		});

		plusButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (order < 12) {
					order++;
					trianglePanel.setOrder(order);
				}
			}
		});

		JPanel panel = new JPanel();
		panel.add(new JLabel("Enter an order: "));
		panel.add(minusButton);
		panel.add(plusButton);
// Add a Sierpinski triangle panel to the frame
		add(trianglePanel);
		add(panel, BorderLayout.SOUTH);

	}

}
