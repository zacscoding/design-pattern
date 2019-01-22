package abstractfactory;

/**
 * Factory class to generate Color object of concrete class
 * 
 * @author zaccoding
 * @date 2017. 8. 9.
 */
public class ColorFactory extends AbstractFactory {
	@Override
	Color getColor(String color) {
		if(color == null)
			return null;
		else if (color.equalsIgnoreCase("RED"))
			return new Red();
		else if(color.equalsIgnoreCase("GREEN"))
			return new Green();
		else if(color.equalsIgnoreCase("BLUE"))
			return new Blue();
		else
			return null;
	}

	@Override
	Shape getShape(String shape) {		
		return null;
	}	
}
