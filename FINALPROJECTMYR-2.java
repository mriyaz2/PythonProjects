/*
Yahya Riyaz 
FINAL PROJECT
 */
package finalprojectmyr;
import java.util.Scanner; 
public class FINALPROJECTMYR { 


public static void main(String[] args) {
        
System.out.println("THE GOAT OF BASKETBALL");
        System.out.println("______________________");
        System.out.println("");
        System.out.println("This is the ballot to determine who the greatest basketball player of all time is");
        System.out.println("");
        System.out.println("The 3 candidates are:");
        System.out.println("");
        System.out.println("Lebron James (L)");
        System.out.println("Michael Jordan (M)");
        System.out.println("Kobe Bryant (K)");
        System.out.println("To end the voting, enter X");
        System.out.println("The person with the most votes will be considered the basketball G.O.A.T"); 
        System.out.println("");
        loop(); 
        
        
}
        
        public static void loop() 
        { 
        int Lvotes=0;
        int Mvotes=0;
        int Kvotes=0; 
            
       int exit=1; 
       while (exit<=1)
               {// beginning of the loop 
                  
        System.out.println("Cast your vote (L, M, OR K) or **X to to EXIT**");
        Scanner kb= new Scanner (System.in);
        String pick; 
        pick=kb.next(); 
        System.out.println("Your vote has been submitted. You chose "+ pick);
        System.out.println("");
            
       
        
        if (pick.equalsIgnoreCase("L"))
                    {// Vote for L 
                     Lvotes=Lvotes+1; 
                     System.out.println("Lebron has recieved "+ Lvotes + " VOTES");
                     System.out.println("");
                    }// end vote for L
            
                    else 
                       
        if (pick.equalsIgnoreCase("M"))
                    {// Vote for M
                      Mvotes=Mvotes+1;
                      System.out.println("Jordan has recieved "+ Mvotes + " VOTES");
                      System.out.println("");
                    }// end vote for M 
                     else 
                       
        if (pick.equalsIgnoreCase("K"))
                    {// Vote for K 
                       Kvotes=Kvotes+1;
                       System.out.println("Kobe has recieved "+ Kvotes + " VOTES");
                       System.out.println("");
                    }// end vote for K 
                     else                      
            
        if (pick.equalsIgnoreCase("x"))
           {// Entering sentinal value  
                     System.out.println("You have stopped the voting");
                     System.out.println("The resuls are as follows: ");
                     
                if ((Lvotes>Mvotes) && (Lvotes>Kvotes)) 
                { // If Lebron wins
                    System.out.println ("Lebron has won with "+ Lvotes+ " votes !!!");
                    System.out.println ("Jordan recieved " + Mvotes +" votes");
                    System.out.println ("Kobe recieved " + Kvotes + " votes");

                }
        
                if ((Mvotes>Lvotes) && (Mvotes>Kvotes)) 
                {// If Jordan wins
                    System.out.println ("Jordan has won with "+ Mvotes+ " votes !!!");
                    System.out.println ("Lebron recieved " + Lvotes +" votes");
                    System.out.println ("Kobe recieved " + Kvotes + " votes");

                }
                
                if ((Kvotes>Mvotes) && (Kvotes>Lvotes)) 
                { // If Kobe wins 
                    System.out.println ("Kobe has won with "+ Kvotes+ " votes !!!");
                    System.out.println ("Jordan recieved " + Mvotes +" votes");
                    System.out.println ("Lebron recieved " + Lvotes + " votes");

                }
                     exit=exit+1; // ends the loop   
           }  
         
        else 
                        {//If an invalid input is entered 
                    System.out.println("Invalid Input");
                    System.out.println("");
                }
               }
        }
}


        
               
       
               
    
    
        
       
        

        
        





  
             
    
    

            
     


