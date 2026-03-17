abstract class Instrument{
	abstract void play();
	abstract void tune();
}
class Glockenspiel extends Instrument{
	void play(){
		System.out.println("Playing the Glockenspiel with mallets.");
	}
	void tune(){
		System.out.println("Tuning the Glockenspiel by adjusting metal bars.");
	}
}
class Violin extends Instrument{
	void play(){
		System.out.println("Playing the Violin with a bow.");
	}
	void tune(){
		System.out.println("Tuning the Violin by adjusting strings.");
	}
}
public class InstrumentDemo{
	public static void main(String[] args){
		Instrument i1 = new Glockenspiel();
		Instrument i2 = new Violin();
		i1.play();
		i1.tune();
		i2.play();
		i2.tune();
	}
}