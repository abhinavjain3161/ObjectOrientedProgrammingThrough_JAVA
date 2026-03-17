class Animal{
	void sound(){
		System.out.println("Animals make sounds.");
	}
	//@overloading
	void eat(){
		System.out.println("Animal eats food");
	}
	void eat(String food){
		System.out.println("Animal eats " + food);
	}
}
class Dog extends Animal{
	//@overriding
	void sound(){
		System.out.println("Dog barks");
	}
}
class Cat extends Animal{
	//@overriding
	void sound(){
		System.out.println("Cat meows");
	}
}
public class HierarchicalDemo{
	public static void main(String[] args){
		Dog d = new Dog();
		Cat c = new Cat();
		// method overriding demonstration
		d.sound();
		c.sound();
		// method overloading demonstration
		d.eat();
		d.eat("Bones");
	}
}