package labloop.labdowhile;

public class b1 {
    public static void main(String[] args) {
        int i = 10;
        do {
            if (i % 7 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 70);
    }
}
