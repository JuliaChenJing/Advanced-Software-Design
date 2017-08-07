
public class Off implements FanState{
	CeilingFan fan;
	
	public Off(CeilingFan fan, boolean start) {
		this.fan=fan;
		if (!start) 
			System.out.println( "turning off" );
	}

	public void pullgreen() {
	      Low newstate = new Low(fan);
	      fan.setState(newstate);	      
	}
	
	public void pullred() {
	      High newstate = new High(fan);
	      fan.setState(newstate);
	}
}
