package w2.labinheranimal;

public class Cat extends Mammal {
    private int meowFrequency;

    public Cat(int eyeColor, int meowFrequency) {
        super(eyeColor);
        this.meowFrequency = meowFrequency;
    }

    public void meow() {
        System.out.println("Meow! Meow! Meow frequency: " + meowFrequency);
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Meow frequency: " + meowFrequency);
    }
}
