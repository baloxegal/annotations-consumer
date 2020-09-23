package main;

import domain.Person;
import instrumentation.ClassTransformer;
import javassist.CannotCompileException;
import javassist.NotFoundException;

public class Application {
	
	public static void main(String[] args) throws NotFoundException, CannotCompileException {
			
		System.out.println("Application running!");
		
		System.out.println("STARTING main APP!");
		
		ClassTransformer.transform("domain.Person");	
			
		Person person = new Person(Integer.valueOf(50), Boolean.valueOf(true));
		
		System.out.println(person);
		
		System.out.println("ENDING main APP!");
		
	}
}
