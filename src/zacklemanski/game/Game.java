package zacklemanski.game;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Game extends Applet implements KeyListener {

	private static final long serialVersionUID = 1L;

	public JFrame frame;
	
	static int x;
	static int y;
	
	public Game() {
		
	}
	// Applet methods.
	public void start() {
		
	}
	public void stop() {
		
	}
	public void paint(Graphics g) {
		while (true) {
			g.drawOval(x, y, 20, 20);
		}
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
	
}
