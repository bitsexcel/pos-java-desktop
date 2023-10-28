/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author jdaniel
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

 
public class FileUser
{
    //@SuppressWarnings("unchecked")
    public void writeFile()
    {

    }
    public Boolean readFile(String pass){
        
        Boolean bool = false;
        try {
            FileReader reader = new FileReader("user.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
 
            String line;
 
            while ((line = bufferedReader.readLine()) != null) {
                if(pass.equals(line))bool = true;
                
            }
            
            reader.close();
           
 
        } catch (IOException e) {
            e.printStackTrace();
        }
         return bool;
    }
}
