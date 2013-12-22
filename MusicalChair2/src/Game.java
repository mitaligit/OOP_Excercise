import java.util.*;
public class Game {
	static int sleeptTime = 10;
	public static void main(String[] args) throws InterruptedException
	{
		Game g = new Game(2);
	}
	Stereo s;
	Empire emp;
	Set<Chair> sc = new HashSet<Chair>();
	Set<Player> setOfPlayers = new HashSet<Player>();
	public Game(int numofplayer) throws InterruptedException
	{
		s = new Stereo(false);
		emp = new Empire("mitali", this);
		for(int i = 0; i< numofplayer; i++)
		{
			Player p = new Player("mits" + i, this);
			setOfPlayers.add(p);
		}
		for(int n = 0; n <numofplayer-1; n++)
		{
			Chair c = new Chair(false);
			sc.add(c);
		}
		startGame();
	}
	public void startGame() throws InterruptedException
	{
		while(setOfPlayers.size() !=1)
		{
			System.out.println("begining of round");
			emp.startStereo();
			try {
				emp.stopStereo();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			emp.removePlayer();
			emp.removeChair();
			System.out.println("end of round");
		}
		stopGame();
	}
	public void stopGame()
	{
		System.out.println(" stop game called");
		if(setOfPlayers.size() ==1)
		{
			emp.declareWinner();
		}
	}
}

