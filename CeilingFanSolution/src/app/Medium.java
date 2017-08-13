package app;

public class Medium implements FanState{
	Fan fan;
	
	public Medium(Fan fan) {
		this.fan=fan;
		
	}

	public void pullgreen() {
	      High newstate = new High(fan);
	      fan.setState(newstate);
	}
	
	public void pullred() {
	      Low newstate = new Low(fan);
	      fan.setState(newstate);
	}

	public void showState() {
		System.out.println( "medium speed" );
		
	}
}