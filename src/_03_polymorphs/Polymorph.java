package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
	private int width = 50;
	private int height = 50;
	
	int getWidth() {
		return width;
	}
	
	void setWidth(int w) {
		this.width = w;
	}
	
	int getHeight() {
		return height;
	}
	
	void setHeight(int h) {
		this.height = h;
	}
	
    int getX() {
    		return this.x;
    }
    void setX(int x) {
    	this.x = x;
    }
    int getY() {
		return this.y;
    }
    void setY(int y) {
    	this.y = y;
    }
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}
