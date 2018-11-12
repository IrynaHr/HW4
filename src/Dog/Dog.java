package Dog;
public class Dog {
	public static int maxAge = 0;

	private String name;
	private String breed;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;

	}

	public Dog() {

	}
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Dog other = (Dog) obj;
		if (age != other.age) return false;
		if (name == null) {
			if (other.name != null) return false;
		} else if (!name.equals(other.name)) return false;
		return true;
	}


	public void maxAge(Dog d1, Dog d2, Dog d3) {
		if (d1.getAge() > d2.getAge() && d1.getAge() > d3.getAge()) {
			System.out.println("The oldest dog has name " + d1.getName() + " and age " + d1.getAge());
		} else if (d2.getAge() > d1.getAge() && d2.getAge() > d3.getAge()) {
			System.out.println("The oldest dog has name " + d2.getName() + " and age " + d2.getAge());
		} else {
			System.out.println("The oldest dog has name " + d3.getName() + " and age " + d3.getAge());
		}
	}
	
	public void equalsName(Dog d1, Dog d2, Dog d3) {
		if (d1.getName().equals(d2.getName()) || d1.getName().equals(d3.getName())) {
			System.out.println("Have the same name"+ d1.getName());
		} else if (d2.getName().equals( d3.getName())) {
			System.out.println("Have the same name"+ d2.getName());
		} else {
			System.out.println("Have unique names");
		}
	}

	public enum breed {
		TYPE1, TYPE2, TYPE3, TYPE4
	}

}
