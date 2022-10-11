
import static java.lang.System.out;

public class Car {
	private double efficiency;
	private double level = 0;
	private double distance;

	public Car(double _efficiency) {
		if (_efficiency < 0) {
			out.println("User input not valid");
			System.exit(1);
		}
		efficiency = _efficiency;
	}

	public double getFuelLevel() {
		if (level <= 0 || (level - (distance / efficiency)) <= 0)
			return 0;
		if (distance == 0)
			return level;
		return (Math.round((level - (distance / efficiency)) * 100.0) / 100.0);
	}

	public void addFuel(double _level) {
		if (_level < 0) {
			out.println("User input not valid");
			System.exit(1);
		}
		level = _level;
	}

	public void drive(double _distance) {
		if (_distance < 0) {
			out.println("User input not valid");
			System.exit(1);
		}

		distance = _distance;
	}
}
