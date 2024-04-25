public class Sky extends Environment <Flyable>{

    @Override
    public void checkTraffic() {
       for ( Flyable trafficObj : traffic) {
           System.out.println(trafficObj.getClass().getSimpleName() + " is flying!");
       }
    }


}
