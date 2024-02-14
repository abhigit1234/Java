package Super_This;



class Animal{
	void eat() {
		System.out.println("i can eat");
	}
}
class Dog extends Animal{
	@Override
	void eat() {
		super.eat();
		
	}
	void bark() {
		System.out.println("i can bark");
	}
}




public class SuperKeyword {

	public static void main(String[] args) {
		Dog s = new Dog();
		s.bark();
		s.eat();
	}
	}