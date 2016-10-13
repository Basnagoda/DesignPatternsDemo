package factory.concrete;

import factory.Color;

/**
 * Created by sampathb on 10/13/2016.
 */
public class Green implements Color
{

	@Override
	public void paint()
	{
		System.out.println( "Painted with Green color!!!" );
	}
}
