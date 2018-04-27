package abstractfactory;

/**
 * Abstract class to get factories for Color & Shape
 * 
 * @author zaccoding
 * @date 2017. 8. 9.
 */
public abstract class AbstractFactory {
	abstract Color getColor(String color);
	abstract Shape getShape(String shape);
}
