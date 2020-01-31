package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Car;
import model.CarImp;

public class TestCarImp2 {
	CarImp carI = new CarImp();
	Car car = new Car("Ford F150");
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testBigSale() {
		car.setPrice(8000);
		double price = carI.bigSale(car);
		assertEquals(6000, price, 0.0);
	}
	
	@Test
	public void testSellCar() {
		car.setPrice(14000);
		car.setAge(5);
		double salePrice = carI.sellCar(car);
		assertEquals(11500, salePrice, 0.0);
	}
}
