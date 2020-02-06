package hw.carpetController;

public class Floor {
	private double width;
	private double height;
	
	
	public Floor(double width, double height) {
		if(width<0)
			width=0.0;
		if(height<0)
			height=0.0;
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public double getArea() {
		return getWidth()*getHeight();
	}

}
