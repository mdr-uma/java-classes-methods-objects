//an object is an element (or instance) of a class; objects have the behaviors of their class. The object is the actual component of programs, 
//while the class specifies how instances are created and how they behave. 
//method: a method is an action which an object is able to perform. sending a message.

class Methods{
	String animal;
	int value;
	int month;

	//	The void keyword specifies that a method should not have a return value.
	void run() {
		System.out.println("Running..");
		for(int i=0; i<5; i++) {
			System.out.println("My " + animal + " is " + value + "years old.");
		}
	}
	
	//method with 2 arguments
	void timer(int minutes, double seconds) {
		System.out.println("It took " + minutes + "m and " + seconds + "s to get down the hill.");
	}
}

//A Class is like an object constructor, or a "blueprint" for creating objects.
public class App {
	public static void main(String[] args) {
		Methods name = new Methods();
		name.animal = "Cat";
		name.value = 9;
		name.run();
		name.timer(9, 4.30);
	}
}
