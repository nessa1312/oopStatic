package Animals;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = ValidateUtil.validateString(name);
        this.age = age;
    }
    public abstract void eat();
    public abstract void sleep();

    public abstract void go();

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = ValidateUtil.validateString(name);
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
