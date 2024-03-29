package meili.problem1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<LibraryMember> sampleData = TestData.getLibraryMembers();

		System.out.println("\n Part A");
		// Create a stream pipeline that prints to the console
		// the full names(first name and last name separated by a space)
		// of Library Members who live in the state of CA
		// and whose first name starts after the letter 'M',
		// sorted by age in ascending order.

		sampleData.stream()
		.filter(s -> s.getAddress().getState().equals("CA"))
		.filter(s -> s.getFirstName().charAt(0) > 'M')
		.sorted(Comparator.comparing(LibraryMember::getAge))
		.map(s -> s.getFirstName() + " " + s.getLastName())
		.forEach(System.out::println);
		

		System.out.println("\n Part B");
		// Turn the stream pipeline from Part A into a LambdaLibrary item
		// and evaluate it here.
		System.out.println(LambdaLibrary.IMPLEMENT.apply(sampleData, "CA", 'M'));

		System.out.println("\n Part C");
		// Replace all lambda expressions in the stream pipeline from Part A
		// with instances of inner classes/functors.
		
		
		
		

		System.out.println("\n Part D");
		// Extra Credit: Create a stream pipeline that uses the reduce method
		// to get the Library member who has checked out the greatest number of book
		// copies.
		// You may assume there is exactly one such member.

	}
}
