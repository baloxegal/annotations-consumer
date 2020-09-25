package main;

import domain.Person;
import instrumentation.ClassTransformer;
import javassist.CannotCompileException;
import javassist.NotFoundException;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NotFoundException, CannotCompileException, IOException {
			
		System.out.println("Application running!");
		
		System.out.println("STARTING main APP!");

//		Person person = (Person) ClassTransformer.transform("domain.Person").getConstructor(Integer.class, Boolean.class).newInstance(Integer.valueOf(50), Boolean.valueOf(true));
		
		Field[] fields = ClassTransformer.transform("domain.Person").getDeclaredFields();
		
		List<?> privateFields = (List<?>) Arrays.stream(fields).filter(f -> f.getModifiers() == Modifier.PRIVATE).map(pf -> pf.getType()).collect(Collectors.toList());
				
		Class<?>[] consArgs = new Class<?>[privateFields.size()];
		
		for(int i = 0; i <privateFields.size(); i++) {
			consArgs[i] = (Class<?>) privateFields.get(i);
		}
		
		Constructor<?> constructor = (Constructor<?>) Person.class.getConstructor(consArgs);
		
		Person person = (Person) constructor.newInstance("Vasea", Integer.valueOf(50), "022796431", Boolean.valueOf(true));
		
		Person person_1 = new Person();
		
		System.out.println(person);
		System.out.println(person_1);
		
		System.out.println("ENDING main APP!");
		
	}
}
