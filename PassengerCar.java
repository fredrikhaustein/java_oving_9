package inheritance;

public class PassengerCar extends TrainCar {

	private int passangers;

	PassengerCar(int weight, int passangers) {
		super(weight);
		this.passangers = passangers;
	}
	@Override
	public int getTotalWeight() {
		return super.getTotalWeight()+(passangers*80);
	}

	public int getPassengerCount() {
		return passangers;
	}
	
	public void setPassengerCount(int passangers) {
		this.passangers = passangers;
	}
	
}
