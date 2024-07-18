package labloop.labfor;

public class b1 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 200; i <= 600; i++) {
            if (i % 3 == 0) {
                count++;
                sum += i;
            }
        }
        System.out.println("Sum: " + sum);
        double average = (double) sum / count;
        System.out.println("Average: " + average);
    }
}
