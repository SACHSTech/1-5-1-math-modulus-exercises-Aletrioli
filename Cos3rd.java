class Cos3rd extends ConsoleProgram {

  /**
  * This program will receive input for two sides of a triangle and the contained angle, then to calculate the length of the third side
  * @author: T. Martins
  */
  
  public void run() {
    
    // declare variables
    double dblSide1;
    double dblSide2;
    double dblAngle;
    double dblSide3;

    // get values of first side, second side, and contained angle
    System.out.println("");
    dblSide1 = readDouble("Input the first side of the triangle in centimetres: ");
    dblSide2 = readDouble("Input the second side of the triangle in centimetres: ");
    dblAngle = readDouble("Input the angle contained betweeen the two sides in degrees: ");
    System.out.println("");

    // convert degrees to radians, and calculate the third side
    dblAngle = Math.toRadians(dblAngle);
    dblSide3 = Math.sqrt(dblSide1 * dblSide1 + dblSide2 * dblSide2 - 2 * dblSide1 * dblSide2 * Math.cos(dblAngle));

    // output length of third side
    System.out.println("The length of the third side of a triangle with a first side of " + dblSide1 + " centimetres, a second side of " + dblSide2 + " centimetres and an angle of " + dblAngle + " radians would be " + dblSide3 + " centimetres.");
    System.out.println("");
    
  }
}