package factory;

/**
 * concreate class implementing the same interface Shape
 * 
 * @author zaccoding
 * @date 2017. 8. 8.
 */
public class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method");		
	}
}
