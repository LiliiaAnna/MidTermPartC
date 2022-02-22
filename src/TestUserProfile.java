/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lilya
 */
import java.util.Scanner;


public class TestUserProfile {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    String name;
    String genre;
    System.out.println("Enter your name:");
    name =  input.next();
    
    while (true) {
    System.out.println("Select one of your favourite genre: ");
    System.out.println("Comedy");
    System.out.println("Thriller" );
    System.out.println("Drama");
    System.out.println("Crime");
    System.out.println("Enter 0 to exit");
    
     System.out.println("Select one of your favourite genre: ");
  genre =  input.next();
    switch(choice){
        
        case 1: System.out.println(name+ "Your favourite genre is Comedy");
    
            break;
    
         case 2: System.out.println(name+ "Your favourite genre is Thriller");
         break;
  
         case 3: System.out.println(name+ "Your favourite genre is Drama");
         break;

         
         case 4: System.out.println(name + "Your favourite genre is Crime");
        break;
        
        }
    }
    
}

