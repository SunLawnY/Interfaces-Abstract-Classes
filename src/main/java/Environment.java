import java.util.ArrayList;
import java.util.List;

public abstract class Environment<T> {

    protected List<T> traffic = new ArrayList<>();

    public void checkTraffic(){

    };

    public abstract void checkVehicles();

    public void addTraffic(T traffic) {
        this.traffic.add(traffic);
    }

}