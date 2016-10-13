package main;

import factory.Color;
import factory.Shape;
import factory.ShapeFactory;
import factory.abstractfac.AbstractFactory;
import singleton.SingletonDemo;

/**
 * Created by sampathb on 10/13/2016.
 */
public class Main
{
	public static void main( String[] args )
	{
		//01. Factory Design Pattern Demo
		System.out.println( "************** Factory Design Pattern Demo ***************");
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape circle = shapeFactory.getShape( "CIRCLE" );
		circle.draw();

		Shape rectangle = shapeFactory.getShape( "RECTANGLE" );
		rectangle.draw();

		Shape triangle = shapeFactory.getShape( "TRIANGLE" );
		triangle.draw();

		// 02. Abstract Factory Pattern
		System.out.println( "************** Abstract Factory Design Pattern Demo ***************");
		AbstractFactory shapeFac = AbstractFactory.getFactory( "SHAPE" );
		Shape circle1 = shapeFac.getShape( "CIRCLE" );
		circle1.draw();

		AbstractFactory colorFac = AbstractFactory.getFactory( "COLOR" );
		Color redClor = colorFac.getColor( "RED" );
		redClor.paint();

		// 03. Singleton Design pattern
		System.out.println( "************** Singleton Design Pattern Demo *************** ");
		SingletonDemo singletonDemo = SingletonDemo.getInstance();
		singletonDemo.showMsg();

		// 04. Adapter pattern

	}

}
