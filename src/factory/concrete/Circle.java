package factory.concrete;

import factory.Shape;

/**
 * Created by sampathb on 10/13/2016.
 */
public class Circle implements Shape
{
	@Override
	public void draw()
	{
		System.out.println( "Inside Circle draw method!!! " );
	}
}
