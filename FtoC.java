class FtoC extends ConsoleProgram {

  /**
  * This program will convert a user given measure in Fahrenheit to Celsius
  * @author: T. Martins
  */
  
  public void run() {
    
    // declare variables
    double dblFahrenheit;
    double dblCelsius;

    // get values
    System.out.println("");
    dblFahrenheit = readDouble("Input a degree measure in Fahrenheit: ");

    // calculations
    dblCelsius = (dblFahrenheit - 32) * 5 / 9;

    // output
    System.out.println("");
    System.out.println("A Fahrenheit measure of " + dblFahrenheit + " would convert to " + dblCelsius + " degrees celsius.");
    System.out.println("");

  }
}