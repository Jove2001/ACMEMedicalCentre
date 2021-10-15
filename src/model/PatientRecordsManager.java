package model;

import java.io.*;

// This class manages array of patient records including file loading/saving
public class PatientRecordsManager
{
   private String fileName;
   private PatientRecords patientRecords;

   public PatientRecordsManager(String fileName)
   {
      this.fileName = fileName;
      this.patientRecords = null;

   }

   // Save file template
   public String readFile() throws FileNotFoundException, IOException
   {
      String lines = "";
      BufferedReader reader = new BufferedReader(new FileReader(this.fileName));
      String line = reader.readLine();
      while (line != null)
      {
         lines += line;
         line = reader.readLine();
      }
      reader.close();
      return lines;
   }

   // Load file
   public void loadFile() throws FileNotFoundException, IOException
   {
      
   }

   // Parse data from file into a single patient record
   public PatientRecords createPatientRecords(String name, byte age,
                                              int medicareNumber)
            throws Exception
   {
      PatientRecords patientRecord = new PatientRecords(name, age, medicareNumber);

      return patientRecord;

   }

   // Create a sample record
   public PatientRecords createSampleRecord() throws Exception
   {
      PatientRecords patientrecord = new PatientRecords("Tom", (byte) 1, 123450);
      return patientrecord;

   }
}
