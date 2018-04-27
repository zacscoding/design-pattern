package abstractfactory;

/**
 * Factory class to generate Shape object of concrete class
 * 
 * @author zaccoding
 * @date 2017. 8. 9.
 */
public class ShapeFactory extends AbstractFactory {
	@Override
	public Shape getShape(String shape) {
		if (shape == null) 
			return null;

		if (shape.equalsIgnoreCase("CIRCLE"))
			return new Circle();
		else if (shape.equalsIgnoreCase("RECTANGLE"))
			return new Rectangle();

		else if (shape.equalsIgnoreCase("SQUARE"))
			return new Square();

		return null;
	}

	@Override
	public Color getColor(String color) {
		return null;
	}
}
