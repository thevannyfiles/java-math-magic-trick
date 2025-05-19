/**
 * Math Magic Trick in Java
 * 
 * This program takes any integer (except 0) and performs a sequence of
 * arithmetic operations that always results in the number 3.
 * It's a fun exercise to demonstrate order of operations and variable tracking.
 *
 * Created as part of Java learning module.
 */

public class Magic {
	public static void main(String[] args) {
    
    // original number
    int myNumber = 20;
    
    // variables for magic trick 
    int stepOne = myNumber * myNumber; 
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;

    /* value of the last step (step 6).
    It should be the same value no matter what is the orignal number (myNumber) */
    System.out.println("Your magic number is: " + stepSix);
	}
}
