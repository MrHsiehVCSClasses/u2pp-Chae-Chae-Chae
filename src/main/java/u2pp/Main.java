package u2pp;

import java.util.Scanner; //Allows you to use the Scanner objects

/**
 * create a scanner object with the imported java util
 */

class Main {
  public static void main(String[] args) {
    //make, model, and etc with one scanner 
	//Align the names of the variables with the actual variable for the Car group variables
	// REMEMBER TO SAVE DANIEL
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a fuel efficiency: ");
    Double efficiency = Double.parseDouble(sc.nextLine());
    System.out.print("Enter a make: ");
    String make = sc.nextLine();
    System.out.print("Enter a model: ");
    String model = sc.nextLine();
    Car cartest = new Car(efficiency, make, model);
    System.out.print("Enter amount of gas to add: ");
    Double amount = Double.parseDouble(sc.nextLine());
    cartest.addGas(amount);
    System.out.print("Enter distance to drive: ");
    Double dist = Double.parseDouble(sc.nextLine());
    cartest.drive(dist);
    System.out.print("Your " + cartest.getMakeAndModel() + " currently has " + cartest.getGasInTank() + " gallons of gas left in the tank");
    sc.close();
  }
  
  /**
   * use the word variables to hold the inputs from user
   * @param word1 The first string to take a piece out of
   * @param start1 The starting index of the substring of word1
   * @param end1 The ending index of the substring of word1 (inclusive)
   * @param word2 The second string to take a piece out of
   * @param start2 The starting index of the substring of word2
   * @param end2 The ending index of the substring of word2 (inclusive)
   * @return 
   */
  public static String wordChanger(String word1, int start1, int end1, String word2, int start2, int end2) {
    //YOUR CODE HERE
	// w1 = word1, s1 = start1 etc. abrev. names
	  String w1 = word1;
	  int s1 = start1;
	  int e1 = end1 + 1;
	  String w2 = word2;
	  int s2 = start2;
	  int e2 = end2 + 1;
	  String subw1 = w1.substring(s1, e1);
	  String subw2 = w2.substring(s2, e2);
	  String finalword = subw1 + subw2;
    return finalword;
  }
}