package objectOrientedConceptsInJava;

/**
 * <i>Abstraction</i> is another fundamental element in OOP. 
 * <br>Abstraction is the process of hiding the implementation details so only the most essential elements are displayed to the user.
 * Abstraction can be achieved via <b>Abstract Classes</b> and/or <b>Interfaces</b>
 * <p>An interface can be thought of as a completely abstract class that can only contain abstract methods. An interface cannot create objects.
 *  By default, all methods in an interface are abstract and public. All instance variables are public, static, and final. </p>
 *  <p> An abstract class is a class which is declared as abstract, and contain a least 1 abstract method.
 *  Abstract classes can have fields that are not static and final, as well as have methods with varying degress of access (private, protected, default, public).
 *  They cannot be instantiated, but can be subclassed. </p>
 * */
public interface Interface {
	/**
	 * Abstract methods do not contain a message body; they only have the method's signature.
	 * <br>The implementation of these methods is dependent upon the class which implement this interface.
	 * Each class can have their own implementation of these abstract methods.
	 * <br> Both of the following methods are overriden in <code>Subclass</code>.
	 * */
	void sayHi();

	void sayGoodbye();
}

