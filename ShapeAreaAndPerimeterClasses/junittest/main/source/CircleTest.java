package main.source;
import main.source.Circle;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CircleTest {

	public CircleTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
		System.out.println("Setup for test complete.");
	}
	
	@AfterClass
	public static void tearDownClass() {
		System.out.println("Test complete!");
	}

	@Before
	public void setUp() {
	}
	
	@After
	public void tearDown() {
	}
	
	/**
	 * Test getArea method, of class Circle.
	 */
	@Test
	public void testGetArea() {
		Circle theCircle = new Circle(4);
		
	 	double expArea = 50.26548245743669;
		double actArea = theCircle.getArea();
		
		assertEquals("Area test", expArea, actArea, .01);
	}
	
	/**
	 * Test getPerimeter method, of class Circle.
	 */
	@Test
	public void testGetPerimeter() {
		Circle theCircle = new Circle(4);
		
		double expPerim = 25.132741228718345;
		double actPerim = theCircle.getPerimeter();
		
		assertEquals("Perimeter test", expPerim, actPerim, .01);
	}
	
	@Test
	public void testInitialValues() {
		Circle theCircle = new Circle(0.0);
		
		double expArea = 0.0;
		double actArea = theCircle.getArea();
		
		assertEquals("Area test", expArea, actArea, .01);
		
		double expPerim = 0.0;
		double actPerim = theCircle.getPerimeter();
		
		assertEquals("Perimeter test", expPerim, actPerim, .01);	
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetAreaNegativeValueRadius() {
		Circle theCircle = new Circle(-4);
		
		double actArea = theCircle.getArea();		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetPerimeterNegativeValueRadius() {
		Circle theCircle = new Circle(-4);
		
		double actPerim = theCircle.getPerimeter();		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetAreaNaNRadius() {
		Circle theCircle = new Circle(Double.NaN);
		
		double actArea = theCircle.getArea();		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetPerimeterNaNRadius() {
		Circle theCircle = new Circle(Double.NaN);
		
		double actPerim = theCircle.getPerimeter();		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetAreaPositiveInfinityRadius() {
	    Circle theCircle = new Circle(Double.POSITIVE_INFINITY);
		
		double actPerim = theCircle.getArea();		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetAreaNegativeInfinityRadius() {
        Circle theCircle = new Circle(Double.NEGATIVE_INFINITY);
		
		double actPerim = theCircle.getArea();		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetPerimeterPositiveInfinityRadius() {
		Circle theCircle = new Circle(Double.POSITIVE_INFINITY);
		
		double actPerim = theCircle.getPerimeter();		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetPerimeterNegativeInfinityRadius() {
		Circle theCircle = new Circle(Double.NEGATIVE_INFINITY);
		
		double actPerim = theCircle.getPerimeter();	
	}
}

