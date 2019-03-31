package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;
	ArrayList<Polymorph> pl = new ArrayList<Polymorph>();

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
	}

	public void buildWindow() {
		FollowMorph fm = new FollowMorph(140, 150);
		ClickedMorph cm = new ClickedMorph(250, 250);
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);
		window.addMouseMotionListener(fm);
		window.addMouseListener(cm);

		pl.add(cm);
		pl.add(fm);
		pl.add(new BluePolymorph(30, 30));
		pl.add(new ImageMorph(300, 300));
		pl.add(new RedMorph(50, 30));
		pl.add(new MovingMorph(60, 60));
		pl.add(new CircleMorph(100, 100));
		timer = new Timer(1000 / 30, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);
		for (int i = 0; i < pl.size(); i++) {
			pl.get(i).draw(g);
		}
		// draw polymorph
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		for (Polymorph p : pl) {
			p.update();
		}
	}
}
