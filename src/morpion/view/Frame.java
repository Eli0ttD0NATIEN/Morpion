package morpion.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame implements ActionListener{

	private static final long serialVersionUID = 6354267359333049819L;
	private static final String name = "TicTacToe";
	private static final int boardSize = 900;
	private static final int bannerSize = 100;
	private static final int tileSize = boardSize/3;
	private Panel mainPanel;
	private Panel bannerPanel;
	private Panel boardPanel;
	private Panel tile00;
	private Panel tile01;
	private Panel tile02;
	private Panel tile10;
	private Panel tile11;
	private Panel tile12;
	private Panel tile20;
	private Panel tile21;
	private Panel tile22;
	private JButton button00;
	private JButton button01;
	private JButton button02;
	private JButton button10;
	private JButton button11;
	private JButton button12;
	private JButton button20;
	private JButton button21;
	private JButton button22;
	private Image blankSprite;
	private Image crossSprite;
	private Image roundSprite;
	private JLabel playerTurns;
	private Font font;
	

	public Frame() {
		
		this.setTitle(getName());
	    this.setSize(getBoardsize(), getBoardsize()+getBannersize());
		
		mainPanel = new Panel("mainPanel", 0, 0, getBoardsize(), getBoardsize());
		mainPanel.setLayout(new BorderLayout());
		bannerPanel = new Panel("bannerPanel", 0, 0, getBoardsize(), getBannersize());
		bannerPanel.setMinimumSize(new Dimension(getBoardsize(),getBannersize()));
		bannerPanel.setPreferredSize(new Dimension(getBoardsize(),getBannersize()));
		boardPanel = new Panel("boardPanel", 0, 0, getBoardsize(), getBoardsize());
	    boardPanel.setBackground(Color.BLACK);
	    boardPanel.setLayout(new GridLayout(3,3));
	    
	    tile00 = new Panel("tileOO", 0, 0, getTilesize(),getTilesize());
	    tile00.setBackground(Color.RED);
	    tile00.setLayout(new BorderLayout());
	    tile01 = new Panel("tileO1", 0, 0, getTilesize(),getTilesize());
	    tile01.setBackground(Color.GREEN);
	    tile01.setLayout(new BorderLayout());
	    tile02 = new Panel("tileO2", 0, 0, getTilesize(),getTilesize());
	    tile02.setBackground(Color.RED);
	    tile02.setLayout(new BorderLayout());
	    tile10 = new Panel("tile1O", 0, 0, getTilesize(),getTilesize());
	    tile10.setBackground(Color.GREEN);
	    tile10.setLayout(new BorderLayout());
	    tile11 = new Panel("tile11", 0, 0, getTilesize(),getTilesize());
	    tile11.setBackground(Color.RED);
	    tile11.setLayout(new BorderLayout());
	    tile12 = new Panel("tile12", 0, 0, getTilesize(),getTilesize());
	    tile12.setBackground(Color.GREEN);
	    tile12.setLayout(new BorderLayout());
	    tile20 = new Panel("tile2O", 0, 0, getTilesize(),getTilesize());
	    tile20.setBackground(Color.RED);
	    tile20.setLayout(new BorderLayout());
	    tile21 = new Panel("tile21", 0, 0, getTilesize(),getTilesize());
	    tile21.setBackground(Color.GREEN);
	    tile21.setLayout(new BorderLayout());
	    tile22 = new Panel("tile22", 0, 0, getTilesize(),getTilesize());
	    tile22.setBackground(Color.RED);
	    tile22.setLayout(new BorderLayout());
	    
	    button00 = new JButton();
	    button00.addActionListener(this);
	    button01 = new JButton();
	    button01.addActionListener(this);
	    button02 = new JButton();
	    button02.addActionListener(this);
	    button10 = new JButton();
	    button10.addActionListener(this);
	    button11 = new JButton();
	    button11.addActionListener(this);
	    button12 = new JButton();
	    button12.addActionListener(this);
	    button20 = new JButton();
	    button20.addActionListener(this);
	    button21 = new JButton();
	    button21.addActionListener(this);
	    button22 = new JButton();
	    button22.addActionListener(this);
	    
	    try {
			blankSprite = ImageIO.read(new File("images/blank.png"));
			crossSprite = ImageIO.read(new File("images/cross.png"));
			roundSprite = ImageIO.read(new File("images/round.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	    button00.setIcon(new ImageIcon(blankSprite));
	    button01.setIcon(new ImageIcon(blankSprite));
	    button02.setIcon(new ImageIcon(blankSprite));
	    button10.setIcon(new ImageIcon(blankSprite));
	    button11.setIcon(new ImageIcon(blankSprite));
	    button12.setIcon(new ImageIcon(blankSprite));
	    button20.setIcon(new ImageIcon(blankSprite));
	    button21.setIcon(new ImageIcon(blankSprite));
	    button22.setIcon(new ImageIcon(blankSprite));
	    font = new Font("Arial", Font.BOLD, 72);
	    playerTurns = new JLabel("It's " + model.currentPlayer + "'s turn");
	    playerTurns.setHorizontalAlignment(JLabel.CENTER);
	    playerTurns.setFont(font);
	    bannerPanel.add(playerTurns, BorderLayout.CENTER);
	    mainPanel.add(bannerPanel, BorderLayout.NORTH);
	    tile00.add(button00, BorderLayout.CENTER);
	    tile01.add(button01, BorderLayout.CENTER);
	    tile02.add(button02, BorderLayout.CENTER);
	    tile10.add(button10, BorderLayout.CENTER);
	    tile11.add(button11, BorderLayout.CENTER);
	    tile12.add(button12, BorderLayout.CENTER);
	    tile20.add(button20, BorderLayout.CENTER);
	    tile21.add(button21, BorderLayout.CENTER);
	    tile22.add(button22, BorderLayout.CENTER);
	    boardPanel.add(tile00);
	    boardPanel.add(tile01);
	    boardPanel.add(tile02);
	    boardPanel.add(tile10);
	    boardPanel.add(tile11);
	    boardPanel.add(tile12);
	    boardPanel.add(tile20);
	    boardPanel.add(tile21);
	    boardPanel.add(tile22);
	    
	    mainPanel.add(boardPanel, BorderLayout.CENTER);
	    
		
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setContentPane(mainPanel);
	    this.setResizable(false);
	    this.setVisible(true);
	}
	
	public static int getBannersize() {
		return bannerSize;
	}

	public Panel getMainPanel() {
		return mainPanel;
	}

	public void setMainPanel(Panel mainPanel) {
		this.mainPanel = mainPanel;
	}

	public Panel getBoardPanel() {
		return boardPanel;
	}

	public void setBoardPanel(Panel boardPanel) {
		this.boardPanel = boardPanel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static int getBoardsize() {
		return boardSize;
	}

	public static int getTilesize() {
		return tileSize;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == button00)
			setButton('A');
		if(arg0.getSource() == button01)
			setButton('B');
		if(arg0.getSource() == button02)
			setButton('C');
		if(arg0.getSource() == button10)
			setButton('D');
		if(arg0.getSource() == button11)
			setButton('E');
		if(arg0.getSource() == button12)
			setButton('F');
		if(arg0.getSource() == button20)
			setButton('G');
		if(arg0.getSource() == button21)
			setButton('H');
		if(arg0.getSource() == button22)
			setButton('I');
	}
	
}
