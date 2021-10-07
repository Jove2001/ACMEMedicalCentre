package backend;

import java.io.*;

public class FileIO
{
   private String fileName;

   public FileIO(String fileName)
   {
      this.fileName = fileName;
     
   }
   
   public String readFile() throws FileNotFoundException, IOException {
      String lines = "";
      BufferedReader reader = new BufferedReader(new FileReader(this.fileName));
      String line = reader.readLine();
      while (line != null) {
         lines += line;
         line = reader.readLine();  
      }
      reader.close();
      return lines;   
   }
}
