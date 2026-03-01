package problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// ---------------- STUDENT CLASS ----------------
class Student {
	private String name;
	private String subject;
	private int marks;

	public Student(String name, String subject, int marks) {
		this.name = name;
		this.subject = subject;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public String getSubject() {
		return subject;
	}

	public int getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return name + " - " + subject + " - " + marks;
	}
}


// ---------------- MAIN CLASS ----------------
public class SecondHighestNumber {

	public static void main(String[] args) {

		// Sample student list
		List<Student> students = Arrays.asList(
				new Student("A", "Math", 90),
				new Student("B", "Math", 85),
				new Student("C", "Math", 90),
				new Student("D", "Math", 80),

				new Student("E", "Science", 88),
				new Student("F", "Science", 92),
				new Student("G", "Science", 92),
				new Student("H", "Science", 85)
		);


		// STEP 1 → Group marks by subject
		Map<String, List<Integer>> marksBySubject =
				students.stream()
						.collect(Collectors.groupingBy(
								Student::getSubject,
								Collectors.mapping(Student::getMarks, Collectors.toList())
						));


		// STEP 2 → Find second highest distinct mark
		Map<String, Integer> result = new HashMap<>();

		for (String subject : marksBySubject.keySet()) {

			List<Integer> sortedDistinct =
					marksBySubject.get(subject).stream()
							.distinct()
							.sorted(Comparator.reverseOrder())
							.collect(Collectors.toList());

			Integer secondHighest =
					sortedDistinct.size() > 1 ? sortedDistinct.get(1) : null;

			result.put(subject, secondHighest);
		}


		// STEP 3 → Print result
		System.out.println("Second highest marks by subject:");
		result.forEach((subject, mark) ->
				System.out.println(subject + " -> " + mark));



		Map<String, Integer> result1 =
				students.stream()
						.collect(Collectors.groupingBy(
								Student::getSubject,
								Collectors.collectingAndThen(
										Collectors.mapping(Student::getMarks, Collectors.toList()),
										list -> list.stream()
												.distinct()
												.sorted(Comparator.reverseOrder())
												.skip(1)
												.findFirst()
												.orElse(null)
								)
						));
	}
}