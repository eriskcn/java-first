package w2.laboop.labarrayobj;

public class SinhVien {
    private String id;
    private String name;
    private int age;

    SinhVien() {
        this.id = "";
        this.name = "";
        this.age = 0;
    }

    SinhVien(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void display() {
        System.out.println("STUDENT's INFORMATION");
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age + " years old");
    }
}
