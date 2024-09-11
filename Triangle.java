/**
 * 
 */
package slideDeckChallenges;

/**
 * This is the triangle class
 */
public class Triangle extends Shape {

	// Instance variables

	private double base;
	private double height;

	// Constructors

	/**
	 * This is the default constructor
	 */
	public Triangle() {

	}

	/**
	 * Constructor with args
	 * 
	 * @param base
	 * @param height
	 */
	public Triangle(double base, double height) {
		this.setBase(base);
		this.setHeight(height);
	}

	// Getters and Setters

	/**
	 * @return the base
	 */
	public double getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(double base) {
		this.base = base;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public void area() {
		System.out.println("Area of triangle : " + (0.5 * this.base * this.height));
	}

}
