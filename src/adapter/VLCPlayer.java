package adapter;

/**
 * Created by sampathb on 10/13/2016.
 */
public class VLCPlayer implements AdvancedMediaPlayer
{
	@Override
	public void playMp4( String clip )
	{
		// Do nothing
	}

	@Override
	public void playVLC( String clip )
	{
		System.out.println( "Playing VLC : " + clip );
	}
}
