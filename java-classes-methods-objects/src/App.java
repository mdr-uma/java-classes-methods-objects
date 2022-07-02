
class Methods{
	String animal;
	int value;
	
	void run() {
		System.out.println("Running..");
		for(int i=0; i<5; i++) {
			System.out.println("My " + animal + " is " + value + "years old.");
		}
	}
}

public class App {
	public static void main(String[] args) {
		Methods name = new Methods();
		name.animal = "Cat";
		name.value = 9;
		name.run();
	}
}
