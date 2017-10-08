/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import lab1.Kalkulator;
/**
 *
 * @author krymu
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter PESEL");
        String pesel = br.readLine();
        System.out.println(Kalkulator.checkIfValid(pesel).toString());
        
    }

}
