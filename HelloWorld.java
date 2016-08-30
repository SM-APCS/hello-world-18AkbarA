
public class HelloWorld {
	public static void main(String[] args) {
	System.out.println("Hello, World!");
	try {
	    Thread.sleep(500);                 
	} catch(InterruptedException ex) {
	    Thread.currentThread().interrupt();
	}
	System.out.println("Wait for it...");
	try {
	    Thread.sleep(2000);                 
	} catch(InterruptedException ex) {
	    Thread.currentThread().interrupt();
	}
	System.out.println("This is how it starts. With 2 simple words.");
	}
}
