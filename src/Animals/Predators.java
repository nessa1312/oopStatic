package Animals;

public class Predators extends Mammals {
    private String food;

    public Predators(String name, int age, String environment, int speed) {
        super(name, age, environment, speed);
    }

    public void hunting() {

    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = ValidateUtil.validateString(food);
    }

    @Override
    public String toString() {
        return "Predators{" +
                " name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", environment='" + getEnvironment() + '\'' +
                ", speed=" + getSpeed() +
                ", food='" + food + '\'' +
                '}';
    }
}
