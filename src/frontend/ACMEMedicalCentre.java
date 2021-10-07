package frontend;

import backend.*;

public class ACMEMedicalCentre
{
   RecordsManager recordsManager;

   public ACMEMedicalCentre()
   {
      this.recordsManager = new RecordsManager();
      
      System.out.println(this.recordsManager.printAllPatientDetails());
   }

   public static void main(String[] args)
   {
      ACMEMedicalCentre obj = new ACMEMedicalCentre();

   }
}
