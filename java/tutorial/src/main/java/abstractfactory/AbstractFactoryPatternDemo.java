package abstractfactory;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		// get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		Shape circle = shapeFactory.getShape("CIRCLE");
		circle.draw();
		
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		rectangle.draw();
		
		Shape square = shapeFactory.getShape("SQUARE");
		square.draw();
		
		Color nullColor = shapeFactory.getColor("RED");
		System.out.println("nullColor : " + nullColor);
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		Color red = colorFactory.getColor("RED");
		red.fill();
		
		Color green = colorFactory.getColor("GREEN");
		green.fill();
		
		Color blue = colorFactory.getColor("BLUE");
		blue.fill();
		
		Shape nullShape = colorFactory.getShape("CIRCLE");
		System.out.println("nullShape : " + nullShape);
		
	}
}
