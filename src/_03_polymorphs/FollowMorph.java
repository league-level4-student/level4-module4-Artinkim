package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class FollowMorph extends Polymorph implements MouseMotionListener {

	FollowMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public void update() {

	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.orange);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		setX(e.getX());
		setY(e.getY());
	}

}
