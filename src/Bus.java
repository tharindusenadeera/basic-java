public class Bus {
    public String model;
    public String color;
    public int seats;

    public void display() {
        System.out.println("Model is " + model);
        System.out.println("Color is " + color);
        System.out.println("Number of seats are " + seats);
    }

    public void initialize(String model_name, String color_type, int i) {
        model = model_name;
        color = color_type;
        seats = i;
    }
}
