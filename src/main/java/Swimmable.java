public interface Swimmable extends Moveable {


    public default void swim(){
        System.out.println(this.getClass().getSimpleName() + " is swimming!");
    }
}
