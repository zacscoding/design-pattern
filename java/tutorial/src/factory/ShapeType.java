package factory;

public enum ShapeType {
	CIRCLE(1), RECTANGLE(2), SQUARE(3);
	
	private final int value;
	
	ShapeType(int value) {
		this.value = value;
	}
	
	public int intValue() {
		return value;
	}
	
	public static ShapeType valueOf(int value) {
		switch(value) {
			case 1 : return CIRCLE;
			case 2 : return RECTANGLE;
			case 3 : return SQUARE;
			default : 
				throw new AssertionError("Unknown value : " + value);
		}
	}
}
