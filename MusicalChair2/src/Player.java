
public class Player implements Runnable{
	@Override
	public String toString() {
		return "Player [t=" + t + ", name=" + name + ", ismoving=" + isMoving
				+ ", issitting=" + isSitting + ", isstanding=" + isStanding
				+ ", g=" + g + ", c=" + c + ", stopFlag=" + stopFlag
				+ ", requestMove=" + requestMove + ", requestSit=" + requestSit
				+ ", requestStand=" + requestStand + "]";
	}
	Thread t;
	String name;
	boolean isMoving = false;
	boolean isSitting = false;
	boolean isStanding = true;
	Game g;
	Chair c;
	boolean stopFlag;
	boolean requestMove;
	boolean requestSit;
	boolean requestStand;
	
	public Player(String name, Game g)
	{
		this.name = name;
		t = new Thread(this, this.name);
		this.g = g;
		this.isSitting = false;
		this.isMoving = false;
		this.isStanding = false;
		this.stopFlag = false;
		this.requestMove = false;
		this.requestSit = false;
		this.requestStand = false;
		t.start();
	}
	public void run()
	{
		while(true)
		{
			System.out.println(" Player state: " + this);
			if(requestSit == true)
			{
				sit();
				requestSit = false;
			}
			if(requestMove == true)
			{
				System.out.println("player is moving" + this);
				move();
				requestMove=false;
				System.out.println("player started moving" + this);
			}
			if(requestStand == true)
			{
				stand();
				requestStand=false;
			}
			if(stopFlag == true)
			{
				break;
			}
			try {
				Thread.sleep(Game.sleeptTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void setRequestMove()
	{
		requestMove = true;
	}
	public void setRequestSit()
	{
		requestSit = true;
	}
	public void setRequestStand()
	{
		requestStand = true;
	}
	public void setStopFlag()
	{
		stopFlag = true;
	}
	public boolean getIsMoving()
	{
		return isMoving;
	}
	public boolean getIsSitting()
	{
		return (isSitting);
	}
	public boolean getIsStanding()
	{
		return(isStanding);
	}
	
public boolean sit()
{
	try {

		for(Chair c: g.sc)
		{
			boolean sat = c.fillChair();
			if (sat ) 
			{
				isSitting = true;
				isMoving = false;
				isStanding = false;
				break;
			}
			
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println(" Player was able to sit :" + isSitting);
	return isSitting;
}
public boolean getStopFlag()
{
return (stopFlag);
}

public boolean move()
{
	isMoving = true;
	isStanding = false;
	isSitting = false;
	return isMoving;
}
public boolean stand()
{
	isStanding = true;
	isSitting = false;
	isMoving = false;
	return isStanding;
}

}
