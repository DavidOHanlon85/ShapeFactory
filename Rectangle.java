/**
 * 
 */
package slideDeckChallenges;

/**
 * This is the rectangle class
 */
public class Rectangle extends Shape {
	
	// Instance Variables
	
	private int width;
	private int height;
	
	// Constructors 
	
	/**
	 * This is the default constructor
	 */
	
	public Rectangle() {
		
	}
	
	
	
	/**
	 * This is the constructor with args
	 * @param width
	 * @param height
	 */
	public Rectangle(int width, int height) {
		this.setWidth(width);
		this.setHeight(height);
	}

	// Getters and setters
	
	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void area() {
		System.out.println("Area of rectangle : " + (this.width * this.height));
		
	}
	
	

}
