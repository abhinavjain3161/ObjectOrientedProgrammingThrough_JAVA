// Case A
class Animal{
	final void display(){
		System.out.println("Display method in Animal class");
	}
}
class Dog extends Animal{
	void display(){
		System.out.println("Display method in Dog class");
	}
}
public class TestA{
	public static void main(String[] args){
		Dog d = new Dog();
		d.display();
	}
}