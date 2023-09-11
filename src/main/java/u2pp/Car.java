package u2pp;

/**
 * This class represents a car‘s gas intake and consumption
 * 
 * @author Chae Geon Lim
 */
 
public class Car {
    private double gas; //The amount of gas in the tank
    private double mpg; //The fuel efficiency of the car in miles per gallon
    private String make; //The make of the car
    private String model; //The model of the car
    
    /**
     * I understand
     * 
     * @param anEfficiency - the efficiency of the Car
     * @param aMake - the make of the Car
     * @param aModel - the model of the Car
     */ 
    public Car(double anEfficiency, String aMake, String aModel) {
       //assign the parameters for the group a variable	
    	make = aMake;
    	model = aModel;
        mpg = anEfficiency;
    }
    
    /**
     * @return amount, specified as param, plus the gas already in tank, gas should rise accordingly ... use double for param 
     * @param amount - the amount of gas to add to the tank
     */
    public void addGas (double amount) {
        //amount is added to gas
    	gas += amount;
    }
    
    /**
     * mpg = the efficiency
     * @param distance - the distance that the car has driven
     */
    public void drive (double distance) {
        //Gas should go down for the distance traveled based on efficiency
    	gas -= (distance / mpg);
    }
    
    /**
     * @return The amount of gas currently in the tank
     */
    public double getGasInTank() {
        //YOUR CODE HERE
        return gas;
    }
    
    /**
     * @return The make and model of the car
     */
     public String getMakeAndModel() {
       return make + " " + model;
     }
    
    /**
     * @return The efficiency of the car. Used for testing purposes
     */
    public double getMpg() {
        return mpg;
    }
}