package corejavapracticeproject;

public class AcessModifiers {

		 // Public field
	    public String publicField = "This is a public field";

	    // Private field
	    private String privateField = "This is a private field";

	    // Protected field
	    protected String protectedField = "This is a protected field";

	    // Default (no modifier) field
	    String defaultField = "This is a default field";

	    // Constructor with various access modifiers
	    public AcessModifiers() {
	        System.out.println("Constructor with public access modifier");
	    }

	    private AcessModifiers(String message) {
	        System.out.println("Constructor with private access modifier: " + message);
	    }

	    protected AcessModifiers(int number) {
	        System.out.println("Constructor with protected access modifier: " + number);
	    }

	    AcessModifiers(double value) {
	        System.out.println("Constructor with default access modifier: " + value);
	    }

	    // Public method
	    public void publicMethod() {
	        System.out.println("This is a public method");
	    }

	    // Private method
	    private void privateMethod() {
	        System.out.println("This is a private method");
	    }

	    // Protected method
	    protected void protectedMethod() {
	        System.out.println("This is a protected method");
	    }

	    // Default (no modifier) method
	    void defaultMethod() {
	        System.out.println("This is a default method");
	    }

	    public static void main(String[] args) {
	    	AcessModifiers demo = new AcessModifiers();

	        System.out.println(demo.publicField);
	        System.out.println(demo.privateField); // This will result in a compilation error
	        System.out.println(demo.protectedField);
	        System.out.println(demo.defaultField);

	        demo.publicMethod();
	        demo.privateMethod(); // This will result in a compilation error
	        demo.protectedMethod();
	        demo.defaultMethod();

	}

}
