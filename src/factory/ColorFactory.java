package factory;

import factory.abstractfac.AbstractFactory;
import factory.concrete.Green;
import factory.concrete.Red;

/**
 * Created by sampathb on 10/13/2016.
 */
public class ColorFactory extends AbstractFactory
{
	@Override
	public Shape getShape( String shape )
	{
		return null;
	}

	public Color getColor( String color )
	{
		if( "RED".equalsIgnoreCase( color ) )
		{
			return new Red();
		}
		else if( "GREEN".equalsIgnoreCase( color ) )
		{
			return new Green();
		}
		return null;
	}

}
