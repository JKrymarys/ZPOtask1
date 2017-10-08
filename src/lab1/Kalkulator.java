/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.regex.Pattern;

/**
 *
 * @author krymu
 */

public class Kalkulator {
        
      private static Boolean checkChecksum(String pesel)
    {
        int[] intArr = parsePesel(pesel);
        //calulate the checksum
        int checksum = 9*intArr[0] + 7*intArr[1] + 3*intArr[2] + intArr[3] + 9*intArr[4]  + 7*intArr[5] + 3*intArr[6] + intArr[7] + 9*intArr[8] + 7*intArr[9];
        
        return ((checksum%10) == intArr[10]);
    }
      
      private static int[] parsePesel(String pesel)
      {
        int[] intArr = new int[pesel.length()];
      
        for(int i=0; i < pesel.length(); i++)
        {
            intArr[i] = Character.getNumericValue(pesel.charAt(i));
        }
        
        return intArr;
        
      }
    
    public static Boolean checkIfValid(String pesel)
    {
        if(pesel.length() != 11)
            return false;
        
        if(!checkChecksum(pesel))
            return false;
        
        
        return true;
    }
    
    public static void showGender(String pesel)
    {
          int[] intArr = parsePesel(pesel);
          
          if(intArr[9]%2 == 0)
              System.out.println("F");
          else
              System.out.println("M");
    }
    
    public static void showBirthday(String pesel)
    {
        int[] intArr = parsePesel(pesel);
        int temp;
        String yearTemp = "";
        String[] months = { "Jan","Feb","Mar", "Apr", "May", "Jun", "Jul","Aug", "Sep", "Oct", "Nov","Dec" };
        
        String bdDate = "";
        
        bdDate += Integer.toString(intArr[4]);
        bdDate += Integer.toString(intArr[5]);
        bdDate += "-";

        
        // TODO add future versions
        if(intArr[2] == 8 || intArr[2] == 9)
        {
            temp = intArr[2]*10 + intArr[3];
            temp -=80;
            bdDate += months[temp-1];
            yearTemp += "18";
            
        } else if(intArr[2] == 2 || intArr[2] == 3)
        {
            temp = intArr[2]*10 + intArr[3];
            temp -=20;
            bdDate += months[temp-1];
            yearTemp += "20";
        }
        else
        {
            temp = intArr[2]*10 + intArr[3];
            bdDate += months[temp-1];
            yearTemp += "19";
        }
        
        yearTemp += Integer.toString(intArr[0]);        
        yearTemp += Integer.toString(intArr[1]);        
        
    }
    
  
}
