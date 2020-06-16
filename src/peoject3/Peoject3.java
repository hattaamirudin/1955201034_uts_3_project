/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peoject3;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class Peoject3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input,jawab = null;
        boolean running = false;
        int counter = 0;
      do{  
        Scanner scan = new Scanner(System.in);
        Scanner inputUser = new Scanner(System.in);
        System.out.print("MILIHO NOMER :");
        input=inputUser.next();
        
        switch(input){
            case "1":
                System.out.println("PUBG");
                break;
            case "2":
                System.out.println("MOBILE LAGEND");
                break;
            case "3":
                System.out.println("MINECRAFT");
                break;
            case "4":
                System.out.println("DOTA");
                break;
            case "5":
                System.out.println("COC");
                break;
            default:
                System.out.println("pilihan hanya sampai 5");
                
                System.out.println("apakah anda ingin keluar ?");
            System.out.print("jawab [ya/tidak]>");
            
            jawab = scan.nextLine();
        }
        }while(running);
            
            if(jawab.equalsIgnoreCase("tidak")){
                running = false;
            }
            
            counter++;
    }
}