package frontend;

import backend.*;
import java.util.*;

public class ACMEMedicalCentre
{
   RecordsManager recordsManager;
   Scanner scin;

   public ACMEMedicalCentre()
   {
      this.recordsManager = new RecordsManager();
      scin = new Scanner(System.in);

      String menu = "Welcome to ACME Medical Centre\n";
      menu += "---------------------------------";
      menu += "\n[A]dd new patient";
      menu += "\n[P]rint all patient details";
      menu += "\n\nE[x]it";
      menu += "\n";
      menu += "\nSelection: ";

      System.out.print(menu);
      String menuSelection = scin.nextLine();

      while (!menuSelection.equalsIgnoreCase("E"))
      {

         if (menuSelection.equalsIgnoreCase("A"))
         {
            System.out.print("Enter name for new patient:");
            String patientName = scin.nextLine();

            System.out.print("Enter age for new patient:");
            byte patientage = Byte.parseByte(scin.nextLine());

            System.out.print("Enter contact number for new patient:");
            int contactNumber = Integer.parseInt(scin.nextLine());

            try
            {
               this.recordsManager.createNewPatient(patientName, patientage,
                                                    contactNumber);
            }
            catch (Exception e)
            {
               System.out.println(e);
            }
         }

         if (menuSelection.equalsIgnoreCase("P"))
         {
            String[] patientDetails = this.recordsManager.printAllPatientDetails();
            System.out.printf("%-14s %-14s %-14s %-14s %-14s %-14s\n", "Name",
                              "Gender",
                              "Age", "Contact", "Address", "Medicare#");
            System.out
                     .println("-------------------------------------------------------------------------------------");

            int i = 0;
            int patients = this.recordsManager.getNumberPatients();
            while (i < patients)
            {
               String[] splitdetails = patientDetails[i].split(",");

               String name = splitdetails[0];
               String gender = splitdetails[1];
               String age = splitdetails[2];
               String phoneNumber = splitdetails[3];
               String address = splitdetails[4];
               String medicareNumber = splitdetails[5];
               System.out.printf("%-14s %-14s %-14s %-14s %-14s %-14s\n", name,
                                 gender, age, phoneNumber, address, medicareNumber);

               i += 1;
            }
            System.out
                     .println("-------------------------------------------------------------------------------------\n");
         }
         System.out.print(menu);
         menuSelection = scin.nextLine();
      }

   }

   public static void main(String[] args)
   {
      ACMEMedicalCentre obj = new ACMEMedicalCentre();

   }
}
