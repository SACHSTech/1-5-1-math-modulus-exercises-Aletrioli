class Hours extends ConsoleProgram {

  /**
  * This program will convert a number of hours to days given user input
  * @author: T. Martins
  */
  
  public void run() {
    
    // declare variables
    int intInputHours;
    int intDays;
    int intOutputHours;

    // get values of hours
    System.out.println("");
    intInputHours = readInt("Input your number of hours: ");

    // calculate days and hours
    intDays = intInputHours / 24;
    intOutputHours = intInputHours % 24;

    // output days and remaining hours
    System.out.println("");
    System.out.println(intInputHours + " hours would convert to " + intDays + " days and " + intOutputHours + " hours.");
    System.out.println("");
    
  }
}