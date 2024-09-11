/**
 * 
 */
package slideDeckChallenges;

/**
 * This is the circle class
 */
public class Circle extends Shape {
	
	// Instance variables
	
	private double radius;
	
	// Constructors
	
	/**
	 * This is the default constructor
	 */
	public Circle() {
		
	}
	
	/**
	 * Constructor with args
	 * @param radius
	 */
	public Circle(double radius) {
		this.setRadius(radius);
	}



	// Getters and setters

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// Methods
	
	@Override
	public void area() {
		System.out.println("Area of circle : " + Math.pow(this.radius, 2) * Math.PI);
	}

}
