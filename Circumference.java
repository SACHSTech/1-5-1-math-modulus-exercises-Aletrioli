class Circumference extends ConsoleProgram {

  /**
  * This program will compute the circumfrence of a circle given a radius from the user
  * @author: T. Martins
  */
  
  public void run() {
    
    // declare variables
    double dblRadius;
    double dblCircumference;

    // get radius
    System.out.println("");
    dblRadius = readDouble("Input the radius of a circle in centimetres: ");

    // calculate circumference
    dblCircumference = dblRadius * 2 * Math.PI;

    // output results
    System.out.println("");
    System.out.println("The circumference of a circle with a radius of " + dblRadius + " is " + dblCircumference + " centimetres.");
    System.out.println("");

  }
}