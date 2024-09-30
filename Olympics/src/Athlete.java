public class Athlete {
    private String name;
    private Grade[] grades;
    private int count;

    public Athlete(String name, int maxGrades) {
        this.name = name;
        this.grades = new Grade[maxGrades];
        this.count = 0;
    }

    public Athlete(Athlete other) {
        this.name = other.name;
        this.grades = new Grade[other.grades.length];
        if (other != null) {
	        for (int i = 0; i < other.count; i++) {
	            this.grades[i] = new Grade(other.grades[i]);
	        }
        }
        this.count = other.count;
    }

    public boolean addGrade(String apparatus, double score) {
        if (count < grades.length) {
            grades[count] = new Grade(apparatus, score);
            count++;
            return true;
        }
        return false;
    }

    public boolean deleteGrade(String apparatus) {
        for (int i = 0; i < count; i++) {
            if (grades[i].getApparatus().equals(apparatus)) {
                for (int j = i; j < count - 1; j++) {
                    grades[j] = grades[j + 1];
                }
                grades[count - 1] = null;
                count--;
                return true;
            }
        }
        return false;
    }

    public double average() {
        if (count == 0) {
            return -1;
        }
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += grades[i].getScore();
        }
        return sum / count;
    }

    public boolean allGradesAbove(double number) {
        for (int i = 0; i < count; i++) {
            if (grades[i].getScore() <= number) {
                return false;
            }
        }
        return true;
    }

    public boolean isBetter(Athlete other) {
        for (int i = 0; i < count; i++) {
            String myApparatus = grades[i].getApparatus();
            double myScore = grades[i].getScore();

            boolean foundBetter = false;
            for (int j = 0; j < other.count; j++) {
                if (other.grades[j].getApparatus().equals(myApparatus)) {
                    if (other.grades[j].getScore() >= myScore) {
                        foundBetter = true;
                    }
                }
            }

            if (!foundBetter) {
                return true; 
            }
        }
        return false; 
    }
    
    
    
    
}


