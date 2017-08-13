package app;

public class High implements FanState{
	Fan fan;
	
	public High(Fan fan) {
		this.fan=fan;
		
	}

	public void pullgreen() {
	      Off newstate = new Off(fan, false);
	      fan.setState(newstate);
	}
	
	public void pullred() {
	      Medium newstate = new Medium(fan);
	      fan.setState(newstate);
	}

	public void showState() {
		System.out.println( "high speed" );
		
	}
}
