package w2.labinheranimal;

public class GermanShepherd extends Dog {
    public GermanShepherd(int eyeColor, int barkFrequency) {
        super(eyeColor, barkFrequency);
    }

    public void isGerman() {
        System.out.println("I am a German Shepherd");
    }
}
