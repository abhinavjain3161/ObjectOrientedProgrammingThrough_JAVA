class Flight{
	void fly(){
		System.out.println("Flight is flying.");
	}
}
class PassengerFlight extends Flight{
	@Override
	void fly(){
		System.out.println("Passenger flight is carrying passengers.");
	}
}
class CargoFlight extends Flight{
	@Override
	void fly(){
		System.out.println("Cargo flight is transporting goods.");
	}
}
public class FlightDemo{
	public static void main(String[] args){
		Flight f = new Flight();
		PassengerFlight pf = new PassengerFlight();
		CargoFlight cf = new CargoFlight();
		f.fly();
		pf.fly();
		cf.fly();
	}
}