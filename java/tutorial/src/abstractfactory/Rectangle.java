package abstractfactory;

/**
 * concreate class implementing the same interface Shape
 * 
 * @author zaccoding
 * @date 2017. 8. 9.
 */
public class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method");
	}

}
