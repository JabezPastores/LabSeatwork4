public class AirConditioning implements HomeService{


    @Override
    public void turnOn() {
        System.out.println("The AirConditioning is On");
    }

    @Override
    public void turnOff() {
        System.out.println("The AirConditioning is Off");
    }
}
