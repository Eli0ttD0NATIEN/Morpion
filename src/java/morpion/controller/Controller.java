package java.morpion.controller;

import com.sun.glass.ui.View;


public class Controller implements IModel, IView {
		
	private boolean isRunning = false;		
	private long sleepTime = 1000L / 60L;
	private int i = 0;
	private int x = 0;
	private int y = 0;
	private int cross = -1;
	private int round = 1;
	private char button;
	
	public Controller() {
		Model model = new Model();
		View view = new View();
		
	}
	
	public void mouseClickIntoXY(char button) {
		switch(button) {
		case 'A':
			x = 0;
			y = 0;
		case 'B':
			x = 0;
			y = 1;
		case 'C':
			x = 0;
			y = 2;
		case 'D':
			x = 1;
			y = 0;
		case 'E':
			x = 1;
			y = 1;
		case 'F':
			x = 1;
			y = 2;
		case 'G':
			x = 2;
			y = 0;
		case 'H':
			x = 2;
			y = 1;
		case 'I':
			x = 2;
			y = 2;
		}
	}
	
	
	
	public void playerTurn() {
		if(i%2 == 0) {
			mouseClickIntoXY(button);
			model.setMorpionArrayXY(cross, x, y);
			model.setCurrentPlayer("cross");
			
		}else if(i%2 == 1) {
			mouseClickIntoXY(button);
			model.setMorpionArrayXY(round, x, y);
			model.setCurrentPlayer("round");
		}
	}
	
	public void doGameUpdates(char button) {
		if(button!= ' ') {
			i++;
			this.button = button;
			playerTurn();
		}
	}
	
	public void isWinning() {
		for(int j: model.getMorpionSolve()) {
			if(model.getMorpionSolvePos(j) == 3) {
				System.out.println("Round player won !");
				isRunning = false;
			}else if (model.getMorpionSolvePos(j) == -3) {
				System.out.println("Cross player won !");
				isRunning = false;
			}
		}
	}
	
	
	public void GameLoop() {
		while(isRunning) {
			doGameUpdates(button);
			isWinning();
			Thread.sleep(sleepTime);
		}
	}	
	
} 
 