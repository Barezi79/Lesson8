package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BoxOfSnakes extends Snake {
	
	public BoxOfSnakes() {
		super(true);
		
	}

	public static List<Snake> createListOfSnakesWithThatAreRandomlyVenomous() {

		boolean venomous = new Random().nextBoolean();
		List<Snake> snakes = new ArrayList<Snake>();
		for (int i = 0; i < 40; i++) {
			snakes.add(new Snake(venomous));
			venomous = new Random().nextBoolean();
		}

		return snakes;
	}

}


