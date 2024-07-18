package labloop.labwhile;

public class b1 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("Sum: " + sum);
    }
}
