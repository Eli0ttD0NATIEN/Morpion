package morpion.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class Panel extends JPanel{

	
	private static final long serialVersionUID = -6628244752582258154L;
	
	public Panel(String name, int x, int y, int width, int height) {
		
		this.setName(name);
		this.setBackground(Color.WHITE);
		this.setBounds(x, y, width, height);
	}
	
}
