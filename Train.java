package inheritance;

import java.util.ArrayList;

public class Train {
	

	ArrayList<TrainCar> train = new ArrayList<>();
	
	public void addTrainCar(TrainCar trainCar){
		this.train.add(trainCar);
	}
	
	public boolean contains(TrainCar trainCar) {
		if (!train.contains(trainCar)) {
			return false;
		}
		return true;
		
	}
	
	int getTotalWeight() {
		return (int) train.stream().mapToInt(t1 -> t1.getTotalWeight()).sum();
//		int count = 0;
//		for (TrainCar trainCar : train) {
//			count += trainCar.getTotalWeight();
//		}
//		return count;
	}
	
	int getPassengerCount() {
		return (int) train.stream()
				.filter(t1 -> t1 instanceof PassengerCar)
				.mapToInt(t1 -> ((PassengerCar)t1).getPassengerCount()).sum();
	}
	
	int getCargoWeight() {
		return (int) train.stream()
				.filter(t1 -> t1 instanceof CargoCar)
				.mapToInt(t1 -> ((CargoCar)t1).getCargoWeight()).sum();
		
	}
	
	@Override
	public String toString() {
		return "Toget har" + getPassengerCount() + " passasjerer og har en cargovekt på "+ getCargoWeight() + "kg og har en samlet vekt på " + getTotalWeight();
		
	}
	
	public static void main(String[] args) {
		Train t1 = new Train();
		PassengerCar p1 = new PassengerCar(1000, 30);
		PassengerCar p2 = new PassengerCar(800, 15);
		PassengerCar p3 = new PassengerCar(500, 20);
		CargoCar c1 = new CargoCar(4000,1000);
		CargoCar c2 = new CargoCar(5000,500);
		CargoCar c3 = new CargoCar(6000,400);
		t1.addTrainCar(p1);
		t1.addTrainCar(p2);
		t1.addTrainCar(c1);
		t1.addTrainCar(c2);
//		System.out.println(t1.getPassengerCount());
//		System.out.println(t1.getCargoWeight());
		System.out.println(t1.getTotalWeight());
	}
}
