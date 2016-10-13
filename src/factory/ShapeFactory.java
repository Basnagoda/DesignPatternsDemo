package factory;

import factory.concrete.Circle;
import factory.concrete.Rectangle;
import factory.concrete.Triangle;

/**
 * Created by sampathb on 10/13/2016.
 */
public class ShapeFactory
{
	public Shape getShape( String shape )
	{
		if( "CIRCLE".equalsIgnoreCase( shape ) )
		{
			return new Circle();
		}
		else if( "TRIANGLE".equalsIgnoreCase( shape ) )
		{
			return new Triangle();
		}
		else if( "RECTANGLE".equalsIgnoreCase( shape ))
		{
			return new Rectangle();
		}
		return null;
	}
}
