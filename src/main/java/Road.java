public class Road extends Environment<Vehicle> {


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
