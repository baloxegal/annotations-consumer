package main;

import domain.Person;
import instrumentation.ClassTransformer;
import javassist.CannotCompileException;
import javassist.NotFoundException;
import java.lang.reflect.InvocationTargetException;

public class Application {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NotFoundException, CannotCompileException {
			
		System.out.println("Application running!");
		
		System.out.println("STARTING main APP!");

		Person person = (Person) ClassTransformer.transform("domain.Person").getConstructor(Integer.class, Boolean.class).newInstance(Integer.valueOf(50), Boolean.valueOf(true));
	
		Person person_1 = new Person();
	
		
		System.out.println(person);
		System.out.println(person_1);
				
		System.out.println("ENDING main APP!");
		
	}
}
