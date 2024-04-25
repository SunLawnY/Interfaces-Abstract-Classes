public class Water extends Environment<Swimmable> {


    @Override
    public void checkTraffic() {
        for ( Swimmable trafficObj : traffic) {
            System.out.println(trafficObj.getClass().getSimpleName() + " is swimming!");
        }
    }
}
