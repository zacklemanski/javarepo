package zacklemanski.game;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable {
	public static int width = 300;
	public static boolean running = false;
	public static int height = width * 16 / 9;
	public static int scale = 3;
	private static final long serialVersionUID = 1L;
	public static JFrame frame = new JFrame();
	private static Thread thread;
	static Dimension size = new Dimension(width * scale, height * scale);

	public static void main(String[] args) {
		Game game = new Game(size);
		frame.setPreferredSize(size);
		frame.setResizable(false);
		frame.setTitle("Game");
		frame.add(game);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	public Game(Dimension size) {

	}

	public synchronized void start() {
		thread = new Thread(this, "");
		while (running) {
			thread.start();
		}
	}

	public synchronized void stop() {
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void run() {

	}

}