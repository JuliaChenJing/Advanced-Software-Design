
public class CeilingFan {
	FanState state;
	
	public void setState(FanState state) {
		this.state = state;
	}

	public void pullgreen() {
	      state.pullgreen();
	}
	
	public void pullred() {
		state.pullred();
	}


}
