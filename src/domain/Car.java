package domain;

import annotations.ca.AddConstructor;
import annotations.ca.Incapsulated;

@AddConstructor
@Incapsulated
public class Car {
	
	public Car(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	private String manufacturer;
	
	private String name;
	
	private String typeFuel;
	private Integer engineVolume;
	
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
	
}
