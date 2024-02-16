class AreaSin extends ConsoleProgram {

  /**
  * This program will calculate the area of a triangle given two side and the contained angle.
  * @author: T. Martins
  */
  
  public void run() {
    
    // declare variables
    double dblSide1;
    double dblSide2;
    double dblAngle; 
    double dblArea;

    // get values of first side, second side, and contained angle in degrees
    System.out.println("");
    dblSide1 = readDouble("Input the value of the first side of the triangle in centimetres: ");
    dblSide2 = readDouble("Input the value of the second side of the triangle in centimetres: ");
    dblAngle = readDouble("Input the value of the angle contained between these two sides in degrees: ");

    // convert degrees to radians and calculate area
    dblAngle = Math.toRadians(dblAngle);
    dblArea = dblSide1 * dblSide2 * Math.sin(dblAngle) / 2;

    // output area
    System.out.println("");
    System.out.println("Given your inputs, the triangle would have an area of " + dblArea + " centimetres squared.");
    System.out.println("");

  }
}