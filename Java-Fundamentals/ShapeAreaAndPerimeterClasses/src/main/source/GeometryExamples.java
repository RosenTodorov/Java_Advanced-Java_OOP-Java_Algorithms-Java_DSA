package main.source;

public class GeometryExamples {
	public static void main(String[] args) {
		
		 // Triangle
		 double base = 2, height = 3, hypo = 4;
	     Shape triangle = new Triangle(base, height, hypo);
	     System.out.println("Triangle sides: " + base + ", " + height + ", " + hypo
	             + "\nResulting Area: " + triangle.getArea()
	             + "\nResulting Perimeter: " + triangle.getPerimeter() + "\n");
	     
	      // Rectangle 
	      double widthRect = 5, heightRect = 7;
	      Shape rectangle = new Rectangle(widthRect, heightRect);
	      System.out.println("Rectangle width: " + widthRect + " and height: " + heightRect
	              + "\nResulting area: " + rectangle.getArea()
	              + "\nResulting perimeter: " + rectangle.getPerimeter() + "\n");
	      
	      // Square
	      double sideSquare = 4;
	      Shape square = new Square(sideSquare);
	      System.out.println("Square side: " + sideSquare
	              + "\nResulting area: " + square.getArea()
	              + "\nResulting perimeter: " + square.getPerimeter() + "\n");

		  // Circle 
		  double radius = 5;
		  Shape circle = new Circle(radius);
	      System.out.println("Circle radius: " + radius
	              + "\nResulting Area: " + circle.getArea()
	              + "\nResulting Perimeter: " + circle.getPerimeter() + "\n");
	      
	      // Diamond 
	      double side = 4, breadth = 5, heightDm = 6;
		  Shape diamond = new Diamond(side, breadth, heightDm);
		  System.out.println("Diamond side: " + side + ", breadth: " + breadth + ", heightDm: " + heightDm
		          + "\nResulting Area: " + diamond.getArea()
		          + "\nResulting Perimeter: " + diamond.getPerimeter() + "\n");
		  
		  // Cuboid 
	      double width = 2, heightCub = 4, depth = 3;
		  Shape cuboid = new Cuboid(width, heightCub, depth);
		  System.out.println("Cuboid width: " + width + ", height: " + heightCub + ", depth: " + depth
		          + "\nResulting Area: " + cuboid.getArea()
		          + "\nResulting Volume/Perimeter: " + cuboid.getPerimeter() + "\n");
	}
}