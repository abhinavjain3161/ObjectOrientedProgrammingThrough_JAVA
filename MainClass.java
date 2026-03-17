class X
{
    public X()     {  System.out.println("Class A Constructor");   }
}
 
class y extends X
{
    public y()     {   System.out.println("Class B Constructor");      }
}
 
class z extends X
{
    public z()     {    System.out.println("Class C Constructor");      }
}

public class MainClass {

	public static void main(String[] args) {		  
	        z a=new z();
		  y b=new y();
	}
}
