package Number_Guessing_Game;
import java.util.*;
import java.io.*;

public class game{ 

    //Computer picks a number- generates a random integer between 1 and 100
    static int comp_num= (int)Math.floor(Math.random()*10);

   
    public static void easy()throws IOException
    {System.out.println("\nEasy Mode");
        Scanner sc=new Scanner(System.in);
        
        int total= 100,guess= 0;

        while(guess!=comp_num)
        {
            System.out.print("\nEnter Your Guess Here: ");
            guess=sc.nextInt();
            if(guess>comp_num)
            {
                total++;
                System.out.println("Number is Too High!! Guess again...");
            }
            else if(guess<comp_num)
            {
                total++;
                System.out.println("Number is Too Low!! Guess again...");
            }
            else if(guess>100 || guess<1)
            {
                System.out.println("Number exceeds limits!! Guess again...");
            }
        }
        System.out.println("The Correct Answer is: "+comp_num);
        System.out.println("You took a total of "+total+" guesses.");
        sc.close();
    }

    public static void medium()throws IOException
    { System.out.println("\n Medium Mode");
        Scanner sc=new Scanner(System.in);

        int total= 1,guess= 0,lives= 10;

        while(guess!=comp_num && lives>0)
        {
            System.out.print("\nEnter Your Guess Here: ");
            guess=sc.nextInt();
            if(guess>comp_num)
            {
                total++;
                lives--;
                System.out.println("Number is Too High!! Guess again...");
                if(lives>0)
                    System.out.println("You have "+lives+" lives remaining, play carefully!!");
            }
            else if(guess<comp_num)
            {
                total++;
                lives--;
                System.out.println("Number is Too Low!! Guess again...");
                if(lives>0)
                    System.out.println("You have "+lives+" lives remaining, play carefully!!");
            }
            else if(guess>100 || guess<1)
            {
                System.out.println("Number exceeds limits!! Guess again...");
            }
        }
        if(lives>0){
            System.out.println("The Correct Answer is: "+comp_num);
            System.out.println("You took a total of "+total+" guesses.");
        }
        else{
            System.out.println("Oops!! You ran out of lives...");
            System.out.println("The Correct Answer was: "+comp_num);
        }
        sc.close();
    }

    public static void hard()throws IOException
    { System.out.println("\n Hard Mode");
        Scanner sc=new Scanner(System.in);

        int total= 1,guess= 0,lives=5;

        while(guess!=comp_num && lives>0)
        {
            System.out.print("\nEnter Your Guess Here: ");
            guess=sc.nextInt();
            if(guess>comp_num)
            {
                total++;
                lives--;
                System.out.println("Number is Too High!! Guess again...");
                if(lives>0)
                    System.out.println("You have "+lives+" lives remaining, play carefully!!");
            }
            else if(guess<comp_num)
            {
                total++;
                lives--;
                System.out.println("Number is Too Low!! Guess again...");
                if(lives>0)
                    System.out.println("You have "+lives+" lives remaining, play carefully!!");
            }
            else if(guess>10 || guess<1)
            {
                System.out.println("Number exceeds limits!! Guess again...");
            }
        }
        if(lives>0){
            System.out.println("The Correct Answer is: "+comp_num);
            System.out.println("You took a total of "+total+" guesses.");
        }
        else{
            System.out.println("Oops!! You ran out of lives...");
            System.out.println("The Correct Answer was: "+comp_num);
        }
        sc.close();
    }

    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
      
        
        System.out.println("Choose the Game Mode: ");
        System.out.println("\nPress 1 for Easy \nPress 2 for Medium \nPress 3 for Hard");
        String mode=sc.nextLine();

        if(mode.equalsIgnoreCase("1"))
        {
        	easy();
            
        }
       
         else if(mode.equalsIgnoreCase("2"))
        {
            medium();
        
       
        }
        else if(mode.equalsIgnoreCase("3"))
        {
            hard();
          
        }
        
        
        else
        {
            System.out.println("\n\n!!! INVALID INPUT !!! \n\n");
        }

        
        sc.close();
    }

}
