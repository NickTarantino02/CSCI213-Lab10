/* Car.java


*/

public class Car extends Vehicle {
	private int doors;
	private int passengers;

	public Car(String make, String model, String plate, int doors, int passengers) {
		super(make, model, plate);
	}
	
	public int getDoors() {
		return this.doors;
	}
	
	public int getPassengers() {
		return this.passengers;
	}
	
	public String toString() {
		String result = String.format("%d-door %s%s with license %s.", getDoors(), getMake(), this.getModel(), this.getPlate());
		return result;
	}
	
	public boolean equals(Object car) {
			if(!(car instanceof Car)) {
				return false;
			}
			
			Car other = (Car) car;
			if(this.doors == other.doors)
				if(this.passengers == other.passengers)
					super.equals(other);
			return false;
	}
	
	public Car copy() {
		String newMake = getMake(); 
		String newModel = getModel(); 
		String newPlate = getPlate();
		int newDoors = getDoors(); 
		int newPassengers = getPassengers();
		
		Car copy = new Car(newMake, newModel,  newPlate, newDoors, newPassengers);
		return copy;
	}

}