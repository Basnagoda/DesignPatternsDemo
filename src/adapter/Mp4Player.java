package adapter;

/**
 * Created by sampathb on 10/13/2016.
 */
public class Mp4Player implements AdvancedMediaPlayer
{
	@Override
	public void playMp4( String clip )
	{
		System.out.println( "Playing MP4: " + clip );
	}

	@Override
	public void playVLC( String clip )
	{
		// Do nothing
	}
}
