public class Sky extends Environment <Flyable>{

    static int maxSpped = 100;


    @Override
    public void checkTraffic() {
       for ( Flyable trafficObj : traffic) {
           System.out.println(trafficObj.getClass().getSimpleName() + " is flying!");
       }
    }

    @Override
    public void checkVehicles() {
        for ( Flyable trafficObj : traffic) {
            if (trafficObj instanceof Vehicle) {
                System.out.println(trafficObj.getClass().getSimpleName() + " is flying!");
            }
        }
    }
}
