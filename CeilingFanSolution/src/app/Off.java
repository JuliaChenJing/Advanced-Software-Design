package app;

public class Off implements FanState{
	Fan fan;
	
	public Off(Fan fan, boolean isOn) {
		this.fan=fan;
		if (!isOn) 
			System.out.println( "turning off" );//from on to Off
		
	}

	public void pullgreen() {
	      Low newstate = new Low(fan);
	      fan.setState(newstate);	      
	}
	
	public void pullred() {
	      High newstate = new High(fan);
	      fan.setState(newstate);
	}

	public void showState() {
		System.out.println( " off" );
	}
}
