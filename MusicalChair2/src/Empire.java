
public class Empire {
	
String name;
Game g;

public Empire(String name, Game g)
{
	this.name = name;
	this.g = g;
}
public boolean startStereo() throws InterruptedException
{
	System.out.println("start stereo function in executing...");
	g.s.turnMusicOn();
	for(Player p:g.setOfPlayers)
	{
		System.out.println("request player p to move" + p);
		p.setRequestMove();
		while(!p.getIsMoving())
		{
			System.out.println("checking if player is moving or not" + p);
			Thread.sleep(Game.sleeptTime);
		}
	}
	System.out.println("players are moving now...");
	return g.s.isMusicOn();
}
public boolean stopStereo() throws Exception
{
	boolean moving = true;
	if(g.s.isMusicOn() == true)
	{
		// verify all players are moving 
		for(Player p:g.setOfPlayers)
		{
			if(p.getIsMoving() == true)
			{
				moving = true;
			}
			else
			{
				moving = false;
				break;
			}
		}
		System.out.println(" Verified that all players are moving ...");
		if(moving == true)
		{
		g.s.turnMusicOff();
		}
		else
		{
			throw new Exception("exception");
		}
	}
	
	// error in logic -- last player would always miss out 
	for(Player p:g.setOfPlayers)
	{
		System.out.println(" Requesting player to sit " + p.name + " sit...");
		p.setRequestSit();
	}
	int count = 0;
	while(!(count == (g.setOfPlayers.size()-1)))
	{
		count = 0;
		for(Player p: g.setOfPlayers)
		{
			if(p.isSitting == true)
			{
				count++;
			}
		}
	}
	
	System.out.println(" All players have sat now .....");
	return !g.s.isMusicOn();
}
public void removeChair()
{
	System.out.println("remove chair function executing...");
	for(Chair c:g.sc)
	{
		g.sc.remove(c);
		break;
	}
	System.out.println("remove chair function has completed....");
}
public void removePlayer() throws InterruptedException
{
	int count = 10;
	Player p1 =null;
	System.out.println(" Remove player executing....");
	while(count>1)
	{
		count = 0;
		if(g.s.isMusicOn() == false)
		{
			p1 =null;
			for(Player p:g.setOfPlayers)
			{
				if(p.getIsSitting() == false)
				{
					p1 = p;
					count++;
				}
			}
		}
	} 	//all players have sat now except the loser player 
	
	p1.setStopFlag();
	while(!p1.getStopFlag())
	{
		Thread.sleep(10);
	}
	g.setOfPlayers.remove(p1);

	System.out.println(" Removed player " + p1);
	//mark all chairs empty
	for(Player p: g.setOfPlayers)
	{
		p.setRequestStand();
		while(!p.getIsStanding())
		{
			Thread.sleep(10);
		}
	}

	for(Chair c:g.sc)
	{
		c.emptyChair();
	}

System.out.println(" Finished one round ...." + g.setOfPlayers.size());	
}
public void declareWinner()
{
	for(Player p:g.setOfPlayers)
	{
		System.out.println(p);
		p.setStopFlag();
	}
}
}
