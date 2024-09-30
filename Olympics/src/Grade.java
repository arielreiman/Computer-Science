public class Grade {
    private String apparatus;
    private double score;

    public Grade(String apparatus, double score) {
        this.apparatus = apparatus;
        this.score = score;
    }

    public Grade(Grade other) {
        this.apparatus = other.apparatus;
        this.score = other.score;
    }

    public String getApparatus() {
        return apparatus;
    }

    public double getScore() {
        return score;
    }

    public void setApparatus(String apparatus) {
        this.apparatus = apparatus;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
