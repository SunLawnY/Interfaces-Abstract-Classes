public abstract  class Bird extends Animal implements Flyable{


    public Bird(String direction) {
        super(direction);
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " is flying!");
    }
}
