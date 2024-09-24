public class TV implements HomeService{


    @Override
    public void turnOn() {
        System.out.println("The Tv is On");
    }

    @Override
    public void turnOff() {
        System.out.println("The Tv is Off");
    }
}
