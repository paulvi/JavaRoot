
public class JavaClass {

	public static void main(String[] args) {
		hello("world");

	}
	
	static String hello(String name) {
	    System.out.format("Hi there from Java, %s", name);
	    return "greetings from java";
	}

}
