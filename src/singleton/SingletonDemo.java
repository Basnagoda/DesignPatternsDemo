package singleton;

/**
 * Created by sampathb on 10/13/2016.
 */
public class SingletonDemo
{
	// This is the private Constructor. This will make sure that SingletonDemo class cannot be instantiated.
	private SingletonDemo(){};

	// This is the only instance that we are creating.
	private static SingletonDemo instance = new SingletonDemo();

	// This public method expose the single instance to the outside world
	public static SingletonDemo getInstance()
	{
		return instance;
	}

	public void showMsg()
	{
		System.out.println( "Hello there, I'm from Singleton class " );
	}
}
