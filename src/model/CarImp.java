package model;

public class CarImp {

	public boolean getDiscount(Car car) {
		boolean discount;
		if (car.getPrice() > 20000) {
			discount = true;
		} else {
			discount = false;
		}
		
		return discount;	
	}
	
	public double bigSale(Car car) {
		double finalPrice;
		finalPrice = car.getPrice() - 2000;
		
		return finalPrice;	
	}
	
	public boolean getOilChange(Car car) {
		boolean oilChange;
		
		if (car.getAge() > 2) {
			oilChange = true;
		} else {
			oilChange = false;
		}
		
		return oilChange;
	}
	
	public double sellCar(Car car) {
		double salePrice = 0;
		double depreciation = 0;
		depreciation = (car.getAge() * 500);
		salePrice = (car.getPrice() - depreciation);
		
		return salePrice;
	}	
}
