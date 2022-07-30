
public class ShapeExample {
	
	public static void main(String[] args) {
		
		Shape shape[] = new Shape[2];
		shape[0] = new Circle(5);
		
		for(Shape s : shape) {
			System.out.println(s.type + "=================");
			System.out.println("넓이" + s.area());
			System.out.println("둘레" + s.length());
			
		}
	}

}
