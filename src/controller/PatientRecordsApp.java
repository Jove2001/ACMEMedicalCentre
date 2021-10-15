package controller;

import model.*;
import view.*;

// Main application class
public class PatientRecordsApp
{
   private ConsoleUI console;
   private PatientRecordsManager recordsManager;

   public PatientRecordsApp()
   {
      this.console = new ConsoleUI();
      this.recordsManager = new PatientRecordsManager("PatientRecords.csv");

      // Print menu to console
      this.console.showMainMenu();

      // This doesn't work
      // PatientRecords sampleRecord = PatientRecordsManager.createSampleRecord();
   }

   public void createNewPatient(String name, byte age, int medicareNumber)
            throws Exception
   {

   }

   public String printAllPatientDetails()
   {
      return null;

   }

   public static void main(String[] args)
   {
      PatientRecordsApp obj = new PatientRecordsApp();

   }
}
