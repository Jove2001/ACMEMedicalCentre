package model;

public class PatientRecords
{
   private String name;
   private byte age;
   private int phoneNumber;
   private String address;
   private String gender;
   private int medicareNumber;

   public PatientRecords(String name, byte age, int phoneNumber, String address, String gender, int medicareNumber) throws Exception
   {
      checkString(name);
      this.name = name;
      this.age = age;
      this.phoneNumber = phoneNumber;
      this.address = null;
      this.gender = null;
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

   // Private method created as a helper as code was being duplicated in the
   // constructor and mutator. Can expand this for any string checks in the class.
   private void checkString(String stringToCheck) throws Exception
   {
      if (stringToCheck.isBlank() || stringToCheck == null)
      {
         throw new Exception("'" + stringToCheck + "' is not a valid input. " +
                             "\n Fields cannot be left blank.");
      }
   }
}