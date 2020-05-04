package jpu2016.dogfight.model;

import java.awt.Image;

public class Sky implements IArea {

	private Image image ;

	public void setImage(Image image) {
		this.image = image;
	}
	
	private Dimension dimension = new Dimension();

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}
	
	public Sky() {
		// TODO Auto-generated constructor stub
	}
	
	public Sky(Dimension dimension) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Dimension getDimension() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}


	

	

}
