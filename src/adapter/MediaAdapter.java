package adapter;

/**
 * Created by sampathb on 10/13/2016.
 */
public class MediaAdapter implements MediaPlayer
{
	AdvancedMediaPlayer advancedMediaPlayer;

	public MediaAdapter( String clipType )
	{
		if( "mp4".equalsIgnoreCase( clipType ) )
		{
			advancedMediaPlayer = new Mp4Player();
		}
		else if( "vlc".equalsIgnoreCase( clipType ))
		{
			advancedMediaPlayer = new VLCPlayer();
		}
	}

	public void play( String clipType, String clip )
	{
		if( "mp4".equalsIgnoreCase( clipType ) )
		{
			advancedMediaPlayer.playMp4( clip );
		}
		else if( "vlc".equalsIgnoreCase( clipType ))
		{
			advancedMediaPlayer.playVLC( clip );
		}
		else
		{
			System.out.println( "Unsupported format!!! ->" + clipType );
		}
	}
}
