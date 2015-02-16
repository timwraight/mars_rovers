package mars_rovers;
import java.awt.Point;
import java.util.ArrayList;

import mars_rovers.Rover;

public class World {
	Point upperRight;
	ArrayList<Rover> rovers;
	
	public World(Point upperRight) {
		this.upperRight = upperRight;
	}
	
}
