class Rads extends ConsoleProgram {

  /**
  * This program converts degrees to radians given user input
  * @author: T. Martins
  */
  
  public void run() {
    
    // declare variables
    double dblRadians;
    double dblDegrees;

    // get degrees inputs
    System.out.println("");
    dblDegrees = readDouble("Input a measure for degrees: ");

    // calculate conversion
    dblRadians = Math.toRadians(dblDegrees);

    // output radians
    System.out.println("");
    System.out.println("A degree measure of " + dblDegrees + " is equal to a radians measure of " + dblRadians + ".");
    System.out.println("");
  
  }
}