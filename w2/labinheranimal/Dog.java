package w2.labinheranimal;

public class Dog extends Mammal {
    private int barkFrequency;

    public Dog(int eyeColor, int barkFrequency) {
        super(eyeColor);
        this.barkFrequency = barkFrequency;
    }

    public void bark() {
        System.out.println("Woof! Woof! Bark frequency: " + barkFrequency);
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Bark frequency: " + barkFrequency);
    }
}
