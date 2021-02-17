package Car;


/**
 * Dogs have hair colour and type
 * As defined here they can only type
 * 
 * @author Arianna
 * @version 11/02/21
 */
public class Dog
{
    // fields
    private String colour;
    private String hair;
    private int age;

  /**
     * Constructor for objects of class DOG
     * Construct a new dog object
     * 
     * @param   col         a string for colour of dogs hair
     * @param   hairtype    a string for type of hair the dog has
     * @param   years       int giving dogs age in years
     */
    public Dog(String col, String hairtype, int years)
    {
        // initialise instance variables
        colour = col;
        hair = hairtype;
        age = years;
    }

  /**
     * print "Woof!"
     */
    public void bark(){
        System.out.println("Woof!");
    }
    
  /**
     * returns age
     */
    public int getAge(){
        return age;
    }
    
  /**
     * returns age in dogs years
     */
    public double dogYears() {
        double dogAge; // declare variables
        if (this.age <= 2) {
            dogAge = this.age * 10.5;
        } else {
            dogAge = ((this.age - 2) + 4) + 21;
        }
        return dogAge;
    }
  
  /**
   * returns colour
   */
  public String getColour(){
      return colour;
  }
    
   /**
   * Main
   * Create two dogs. Make them bark
   */
  public static void main(String[] args) {
      Dog noodle = new Dog("white", "short", 5);
      Dog kimchi = new Dog("tan", "fluffy", 1);
      Dog fruitloop = new Dog("grey", "fluffy", 2);
      noodle.bark();
      kimchi.bark();
      System.out.println(noodle.getAge());
      System.out.println(kimchi.getAge());
      System.out.println(fruitloop.getAge());
      System.out.println(noodle.dogYears());
      System.out.println(kimchi.dogYears());
      System.out.println(fruitloop.dogYears());
   }
 }

