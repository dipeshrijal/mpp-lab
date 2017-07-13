package labs.problem10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Human {
	String name;
	int age;
	String gender;

	public Human(String name) {
		this.name = name;
	}

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Human(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

public class ConstructorReference {
	public static void main(String args[]) {
		Human[] list = { new Human("Joe", 35, "Male"), new Human("Jane", 45, "Female"), new Human("John", 30, "Male") };

		// Query 1 : Print only male canditates

		System.out.println("------------------------------Male---------------------------\n");

		Arrays.stream(list).filter(human -> human.getGender() == "Male").collect(Collectors.toList())
				.forEach(System.out::println);

		// Query 2 : add some more objects to the list, and print the count of female
		// candidates whose age is greater than 30

		Human[] list1 = { new Human("Dipesh", 26, "Male"), new Human("Alien", 45, "Female"),
				new Human("Amina", 50, "Female") };

		Stream<Human> h1 = Stream.concat(Arrays.stream(list), Arrays.stream(list1));

		System.out.println("\n-----------------------------Female greater than 30------------\n");

		System.out.println(h1.filter(human -> human.getGender().equals("Female")).filter(human -> human.getAge() > 30)
				.count());

		// Query 3 : Practice for method reference Classname::new - Cretae an objecy by
		// choosing suitable Interface to the specified constructors(Totally 3
		// constuctors) and print the object status

		// Query 4 : convert your Human array into ArrayList of Human by creating a
		// static method, decide your arguments and return type

		Stream<Human> col1 = arrayToCollection(list);
		System.out.println("\n" + col1);
	}

	// Implement the body for Query 4
	public static Stream<Human> arrayToCollection(Human[] list) {

		Stream<Human> stream1 = Arrays.stream(list);

		return stream1;

	}

}
