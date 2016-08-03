package demo;

import java.lang.reflect.Method;
import java.util.Arrays;

public class AnalysisAnnotation {
	public static void main(String[] args) {
		try {
			Class utilityClass = Class.forName("demo.Utility");
			Method[] methods = utilityClass.getMethods();
			if (utilityClass.isAnnotationPresent(Description.class)) {
				Description description = (Description) utilityClass.getAnnotation(Description.class);
				System.out.println("Utility's Description---> " + description.value());
				System.out.println("Utility's author---> " + description.author());
				System.out.println("Utility's age---> " + description.age());
				System.out.println("Utility's array---> " + Arrays.asList(description.arrays()));
				System.out.println("Utility's color---> " + description.color());
			}
			for (Method method : methods) {
				if (method.isAnnotationPresent(Author.class)) {
					Author author = (Author) method.getAnnotation(Author.class);
					System.out.println("Utility's Author--->" + author.name() + " from " + author.group());
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
