package exercises;

public class Snake {
	
	private boolean venomous = true;;

	public Snake(boolean venomous) {
		this.setVenomous(venomous);

	}

	public boolean isVenomous() {
		return venomous;
	}

	public void setVenomous(boolean venomous) {
		this.venomous = venomous;
	}

}


