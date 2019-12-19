package objectOrientedConceptsInJava;


/**
 * Creating a class:
 *<br> A class is created by using the <i>class</i> keyword.
 *<br> Classes form the basis of Object-Oriented Programming, and are the blueprint to the creation of objects.
 */
public class Main {
	
	public Main(){
		System.out.println("Hi! I am a class");
	}

	/**
	 * An object can have more than one constructor. Constructors are identified by their <i>parameters</i>.
	 * <p>Changing a method by altering their parameters is known as method overloading, or runtime polymorphism.
	 * Static polymorphism is achieved by altering either the types or number of parameters in a method.</p>
	 * <p>The other form of polymorphism is method overriding, or compile time polymorphism. 
	 * In method overriding, you change the actual method body whilst keeping the same method signature.
	 * The <code>@Override</code> is used to indicate an overriden method. If the method does not override any other method, an excpetion will be thrown. </p>
	 * */
	public Main(String text) {
		System.out.println("I am printing some text..." + text);
	}

	/**
	 * An example of static polymorphism, this time altering both the type and the number of paramters.
	 * <p>It is important to note that static polymorphism can never be achieved by simply altering the <i>return type of a method</i></p>
	 * */
	public Main(int num1, int num2) {
		System.out.println("I am printing 2 numbers..." + num1 + num2);
	}

	/**
	 * A pivotal component of Object-Oriented Programming is <i>encapsulation</i>
	 * Encapsulation protects data (i.e. variables) and allows flexibility in the modification and access of data.
	 * Encapsulation is accomplished by <b>data hiding</b>. 
	 * <p>Data hiding is implemented via the access modifiers: Public; Default; Protected; Private. </p> 
	 * <ul>
	 * <li>Public: Accessible from anywhere.
	 * <li>Default: Accessible from any class within the same package.
	 * <li>Protected: Accessible from any subclass (see inheritance), even if the subclass is in a different package.
	 * <li>Private: Accessible only from within the class it was declared. 
	 * </ul>
	 * */
	
	private int num; //not available in subclass
	private String str; //not available in subclass
	public float decimal; //available in subclass

	/**
	 * In order to access and modify private variables, Getters and Setters are used.
	 * <br> Getters return the variable;
	 * <br> Setters modify the variable.
	 * <br> Using Getters and Setters ensures that the variable itself is never directly altered and that you can control how it is accessed and modified.
	 * */
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		// Only set a value to num if it is positive.
		//Using a Setter I can 
		if(num > 0) {
			this.num = num;
		}
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	

	/**
	 * This is a constructor. A constructor is a method that is called when the object is intantinated. 
	 * <p>A constructor can be used to initalized instance variables and perform actions upon object creation.
	 * A constructor has the same name as the class and has no return type - not even void.</p>
	 * If no constructor is provided, the compiler generates a default, no parameter constructor, with default values.
	 * <br>You can have as many constructors as you wish.
	 */

	
	
	public void greeting() {
		System.out.println("Hi!");
	}
	
	public void greeting(int num) {
		System.out.println(num);
	}




	public static void main(String[] args) {
		// Instantiating the objects. The new keyword is used to declare an object of a class.
		Main superObject = new Main();
		Main superObject2 = new Main("Superclass");
		Subclass subObject = new Subclass();
		
		System.out.print("\n");
		System.out.print("Superclass greeting: "); 
		superObject.greeting();
		System.out.print("\n");
		
		System.out.print("Superclass greeting (2): "); 
		superObject2.greeting(19);
		System.out.print("\n");
		
		System.out.print("Subclass greeting: "); 
		subObject.greeting();
		System.out.print("\n");
		/**
		 * As we can see, dynamic binding (method overriding) occurs and the subclass's version of 
		 * the greeting() method is called. 
		 * Static binding (compile time polymorphism) is also demonstrated by the superObject2, calling
		 * the overloaded greeting(int num) method.
		 * */
	}

}
