package playground.sorting;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();

		persons.add(new Person("Dipesh", "Rijal"));
		persons.add(new Person("John", "Doe"));
		persons.add(new Person("Jane", "Doe"));
		
		
//		persons.forEach(p -> System.out.println(p));
		persons.forEach(System.out::println);
		
		
		persons.sort((p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
		System.out.println("---------------After Sorting----------------");
		persons.forEach(p -> System.out.println(p));

	}

}
