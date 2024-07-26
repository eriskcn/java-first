package w2.labinheranimal;

public class Poodle extends Dog {
    public Poodle(int eyeColor, int barkFrequency) {
        super(eyeColor, barkFrequency);
    }

    public void isFrench() {
        System.out.println("I am a French Poodle");
    }
}
