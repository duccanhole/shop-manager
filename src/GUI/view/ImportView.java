package GUI.view;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import GUI.ColorTheme;

public class ImportView extends JPanel {

	/**
	 * Create the panel.
	 */
	public ImportView() {
		setLayout(new CardLayout(0, 0));
		JLabel lblThisIsHome = new JLabel("This is import view");
		lblThisIsHome.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblThisIsHome, "name_140143002992856");
		setBackground(Color.decode(ColorTheme.bg));
	}

}
