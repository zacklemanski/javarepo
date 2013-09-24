package zacklemanski.game;

import java.awt.Canvas;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable {

	private static final long serialVersionUID = 1L;

	public JFrame frame;
	
	static int x;
	static int y;
	
	public Game() {
		
	}
	public static void main(String[] args) {
		
	}
	
	// KeyListener Methods
	
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getKeyCode() == KeyEvent.VK_UP) {
			y += 1;
		}
		if (arg0.getKeyCode() == KeyEvent.VK_DOWN) {
			y -= 1;
		}
		if (arg0.getKeyCode() == KeyEvent.VK_RIGHT) {
			x += 1;
		}
		if (arg0.getKeyCode() == KeyEvent.VK_LEFT) {
			x -= 1;
		}
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getKeyCode() == KeyEvent.VK_UP) {
			y += 0;
		}
		if (arg0.getKeyCode() == KeyEvent.VK_DOWN) {
			y -= 0;
		}
		if (arg0.getKeyCode() == KeyEvent.VK_RIGHT) {
			x += 0;
		}
		if (arg0.getKeyCode() == KeyEvent.VK_LEFT) {
			x -= 0;
		}
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
