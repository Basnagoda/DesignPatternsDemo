package main;

import factory.Shape;
import factory.ShapeFactory;
import singleton.SingletonDemo;

/**
 * Created by sampathb on 10/13/2016.
 */
public class Main
{
	public static void main( String[] args )
	{
		//01. Factory Design Pattern Demo
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape circle = shapeFactory.getShape( "CIRCLE" );
		circle.draw();

		Shape rectangle = shapeFactory.getShape( "RECTANGLE" );
		rectangle.draw();

		Shape triangle = shapeFactory.getShape( "TRIANGLE" );
		triangle.draw();

		// 02. Abstract Factory Pattern


		// 03. Singleton Design pattern
		SingletonDemo singletonDemo = SingletonDemo.getInstance();
		singletonDemo.showMsg();

		// 04. Adapter pattern

	}

}
