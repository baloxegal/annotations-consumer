package domain;

import annotations.ca.Incapsulated;

@Incapsulated
public class Person {
		
	private String name;
	private Integer age;
	private String telephone;
	public Boolean isBuyer;
		
	public Integer getAge() {
		return age;
	}
	@SuppressWarnings("unused")
	private void setAge(Integer age) {
		this.age = age;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
