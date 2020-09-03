package domain;

import annotations.ca.Incapsulated;

@AddConstructor
@Incapsulated
public class Car {
	
	private String manufacturer;
	
	private String name;
	
	private String typeFuel;
	private Integer engineVolume;
	
	@SuppressWarnings("unused")
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
