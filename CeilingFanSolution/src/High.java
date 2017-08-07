
public class High implements FanState{
	CeilingFan fan;
	
	public High(CeilingFan fan) {
		this.fan=fan;
		System.out.println( "high speed" );
	}

	public void pullgreen() {
	      Off newstate = new Off(fan, false);
	      fan.setState(newstate);
	}
	
	public void pullred() {
	      Medium newstate = new Medium(fan);
	      fan.setState(newstate);
	}
}
