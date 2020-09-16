package main;

import domain.Car;
import instrumentation.ClassTransformer;
import javassist.NotFoundException;

public class Application {
	
	public static void main(String[] args) throws NotFoundException {
			
		System.out.println("Application running!");
		
		System.out.println("STARTING main APP!");
		
		Car myCar = new Car();
		System.out.println(myCar.toString());
				
		ClassTransformer.transform(Car.class);	
			
		
		System.out.println("ENDING main APP!");

		
	}

}
