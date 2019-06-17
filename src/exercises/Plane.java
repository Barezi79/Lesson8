package exercises;

import java.util.List;

public class Plane {

		BoxOfSnakes BOS = new BoxOfSnakes();
		

		public void addSnakes() {
			
			BoxOfSnakes.createListOfSnakesWithThatAreRandomlyVenomous();

		}

		public int getNumberOfVenomousSnakes() {
			
			int count = 0;
			 
			List<Snake> snakes = BoxOfSnakes.createListOfSnakesWithThatAreRandomlyVenomous();
			for (Snake snake : snakes) {
				if (snake.isVenomous()) {
					count++;
				}
			}
			return count;
		}
	}


