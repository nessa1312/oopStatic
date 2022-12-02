package Animals;

public class Flying extends Birds {
    private String movementType;

    public Flying(String name, int age, String environment, String movementType) {
        super(name, age, environment);
        this.movementType = ValidateUtil.validateString(movementType);
    }

    protected void fly() {

    }

    public String getMovementType() {
        return movementType;
    }

    @Override
    public String toString() {
        return "Flying{" +
                " name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", environment='" + getEnvironment() + '\'' +
                ", movementType='" + movementType + '\'' +
                '}';
    }
}
