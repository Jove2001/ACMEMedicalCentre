package controller;

import model.*;
import view.*;

public class PatientRecordsApp
{
   private int arrayStartingSize;
   private PatientRecords[] patientRecords;
   private int numberPatients;
   private ConsoleUI console;
//   private PatientRecords records = new PatientRecords(null, (byte) 0, arrayStartingSize);

   public PatientRecordsApp()
   {
      this.arrayStartingSize = 10;
      this.patientRecords = new PatientRecords[arrayStartingSize];
      this.numberPatients = 0;
      this.console = new ConsoleUI(this);
   }

   public void createNewPatient(String name, byte age, int medicareNumber)
            throws Exception
   {
      // Will edit this to have an array expander check first.
      if (this.numberPatients < this.patientRecords.length)
      {
         this.patientRecords[numberPatients] =
                  new PatientRecords(name, age, medicareNumber);
         this.numberPatients += 1;
      }
   }

   public String printAllPatientDetails()
   {
      String patientDetails = "";
      int i = 0;
      while (i < this.numberPatients)
      {
         patientDetails = this.patientRecords[i].printPatientDetails();
         i += 1;
      }
      return patientDetails;
   }

   public static void main(String[] args)
   {
      PatientRecordsApp obj = new PatientRecordsApp();

   }
}
