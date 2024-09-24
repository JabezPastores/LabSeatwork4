public class HomeApp {
    public static void main(String[]args){
        HomeService light = new Light();
        HomeService tv = new TV();
        HomeService airConditioning = new AirConditioning();
        HomeInterface facade = new HomeInterface(light, tv, airConditioning);

        facade.turnOffAll();
        facade.turnOnALl();

    }
}
