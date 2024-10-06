
public class CharInfo {
	
	public boolean illegal(int maxSpeed) {
		return (this.privateCar || maxSpeed>this.speed);
	}
	
	public boolean allGood() {
		for(int i=0; icars.length;i++) {
			if (cars[i]).getPrivateCar()||maxSpeed>car[i].getSpeed()==false){
				return false;
			}
		}
		return true;
	}
	
	public int legalCities(CameraInfo cameras) {
		int count=0;
		for (int i=0;i<cameras.length;i++) {
			for(int w =0;w<cameras[i].getCars().length;w++) {
				if(cameras[i].cars[w].getPrivateCar||cameras[i].getMaxSpeed>cameras[i].cars[w].getSpeed()==false) {
					count++;
				}
				return count;
			}
		}
	}
}
