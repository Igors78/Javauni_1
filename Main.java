
import static java.lang.System.out;

public class Main {
	public static void main(String[] args) {
		Car myHybrid = new Car(30);
		myHybrid.addFuel(20);
		myHybrid.drive(100);
		out.println(myHybrid.getFuelLevel());
	}
}
