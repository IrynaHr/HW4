package Dog;
public class DogMain {

	public static void main(String[] args) {
		Dog d1 = new Dog("Dog1", "type1", 3);
		Dog d2 = new Dog("Dog1", "type2", 9);
		Dog d3 = new Dog("Dog3", "type3", 8);

		Dog dog = new Dog();
		dog.maxAge(d1, d2, d3);
		dog.equalsName(d1, d2, d3);

	

	}

}
