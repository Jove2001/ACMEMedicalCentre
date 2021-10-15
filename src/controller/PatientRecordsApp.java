package controller;

// I believe that we shouldn't be able to directly access PatientRecords from the the main class,
// All access should be done through the records manager??
import model.PatientRecordsManager;
import view.*;

// Main application class
public class PatientRecordsApp
{
   private ConsoleUI console;
   private PatientRecordsManager recordsManager;

   public PatientRecordsApp()
   {
      // Create objects of view and model here
      this.console = new ConsoleUI();
      this.recordsManager = new PatientRecordsManager("PatientRecords.csv");

      // Print menu to console
      this.console.showMainMenu();

      // This doesn't work. Can't directly access PatientRecords class. Needs to go
      // via PatientRecordsManager???
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
