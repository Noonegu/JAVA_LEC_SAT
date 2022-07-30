
public class Circle extends Shape{
	
	int r;
	
	Circle (int r){
		super("원");
		this.r = r;
	}

	@Override
	double area() {
		return r * r *Math.PI;
	}
	
	@Override
	double length() {
		return  2 * r *Math.PI;
	}

}


	
