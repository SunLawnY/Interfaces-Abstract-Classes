public interface Runnable extends Moveable  {

    public default void run() {
        System.out.println(this.getClass().getSimpleName() + " is being driven!");
    }
}
