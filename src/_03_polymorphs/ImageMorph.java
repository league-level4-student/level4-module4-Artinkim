package _03_polymorphs;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageMorph extends Polymorph {
	BufferedImage img;

	ImageMorph(int x, int y) {
		super(x, y);
		try {
			img = ImageIO.read(this.getClass().getResourceAsStream("image.jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(img, getWidth(), getHeight(), null);
	}

}
