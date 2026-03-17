interface Line{
	void drawLine();
}
interface Rectangle extends Line{
	void drawRectangle();
}
interface Triangle extends Line{
	void drawTriangle();
}
class Shape1 implements Rectangle, Triangle {
	@Override
	public void drawLine(){
		System.out.println("Line drawn for Shape1");
	}
	@Override
	public void drawRectangle(){
		System.out.println("Rectangle drawn for Shape1");
	}
	@Override
	public void drawTriangle(){
		System.out.println("Triangle drawn for Shape1");
	}
}
class Shape2 implements Rectangle , Triangle {
	@Override
	public void drawLine(){
		System.out.println("Line drawn for Shape2");
	}
	@Override
	public void drawRectangle(){
		System.out.println("Rectangle drawn for Shape2");
	}
	@Override
	public void drawTriangle(){
		System.out.println("Triangle drawn for Shape2");
	}
}
class InterfaceDemo{
	public static void main(String[] args){
		Shape1 s1 = new Shape1();
		Shape2 s2 = new Shape2();
		System.out.println("Output for Shape1: ");
		s1.drawLine();
		s1.drawRectangle();
		s1.drawTriangle();
		System.out.println();
		System.out.println("Output for Shape2: ");
		s2.drawLine();
		s2.drawRectangle();
		s2.drawTriangle();
	}
}