package inheritance;

public class CargoCar extends TrainCar{

	private int cargoweight;

	CargoCar(int weight, int cargoweight ) {
		super(weight);
		this.cargoweight = cargoweight;
	}
	
	@Override
	public int getTotalWeight() {
//		System.out.println(super.getTotalWeight());
//		System.out.println(cargoweight);
		return super.getTotalWeight()+this.cargoweight;
	}
	
	public int getCargoWeight() {
		return cargoweight;
	}
	
	public void setCargoWeight(int cargoweigth){
		this.cargoweight = cargoweigth;
	}
	
	
}
