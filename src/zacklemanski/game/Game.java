package zacklemanski.game;

import java.awt.Canvas;

public class Game extends Canvas implements Runnable {
	public static int width = 300;

	public static int height = width * 16 / 9;
	public int scale = 3;
	private static final long serialVersionUID = 1L;

	private Thread thread;

	public static void main(String[] args) {

	}

	public synchronized void start() {
		thread = new Thread(this, "Display/Game or whatever u want");
		thread.start();
	}

	public synchronized void stop() {
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void run() {
		while (true) {

		}
	}

}