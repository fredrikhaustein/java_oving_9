package inheritance;

public class TrainCar {

	int weight;
	private int deadWeight;
	
	TrainCar(int weight){
		this.weight = weight;
		this.deadWeight = weight;
	}
	
	int getTotalWeight() {
		return weight;
	}
	
	void setDeadWeight(int deadWeigth) {
		this.deadWeight = deadWeigth;
	}
	
	int getDeadWeight() {
		return this.deadWeight;
	}
	
}
