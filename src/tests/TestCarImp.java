package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Car;
import model.CarImp;


public class TestCarImp {
	CarImp carI = new CarImp();
	Car car = new Car("Ford Focus");	
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetDiscount() {
		car.setPrice(25000);
		assertTrue(carI.getDiscount(car));
	}
	
	@Test
	public void testGetOilChange() {
		car.setAge(1);
		assertFalse(carI.getOilChange(car));
	}
}
