class Power extends ConsoleProgram {

  /**
  * This program will take user input for a base and exponent, and then apply the exponent to the base
  * @author: T. Martins
  */
  
  public void run() {
    
    // declare variables
    double dblBase;
    int intExponent;
    double dblOutput;

    // get values of base and exponent
    System.out.println("");
    dblBase = readDouble("Input the value of the base: ");
    intExponent = readInt("Input the value of the exponent: ");

    // calculate base to the power of exponent
    dblOutput = Math.pow(dblBase, intExponent);

    // output result
    System.out.println("");
    System.out.println("The result of " + dblBase + " to the power of " + intExponent + " would be " + dblOutput + ".");
    System.out.println("");

  }
}