class Circumference extends ConsoleProgram {

  /**
  * A program that computes the circumfrence of a circle given a radius from the user
  * @author: Thomas Martins
  */
  
  public void run() {
    
    // declare variables
    double dblRadius;
    double dblCircumfrence;

    // get radius
    System.out.println("");
    dblRadius = readDouble("Input the radius of a circle in centimetres: ");

    // calculate circumfrence
    dblCircumfrence = dblRadius * 2 * Math.PI;

    // output results
    System.out.println("");
    System.out.println("The circumfrence of a circle with a radius of " + dblRadius + " is " + dblCircumfrence + " centimetres.");
    System.out.println("");

  }
}