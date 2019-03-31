package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph {

	CircleMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		int i = 0;
		while(1==1) {
			x= (int) Math.cos(i)+100;
			System.out.println(x);
			y= (int) Math.sin(i)+100;
			System.out.println(y);
			i++;
			if(i>359) {
				i = 0;
			}
		}
	}
	

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.green);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

}
