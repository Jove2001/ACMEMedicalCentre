package backend;

public class RecordsManager
{
   private int arrayStartingSize;
   private PatientRecords[] patientRecords;
   private int numberPatients;

   public RecordsManager()
   {

      this.arrayStartingSize = 10;
      this.patientRecords = new PatientRecords[arrayStartingSize];
      this.numberPatients = 0;

   }

   public int getNumberPatients()
   {
      return this.numberPatients;
   }

   public void createNewPatient(String name, byte age, int phoneNumber)
            throws Exception
   {

      // Will edit this to have an array expander check first.
      if (this.numberPatients < this.patientRecords.length)
      {
         this.patientRecords[numberPatients] =
                  new PatientRecords(name, age, phoneNumber);
         this.numberPatients += 1;
      }
   }

   public String[] printAllPatientDetails()
   {
      String[] patientDetails = new String[6];
      int i = 0;
      while (i < this.numberPatients)
      {
         patientDetails[i] = patientRecords[i].getPatientDetails();
         i += 1;
      }
      return patientDetails;
   }

}
