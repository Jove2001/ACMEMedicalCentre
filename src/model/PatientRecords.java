package model;

// This class holds the patient records data structure
// Restrict access to class??
class PatientRecords
{
   private String name;
   private byte age;
   private int medicareNumber;

   public PatientRecords(String name, byte age, int medicareNumber) throws Exception
   {
      checkString(name);
      this.name = name;
      this.age = age;
      this.medicareNumber = 0;
   }

   public String getName()
   {
      return this.name;
   }

   public void setName(String name) throws Exception
   {
      checkString(name);
      this.name = name;

   }

   private void checkString(String stringToCheck) throws Exception
   {
      if (stringToCheck.isBlank() || stringToCheck == null)
      {
         throw new Exception("'" + stringToCheck + "' is not a valid input. " +
                             "\n Fields cannot be left blank.");
      }
   }

   public String printPatientDetails()
   {
      return null;

   }
}
