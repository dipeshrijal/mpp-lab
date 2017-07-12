package prob2;

public class Circle implements Figure {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double computeArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double getRadius() {
		return radius;
	}

}
