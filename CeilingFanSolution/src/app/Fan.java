package app;

public class Fan {
	FanState state;
	
	public void setState(FanState state) {
		this.state = state;
		state.showState();
	}

	public void pullgreen() {
	      state.pullgreen();
	}
	
	public void pullred() {
		state.pullred();
	}


}
