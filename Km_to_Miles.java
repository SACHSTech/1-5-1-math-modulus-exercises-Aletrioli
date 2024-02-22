class Km_to_Miles extends ConsoleProgram {

  /**
  * This program will convert a user inputted distance in kilometres to miles
  * @author: T. Martins
  */
  
  public void run() {
    
    // declare variables
    double dblKm;
    double dblMiles;

    // get value of kilometres
    System.out.println("");
    dblKm = readDouble("Input a distance in kilometres: ");

    // calculate conversion
    dblMiles = dblKm * 0.621371;

    // output miles
    System.out.println("");
    System.out.println(dblKm + " kilometres converts to " + dblMiles + " miles.");
    System.out.println("");
    
  }
}
