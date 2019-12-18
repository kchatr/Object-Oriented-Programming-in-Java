package objectOrientedConceptsInJava;
/**
 * In Object-Oriented Programming you can use <i>inheritance</i>, a means that allow related classes to share methods and public variables.
 * <p>A subclass inherits all of the non-private methods of its superclass (class it is extending from).
 * It also has the flexibility to add its own methods and variables.</p> 
 * <p>A subclass can also be the superclass to other classes, leading to an inheritance hierarchy. 
 * A subclass can extend only one class, but implement multiple interface (see <i>Abstraction</i>
 * Despite its name a subclass is actually larger that a superclass as it contains more methods and variables.</p>
 * <p>It is important to note that constructors are never inherited. If no constructor is provided, 
 * the compiler will use the default no-parameter constructor in the superclass. If no default constructor is provided, an error will be thrown</p>
 * */
public class Subclass extends Main implements Interface {
	/**
	 * Here is an example of method overriding, as discussed in the <code><Main</code> class.
	 * These methods override the methods declared in the interface, <code>Interface</code>.
	 * */
	@Override
	public void sayHi() {
		System.out.println("Bonjour mon ami!");
	}

	@Override
	public void sayGoodbye() {
		System.out.println("Au revoir.");
		
	}
	/**
	 * These methods override the methods inherited from the <code>Main</code> class.
	 * <br> This is an example of how compile time polymorphism is commonly achieved.
	 * */
	@Override
	public void greeting() {
		System.out.println("Welcome to the subclass.");
	}
	

}
