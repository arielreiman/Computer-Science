
public class CameraInfo {
	private int city;
	private int maxSpeed;
	private CarInfo[] cars;	
	
	public CameraInfo(int city, int maxSpeed, CarInfo[] cars) {
		super();
		this.city = city;
		this.maxSpeed = maxSpeed;
		this.cars = cars;
	}
	
	public int getCity() {
		return city;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	

	public boolean allGood() {
	    for (int i = 0; i < cars.length; i++) {
	        if (cars[i].isPrivateCar() || !(maxSpeed > cars[i].getSpeed())) {
	            return false;
	        }
	    }
	    return true;
	}

	public static int legalCities(CameraInfo[] cameras) {
	    int count = 0;
	    for (CameraInfo camera : cameras) {
	        boolean allGood = true;
	        for (CarInfo car : camera.cars) {
	            if (car.isPrivateCar() || !(camera.getMaxSpeed() > car.getSpeed())) {
	                allGood = false;
	                break;
	            }
	        }
	        if (allGood) {
	            count++;
	        }
	    }
	    return count;
	}

	
}
