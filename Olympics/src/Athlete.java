
public class Athlete {
	private String name;
	private Grade[] grades;
	private int count;
	public Athlete(String name, int size, int count) {
		this.name = name;
		this.grades =  new Grade[size];
		this.count = 0;
	}
	public Athlete(Athlete s1) {
		this.name = s1.name;
		this.count = s1.count;
		for (int i=0;i<grades.length;i++){
			this.grades[i]=s1.grades[i];
		}
	}
	
}
