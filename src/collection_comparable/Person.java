package collection_comparable;

public class Person implements Comparable<Person> {

	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person o) {
		//Person 자신의 age와 parameter의 age 값을 비교함
		if(age < o.age) return-1; //오름차순
		else if(age == o.age) return 0;
		else return 1;
	}
	
}
