package domain;

import annotations.ca.AddConstructor;
import annotations.ca.Incapsulated;

@AddConstructor
@Incapsulated
public class Person {
		
	//private String name;
	private Integer age;
	//private String telephone;
	private Boolean isBuyer;
		
	public int getAge() {
		return age;
	}
	@SuppressWarnings("unused")
	private void setAge(int age) {
		this.age = age;
	}
//	public String getTelephone() {
//		return telephone;
//	}
//	public void setTelephone(String telephone) {
//		this.telephone = telephone;
//	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", isBuyer=" + isBuyer + "]";
	}

}
