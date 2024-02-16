class Minutes extends ConsoleProgram {

  /**
  * This program will convert a number of minutes to the number of days, hours and minutes given user input
  * @author: T. Martins
  */
  
  public void run() {
    
    // declare variables
    int intInputMinutes;
    int intDays;
    int intHours;
    int intOutputMinutes;

    // get values
    System.out.println("");
    intInputMinutes = readInt("Input your number of minutes: ");

    // calculations
    intHours = intInputMinutes / 60;
    intOutputMinutes = intInputMinutes % 60;
    intDays = intHours / 24;
    intHours = intHours % 24;

    // output
    System.out.println("");
    System.out.println(intInputMinutes + " minutes would convert to " + intDays + " days, " + intHours + " hours, and " + intOutputMinutes + " minutes.");
    System.out.println("");
    
  }
}