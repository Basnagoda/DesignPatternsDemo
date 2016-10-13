package factory.abstractfac;

import factory.Color;
import factory.ColorFactory;
import factory.Shape;
import factory.ShapeFactory;

/**
 * Created by sampathb on 10/13/2016.
 */
public abstract class AbstractFactory
{
	public static AbstractFactory getFactory( String type )
	{
		if( "SHAPE".equalsIgnoreCase( type ) )
		{
			return new ShapeFactory();
		}
		else if( "COLOR".equalsIgnoreCase( type ) )
		{
			return new ColorFactory();
		}
		return null;
	}

	public abstract Shape getShape( String shape );

	public abstract Color getColor( String color );
}
