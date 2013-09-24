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
	public JFrame frame = new JFrame();
	private static Thread thread;

	public static void main(String[] args) {
		Game game = new Game();

		game.frame.setResizable(false);
		game.frame.setTitle("Game");
		game.frame.add(game);
		game.frame.pack();
		game.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.frame.setVisible(true);

	}

	public Game() {
		Dimension size = new Dimension(width * scale, height * scale);
		setPreferredSize(size);
	}

	public synchronized void start() {
		thread = new Thread(this, "Game");
		thread.start();
	}

	public synchronized void stop() {
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void render() {

	}

	public void update() {

	}

	public void run() {
		render();
		update();
		while (running) {

		}

	}
}