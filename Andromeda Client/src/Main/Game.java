package Main;

import java.awt.*;
import java.util.*;
import java.awt.image.*;
import java.awt.image.DataBufferInt;

public class Game {
	public static BufferedImage screen;
	
	public static int[] pixels;
	
	public Game() {
		screen = new BufferedImage((int) Component.pixel.getWidth(), (int) Component.pixel.getHeight(), BufferedImage.TYPE_INT_RGB);
		
		pixels = new int[(int) Component.pixel.getWidth() * (int) Component.pixel.getHeight()];
		pixels = ((DataBufferInt) screen.getRaster().getDataBuffer()).getData();
		
		for(int x = 0; x < (int) Component.pixel.getWidth(); x ++) {
			for(int y = 0; y < (int) Component.pixel.getHeight(); y ++) {
				pixels[(y * (int) Component.pixel.getWidth()) + x] = new Random().nextInt();
			}
		}
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		g.drawImage(screen, 0, 0, null);
	}

}
