package view;

// Remove these
import controller.PatientRecordsApp;
import model.*;

public class ConsoleUI
{
   PatientRecordsApp recordsManager;

   public ConsoleUI()
   {
      this.recordsManager = new PatientRecordsApp();

      try
      {
         this.recordsManager.createNewPatient("John", (byte) 27, 0400000000);
      }
      catch (Exception e)
      {
         System.out.println(e);
      }

      System.out.println(this.recordsManager.printAllPatientDetails());
   }
}
