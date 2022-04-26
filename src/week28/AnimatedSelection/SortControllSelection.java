package week28.AnimatedSelection;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SortControllSelection extends JPanel {
	private SortingPanelSelection sortingPanel = new SortingPanelSelection();

	private JButton nextStepBtn = new JButton("NextStep");

	public SortControllSelection() {

		setLayout(new BorderLayout());
		add(sortingPanel, BorderLayout.CENTER);
		add(nextStepBtn, BorderLayout.SOUTH);
		
		nextStepBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				sortingPanel.nextStepInSorting();
			}
		});

	}

}