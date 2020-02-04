package main.helloworld;

import java.util.Scanner;

/**
 *
 * @author qa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Hello World!");
        System.out.println("Sasa Blagojevic");
        
        int age = 5;
        
        if (age > 18) {
            System.out.println("Osoba je punoletna");
        } else {
            System.out.println("Osoba je maloletna");
        }
        
        System.out.print("Unesite broj godina: ");
        Scanner input = new Scanner(System.in);
        int userAge = input.nextInt();
        
        System.out.println("Korisnik je uneo: " + userAge);
        
        if (userAge > 18) {
            System.out.println("Osoba je punoletna");
        } else {
            System.out.println("Osoba je maloletna");
        }
        
        System.out.print("Unesite broj godina: ");
               Scanner input2 = new Scanner(System.in);
                int personAGe =input.nextInt();
                
        if (personAge <= 0);
                System.out.println("Invalid");
        if (personAge <= 5) {
         System.out.println("Baby");
         } else if (personAGe <= 11); {
                 System.out.println("Kid");
                 }
                 
                 }
    }
    

