package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
	
	private LocalDate manufactureDate;
	
	public UsedProduct() {
		
	}
	public UsedProduct(String name, Double price, LocalDate manufactuireDate) {
		super(name, price);
		this.manufactureDate = manufactuireDate;
	}


	public LocalDate getManufactuireDate() {
		return manufactureDate;
	}


	public void setManufactuireDate(LocalDate manufactuireDate) {
		this.manufactureDate = manufactuireDate;
	}
	
	@Override
	public String priceTag() {
		return getName() 
				+ " (used) $ " 
				+ String.format("%.2f", getPrice())
				+ " (Manufacture date: "
				+ manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+ ")";
	}
}

