package GUI.view;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import GUI.ColorTheme;

public class StatisticView extends JPanel {

	/**
	 * Create the panel.
	 */
	public StatisticView() {
		setLayout(new CardLayout(0, 0));
		JLabel lblThisIsHome = new JLabel("This is statistic view");
		lblThisIsHome.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblThisIsHome, "name_140143002992856");
		setBackground(Color.decode(ColorTheme.bg));
	}

}
