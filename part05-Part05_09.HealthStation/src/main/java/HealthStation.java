
public class HealthStation {
    private int weighCounter = 0;

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.weighCounter += 1;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        return weighCounter;
    }

}
