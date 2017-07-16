package labs.problem7.b;

import java.util.*;
import java.util.stream.Collectors;

import labs.problem7.a.Employee;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000), new Employee("John", "Sims", 110000),
				new Employee("Joe", "Stevens", 200000), new Employee("Andrew", "Reardon", 80000),
				new Employee("Joe", "Cummings", 760000), new Employee("Steven", "Walters", 135000),
				new Employee("Thomas", "Blake", 111000), new Employee("Alice", "Richards", 101000),
				new Employee("Donald", "Trump", 100000));

		System.out.println(Main.HELLO.apply(list, 100000, 'N'));

	}

	public static final TriFunction<List<Employee>, Integer, Character, String> HELLO = (list, salary, letter) -> list
			.stream().sorted(Comparator.comparing(Employee::getFirstName)).filter(e -> e.getSalary() > salary)
			.filter(e -> e.getLastName().charAt(0) >= 'N' && e.getLastName().charAt(0) <= 'Z')
			.map(Employee::getFullName).collect(Collectors.joining(", "));
}
