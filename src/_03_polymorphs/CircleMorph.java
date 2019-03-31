package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph {
	int i = 0;

	CircleMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub

	}

	public void update() {
		setX((int) (getX() + Math.sin(i) * 10));
		System.out.println(getX());
		setY((int) (getY() + Math.cos(i) * 10));
		System.out.println(getY());
		i++;
		if (i > 359) {
			i = 0;
		}
		System.out.println(i);
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.green);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

}
