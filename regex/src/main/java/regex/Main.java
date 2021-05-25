package regex;

public class Main {

	public static void main(String[] args) {
		greetings();
	}
	
	private static void greetings() {
		System.out.print("""
				Hello Maven World
				You are using Java version: """);
		System.out.print(System.getProperty("java.version"));
	}
}
