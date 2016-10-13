package adapter;

/**
 * Created by sampathb on 10/13/2016.
 *
 * AudioPlayer can play mp3 format audio files by default.
 */
public class AudioPlayer implements MediaPlayer
{
	MediaAdapter mediaAdapter;

	@Override
	public void play( String clipType, String clip )
	{
		if( "mp3".equalsIgnoreCase( clipType ) )
		{
			// Only mp3 files are supported from this player...
			System.out.println( "Playing Mp3" + clip );
		}
		else
		{
			mediaAdapter = new MediaAdapter( clipType );
			mediaAdapter.play( clipType, clip );
		}
	}
}
