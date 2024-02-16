class Power extends ConsoleProgram {

  /**
  * This program will take user input for number a and b, and then put a to the power of b
  * @author: T. Martins
  */
  
  public void run() {
    
    // declare variables
    double dblBase;
    int intExponent;
    double dblOutput;

    // get values
    System.out.println("");
    dblBase = readDouble("Input the value of the base: ");
    intExponent = readInt("Input the value of the exponent: ");

    // calculations
    dblOutput = Math.pow(dblBase, intExponent);

    // output
    System.out.println("");
    System.out.println("The result of " + dblBase + " to the power of " + intExponent + " would be " + dblOutput + ".");
    System.out.println("");

  }
}