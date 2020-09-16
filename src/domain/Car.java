package domain;

import annotations.ca.AddConstructor;
import annotations.ca.Incapsulated;

@AddConstructor
@Incapsulated
public class Car {
	
//	public Car(String manufacturer) {
//		this.manufacturer = manufacturer;
//	}
	
	private String manufacturer;
	
	private String name;
	
	private String typeFuel;
	Integer engineVolume;
	
	private String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTypeFuel() {
		return typeFuel;
	}
	public void setTypeFuel(String typeFuel) {
		this.typeFuel = typeFuel;
	}
	public Integer getEngineVolume() {
		return engineVolume;
	}
	@Override
	public String toString() {
		return "Car [manufacturer=" + manufacturer + ", name=" + name + ", typeFuel=" + typeFuel + ", engineVolume="
				+ engineVolume + "]";
	}
	
	
}
