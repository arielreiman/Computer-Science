
public class Grade {
	private String apparatus;
	private int score;
	
	public Grade(String apparatus, int score) {
		this.apparatus = apparatus;
		this.score = score;
	}
	public Grade(Grade s1) {
		this.apparatus = s1.getApparatus() ;
		this.score = s1.getScore();
	}
	
	public String getApparatus() {
		return apparatus;
	}
	public void setApparatus(String apparatus) {
		this.apparatus = apparatus;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}
