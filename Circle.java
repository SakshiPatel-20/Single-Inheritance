
public class Circle extends Shapes{
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getPerimeter() {
		//return super.getPerimeter();
		return 2*3.14*radius;
	}

	@Override
	public double getArea() {

		//return super.getArea();
		return 3.14*radius*radius;
	}
}