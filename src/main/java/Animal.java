public abstract class Animal {

    int currentPositionX;
    int CurrentPositionY;
    String direction;

    public Animal(String direction) {
        this.currentPositionX = 0;
        CurrentPositionY = 0;
        this.direction = direction;
    }

    public abstract String makeSound();
}
