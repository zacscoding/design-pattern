package factory;

/**
 * a Factory to generate object of concrete class
 * 
 * @author zaccoding
 * @date 2017. 8. 8.
 */
public class ShapeFactory {	
	public Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		else if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square(); 
		}
		
		return null;
	}
}
