package view;

import controller.RecordsManager;
import model.*;

public class ACMEMedicalCentre
{
   RecordsManager recordsManager;

   public ACMEMedicalCentre()
   {
      this.recordsManager = new RecordsManager();

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

   public static void main(String[] args)
   {
      ACMEMedicalCentre obj = new ACMEMedicalCentre();

   }
}
