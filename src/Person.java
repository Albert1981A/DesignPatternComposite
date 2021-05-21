
public class Person extends Entity{

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void introducesYourself() {
        System.out.println("Hi my name is " + name);
    }
}
