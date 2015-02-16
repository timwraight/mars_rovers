package mars_rovers;
import java.awt.Point;
import mars_rovers.Orientation;

public class Rover {
	// we need a way to store position on the surface
	Point location;
	// and orientation
	Orientation orientation;
	
	public Rover(Point location, Orientation orientation) {
		this.location = location;
		this.orientation = orientation;
	}

	public void moveForward() {
		switch (orientation) {
			case NORTH: location.translate(0, 1);
						break;
			case EAST: location.translate(1, 0);
						break;
			case SOUTH: location.translate(0, -1);
						break;					
			case WEST: location.translate(-1, 0);
						break;											
			default: throw new RuntimeException();
		}
	}
	
	public Orientation getOrientation() {
		return orientation;
	}

	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}
} 
