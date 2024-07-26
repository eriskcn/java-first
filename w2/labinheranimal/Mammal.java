package w2.labinheranimal;

public class Mammal {
    private int eyeColor;

    public Mammal(int eyeColor) {
        this.eyeColor = eyeColor;
    }

    public int getEyeColor() {
        return this.eyeColor;
    }

    public void displayDetails() {
        System.out.println("Eye color: " + eyeColor);
    }
}