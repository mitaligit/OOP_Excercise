
public class Stereo {
	private boolean musicOn = false;

	public boolean isMusicOn() {
		return musicOn;
	}
	public Stereo(boolean musicon)
	{
		this.musicOn = musicon;

	}
	public boolean turnMusicOn()
	{
		System.out.println("Music is on : ohhlala ohlala");
		this.musicOn = true;
		return this.musicOn;
	}
	public boolean turnMusicOff()
	{
		System.out.println("Music is off");
		this.musicOn = false;
		return this.musicOn;
	}
}
