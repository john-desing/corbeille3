package jpu2016.dogfight.model;

public class Missile {

	private int SPEED = 4;
	private int WIDTH = 30;
	private int HEIGHT = 10;
	private int MAX_DISTANCE_TRAVELED = 1400;
	private String IMAGE = "missile";
	private int distanceTraveled = 0;
	
	
	
	public int getWIDTHWithADirection(Direction direction) {
		return WIDTH;
	}

    public int getHEIGHTWithADirection(Direction direction) {
		return HEIGHT;
	}

    public void move() {
    	
    }
    
    public boolean isWeapon() {
		return false;
    	
    }

	public Missile(Direction direction, Dimension dimension) {
		// TODO Auto-generated constructor stub
	}

}
