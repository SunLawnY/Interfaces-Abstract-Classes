public class Road extends Environment<Vehicle> {

    static int maxSpped = 70;

    @Override
    public void checkTraffic() {
        for ( Vehicle trafficObj : traffic) {
            System.out.println(trafficObj.getClass().getSimpleName() + " is being driven");
        }
    }

    @Override
    public void checkVehicles() {
        for ( Vehicle trafficObj : traffic) {
            System.out.println(trafficObj.getClass().getSimpleName() + " is being driven");
        }
    }
}
