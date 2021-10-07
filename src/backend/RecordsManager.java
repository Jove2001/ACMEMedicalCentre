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

   public void createNewPatient(String name, byte age, int phoneNumber)
            throws Exception
   {
      if (this.numberPatients < this.patientRecords.length)
      {
         this.patientRecords[numberPatients] =
                  new PatientRecords(name, age, phoneNumber);
         this.numberPatients += 1;
      }
   }
   
   public String printAllPatientDetails() {
      String patientDetails = "";
      int i = 0;
      while (i < this.numberPatients) {
         patientDetails += this.patientRecords[i].printPatientDetails();
      }
      return patientDetails;
   }

}
