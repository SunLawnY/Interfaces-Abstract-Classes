public interface Runnable {

    public default void run() {
        System.out.println(this.getClass().getSimpleName() + " is being driven!");
    }
}
