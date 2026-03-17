class Person{
	private String name;
	private int age;
	public void updateValue(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void displayValues(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}
class main{
	public static void main(String[] args){
		Person p1 = new Person();
		p1.updateValue("Abhinav" , 20);
		p1.displayValues();
	}
}	