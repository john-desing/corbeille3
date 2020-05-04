package jpu2016.dogfight.model;

import java.awt.Image;

public class Mobile implements IMobile{
	
	private int speed;
	private Image[] images= new Image[6];
	/*public Image[] getImages() {
		return images;
	}

	public void setImages(Image[] images) {
		this.images = images;
	}*/

	private Direction direction;
    private Dimension dimension;
    private Position position;
	
	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	
	public void moveUp() {
		
	}
	
    public void moveRight() {
		
	}
    
    public void moveDown() {
		
	}
    
    public void moveLeft() {
		
	}
    
    public IDogfightModel getDogfightModel() {
		return null;
		
	}

	@Override
	public Direction getDirection() {
		// TODO Auto-generated method stub
		return direction;
	}

	@Override
	public void setDirection(Direction direction) {
		this.direction = direction;
		// TODO Auto-generated method stub
		
	}

	@Override
	public Position getPosition() {
		// TODO Auto-generated method stub
		return this.position;
	}

	@Override
	public Dimension getDimension() {
		// TODO Auto-generated method stub
		 return this.dimension;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return this.speed;
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void placeInArea(IArea area) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isPlayer(int player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setDogfightModel(DogfightModel dogfightModel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hit() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWeapon() {
		// TODO Auto-generated method stub
		return false;
	}

}
