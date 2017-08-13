package app;

public class Low implements FanState{
	Fan fan;
	
	public Low(Fan fan) {
		this.fan=fan;
	
	}

	public void pullgreen() {
	      Medium newstate = new Medium(fan);
	      fan.setState(newstate);
	}
	
	public void pullred() {
	      Off newstate = new Off(fan, false);
	      fan.setState(newstate);
	}

	public void showState() {
		System.out.println( "low speed" );
		
	}
}