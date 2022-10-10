public class Car {
	private double efficiency;
	private double level = 0;
	private double distance;

	public Car(double _efficiency) {
		efficiency = _efficiency;
	}

	public double getFuelLevel() {
		if (level <= 0 || (level - (distance / efficiency)) <= 0)
			return 0;
		return (Math.round((level - (distance / efficiency)) * 100.0) / 100.0);
	}

	public void addFuel(double _level) {
		level = _level;
	}

	public void drive(double _distance) {
		distance = _distance;
	}
}
