public class Main {
    public static int countAbove(double a, Athlete[] at) {
        int count = 0;
        for (int i = 0; i < at.length; i++) {
            double avg = at[i].average();
            if (avg > a) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Athlete[] at = new Athlete[3]; // מערך של 3 מתעמלות
        
        at[0] = new Athlete("A1", 3); // מתעמלת 1
        at[1] = new Athlete("A2", 3); // מתעמלת 2
        at[2] = new Athlete("A3", 3); // מתעמלת 3
        
        at[0].addGrade("Floor", 9.5); // ציון למתעמלת 1
        at[1].addGrade("Floor", 9.1); // ציון למתעמלת 2
        at[2].addGrade("Floor", 9.3);  // ציון למתעמלת 3
        
        double a = 9.0;
        int count = countAbove(a, at); // 
        
        System.out.println("Number of athletes with average above " + a + ": " + count);
    }
}