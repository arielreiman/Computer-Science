public class Volcano {
    private String name;
    private int[] degrees;
    private int count;

    public Volcano(String name, int size) {
        this.name = name;
        degrees = new int[size];
        this.count = 0;
    }

    public Volcano(Volcano v) {
        this.name = v.name;
        this.degrees = new int[v.degrees.length];
        for (int i = 0; i < v.count; i++) {
            degrees[i] = v.degrees[i];
        }
        this.count = v.count;
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public boolean add(int d) {
        if (this.count < this.degrees.length) {
            degrees[count] = d;
            count++;
            return true;
        }
        return false;
    }

    public void delete(int o) {
        if (o >= 0 && o < count) {
            for (int i = o; i < count - 1; i++) {
                degrees[i] = degrees[i + 1];
            }
            degrees[count - 1] = 0;
            count--;
        }
    }

    public void deleteAll() {
        for (int i = 0; i < degrees.length; i++) {
            degrees[i] = 0;
        }
        count = 0;
        System.out.println("ALL DELETED");

    }

    public void fix(int i, int t) {
        if (i >= 0 && i < count) {
            degrees[i] = t;
        }
    }

    public double average() {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += degrees[i];
        }
        return (double) sum / count;
    }

    public int maxUnder(int x) {
        int max = 0;
        for (int i = 0; i < count; i++) {
            if (degrees[i] > max && degrees[i] < x) {
                max = degrees[i];
            }
        }
        return max ;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ") " + degrees[i]);
        }
    }

    public String toString() {
        return "NAME: " + name + " COUNT: " + count + " SIZE: " + degrees.length;
    }
}