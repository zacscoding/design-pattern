package abstractfactory;

/**
 * Create a factory generator/producer class to get factories by passing 
 * 
 * @author zaccoding
 * @date 2017. 8. 9.
 */
public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("SHAPE"))
			return new ShapeFactory();		
		else if (choice.equalsIgnoreCase("COLOR"))
			return new ColorFactory();

		return null;
	}
}
