package view;

import java.util.Scanner;

// Take user input and display text to console with this class
public class ConsoleUI
{
   private Scanner userInput;

   public ConsoleUI()
   {
      this.userInput = new Scanner(System.in);
   }

   public void showMainMenu()
   {
      String menu = "Welcome to ACME Medical Centre\n";
      menu += "---------------------------------";
      menu += "\n[A]dd new patient";
      menu += "\n[P]rint all patient details";
      menu += "\n\nE[x]it";
      menu += "\n";
      menu += "\nSelection: ";

      System.out.print(menu);
   }

   public String getUserDataEntry()
   {
      String dataEntry = this.userInput.nextLine();
      return dataEntry;
   }
}
