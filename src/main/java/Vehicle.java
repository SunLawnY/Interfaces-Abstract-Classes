public abstract class Vehicle implements Runnable{

    int currentPositionX;
    int CurrentPositionY;
    String direction;

    public Vehicle(String direction) {
        this.currentPositionX = 0;
        CurrentPositionY = 0;
        this.direction = direction;
    }


    public void move(){

    }
}
