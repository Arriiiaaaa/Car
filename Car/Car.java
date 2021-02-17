package Car;


/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    // fields
    private String colour;
    private String model;
    private String owner;
    private int inspeed;
    private int acceleration;

    /**
     * Constructor for objects of class Car
     * Construct a new car object
     * 
     * @param   col         a string for colour of car
     * @param   model       a string for model of car
     * @param   owner       a string for owner of car
     * @param   year        an int giving year of car
     */
    public Car(String col, String mod, String own, int carspeed, int acc)
    {
        // initialise instance variables
        colour = col;
        model = mod;
        owner = own;
        speed = carspeed;
        acceleration = acc;
    }

    /**
     * return colour
     */
    public String getColour() {
        return colour;
    }
    
    /**
     * return model
     */
    public String getModel() {
        return model;
    }
    
    /**
     * return owner
     */
    public String getOwner() {
        return owner;
    }
    
    /**
     * return colour
     */
    public int getSpeed() {
        return speed;
    }
    
    /**
     * returns acceleration
     */
    public int getAcceleration() {
        return acceleration;
    }
    
    
    /**
     * prints "Toot!"
     */
    public void toot() {
        System.out.println("Toot!");
    }
    
    /**
     * Main
     * Create 2 cars
     * 
     */
    public static void main(String[] args)
    {
        Car C1 = new Car("Silver", "Kia Telluride", "Trent", 50, 5);
        Car C2 = new Car("Red", "Hyundai Paliside", "Tent", 30, 20);
        
        C1.toot();
        C2.toot();
        
        System.out.println(C1.getColour());
        System.out.println(C1.getModel());
        System.out.println(C1.getOwner());
        System.out.println(C1.getSpeed());
        
        System.out.println(C2.getColour());
        System.out.println(C2.getModel());
        System.out.println(C2.getOwner());
        System.out.println(C2.getSpeed());
    }
}
