
public class Car extends Vehicle{
	
	public int windows = 0;
	public int wheels = 0;
	public int steeringWheel = 0;
	public String color = null;
	public int seats = 0;
	
	
	public Car(int windows, int wheels, int steeringWheel, String color, int seats) {
		super();
		this.windows = windows;
		this.wheels = wheels;
		this.steeringWheel = steeringWheel;
		this.color = color;
		this.seats = seats;
	}


	public Car() {
		super();
	}


	public int getWindows() {
		return windows;
	}


	public void setWindows(int windows) {
		this.windows = windows;
	}


	public int getWheels() {
		return wheels;
	}


	public void setWheels(int wheels) {
		this.wheels = wheels;
	}


	public int getSteeringWheel() {
		return steeringWheel;
	}


	public void setSteeringWheel(int steeringWheel) {
		this.steeringWheel = steeringWheel;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getSeats() {
		return seats;
	}


	public void setSeats(int seats) {
		this.seats = seats;
	}
		
	public void starts(){
		
	}
	
	public void stop(){
		
	}
	
	

}
