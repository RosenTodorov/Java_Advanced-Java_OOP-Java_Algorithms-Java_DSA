package main.source;

public class Triangle extends Shape {
	private double base;
	private double height;
	private double hypo;
	
	public Triangle(double base, double height, double hypo) {
		this.base = base;
		this.height = height;
		this.hypo = hypo;
	}

	public double getBase() {
		return this.base;
	}
	
	public void setBase(double base) {
		if (base < 0) {
			throw new IllegalArgumentException("base cannot be negative");
		}
		
		this.base = base;
	}

	public double getHeight() {
		return this.height;
	}
	
	public void setHeight(double height) {
		if (height < 0) {
			throw new IllegalArgumentException("height cannot be negative");
		}
		
		this.height = height;
	}

	public double getHypo() {
		return this.hypo;
	}
	
	public void setHypo(double hypo) {
		if (hypo < 0) {
			throw new IllegalArgumentException("hypo cannot be negative");
		}
		
		this.hypo = hypo;
	}
	
	@Override
	public double getArea() {
		if (base < 0 || hypo < 0 || base == Double.POSITIVE_INFINITY || base == Double.NEGATIVE_INFINITY ||
				hypo == Double.POSITIVE_INFINITY || hypo == Double.NEGATIVE_INFINITY ||
		        Double.isNaN(base) || Double.isNaN(hypo)) {
					throw new IllegalArgumentException();
		}
		else {
			double area = 0.5 * (this.base * this.hypo);
	    	return area;	
		}
	}

	@Override
	public double getPerimeter() {
		if (base < 0 || height < 0 || hypo < 0 || base == Double.POSITIVE_INFINITY || base == Double.NEGATIVE_INFINITY ||
				height == Double.POSITIVE_INFINITY || height == Double.NEGATIVE_INFINITY ||
				hypo == Double.POSITIVE_INFINITY || hypo == Double.NEGATIVE_INFINITY ||
		        Double.isNaN(base) || Double.isNaN(height) || Double.isNaN(hypo)) {
			throw new IllegalArgumentException();
		}
		else {
			double perimeter = this.base + this.height + this.hypo;
			return perimeter;
		}
	}
}
