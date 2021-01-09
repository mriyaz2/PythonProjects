/* Muahammad Yahya Riyaz 
 */
package project1;
import java.util.concurrent.TimeUnit;
public class PROJECT1 {
     
    
public static void main(String[] args) {
    //This means that these methods were not being tested
    shortarray (); 
    //medarray ();  
    //longarray (); 
} 
//*******************************************************************SHORT ARRAY  
  static void shortarray() {  
     int shortarray[]=new int [500];
     int target=500;
     int i=0;
     int n=0; 
     for (i=0; i<=499 && i>=0; i++) {          
         shortarray[i]=(n+1); 
         i=n++; 
     }
 long startTime = System.nanoTime(); //Start measuring time
      
     //************************** Unsorted shortarray fetch and delete 
     for (i=0; i<=499 && i>=0; i++){
         if (target==(shortarray[i])) {                
        System.out.println(target + " was found"); 
         // This next line of code is to delete the target element from array
        // shortarray[i]=0; // 0 means the target value was deleted 
         }
        else {
          System.out.println (shortarray[i]);
        
         }
         
 }//To figure out run time for shortarray unsorted fetch (and unsorted delete)
//     long endTime = System.nanoTime();
//     long timeElapsed = endTime - startTime;
//     System.out.println("Execution time in milliseconds : " +
//    timeElapsed);
  

                 
     //***************************** Sorted shortarray fetch and delete      
    int size=500; 
    int low=0;
    int high=size-1;
    while (high>=low) {
        int middle=(low+high)/2; 
    
    
    if(shortarray[middle] < target) {
        low = middle + 1;
    }
    
     if(shortarray[middle] > target) {
               high = middle - 1;
            }
    if (shortarray[middle]== target) {  
        System.out.println("Target= " + target + " was found ");
         // This next line of code is to delete the target element from array
        //shortarray[middle]=0; // 0 means the target value was deleted 
        low=99999;
    } 
    if (shortarray[middle] != target) {
       System.out.println("Calculating"); 
  }
    else if (low>high && shortarray[middle] != target ){
        System.out.println("Target = " + target + " was not found");
    }
  }
    // To figure out run time for  shortarray sorted fetch (and sorted delete)
    long endTime = System.nanoTime();
    long timeElapsed = endTime - startTime;
     System.out.println("Execution time in ns : " + timeElapsed);
          
  }
  


//****************************************************************MEDIUM ARRAY 
static void medarray() {   
     int medarray[]=new int [5000];
     int target=5000;
     int i=0;
     int n=0; 
     for (i=0; i<=4999 && i>=0; i++) {
          
         medarray[i]=(n+1); 
         i=n++; 
     }
     long startTime = System.nanoTime(); //Start measuring time
      //************************** Unsorted medarray fetch and delete
     for (i=0; i<=4999 && i>=0; i++){
         if (target==(medarray[i])) {                
        System.out.println(target + " was found"); 
         // This next line of code is to delete the target element from array
        //medarray[i]=0; // 0 means the target value was deleted 
         }
        else {
             System.out.println (medarray[i]);
                     
         }
     } 
//     To figure out run time for  medarray unsorted fetch (and unsorted delete)
//    long endTime = System.nanoTime();
//    long timeElapsed = endTime - startTime;
//     System.out.println("Execution time in ns : " + timeElapsed);
     
     
     //***************************** Sorted medarray fetch and delete     
    int size=5000; 
    int low=0;
    int high=size-1;
    while (high>=low) {
        int middle=(low+high)/2; 
    
    
    if(medarray[middle] < target) {
        low = middle + 1;
    }
    
     if(medarray[middle] > target) {
               high = middle - 1;
            }
    if (medarray[middle]== target) {  
        System.out.println("Target = " + target + " was found ");
        // This next line of code is to delete the target element from array
        medarray[middle]=0; // 0 means the target value was deleted 
        low=99999;
    } 
    if (medarray[middle] != target) {
       System.out.println("Calculating"); 
  }
    else if (low>high && medarray[middle] != target ){
        System.out.println("Target = " + target + " was not found");
    }
  }
    //To figure out run time for medarray sorted fetch (and sorted delete)
       long endTime = System.nanoTime();
    long timeElapsed = endTime - startTime;
     System.out.println("Execution time in ns : " +
   timeElapsed);    
}


//*************************************************************LONG ARRAY
static void longarray() {  
     int longarray[]=new int [50000];
     int target=50000;
     int i=0;
     int n=0; 
     for (i=0; i<=49999 && i>=0; i++) {
          
         longarray[i]=(n+1); 
         i=n++; 
     }
    long startTime = System.nanoTime(); //Start measuring time    
      //************************** Unsorted longarray fetch and delete
     for (i=0; i<=49999 && i>=0; i++){
         if (target==(longarray[i])) {                
        System.out.println(target + " was found");
          // This next line of code is to delete the target element from array
        longarray[i]=0; // 0 means the target value was deleted 
         }
        else {
          System.out.println (longarray[i]);
        
         }
     }  
   // To figure out run time for longarray unsorted fetch (and unsorted delete) 
//     long endTime = System.nanoTime();
//    long timeElapsed = endTime - startTime;
//    System.out.println("Execution time in ns : " +
//   timeElapsed); 


     //***************************** Sorted longarray fetch and delete     
    int size=50000; 
    int low=0;
    int high=size-1;
    while (high>=low) {
        int middle=(low+high)/2; 
    
    
    if(longarray[middle] < target) {
        low = middle + 1;
    }
    
     if(longarray[middle] > target) {
               high = middle - 1;
            }
     else if (longarray[middle]== target) { 
        System.out.println("Target = " + target + " was found ");
        // This next line of code is to delete the target element from array
        //longarray[middle]=0; // 0 means the target value was deleted 
                 low=99999; 
               
    } 
    else if (longarray[middle] != target) {
       System.out.println("Calculating"); 
  }
    else if (low>high && longarray[middle] != target ){
        System.out.println("Target = " + target + " was not found");
    }
  }
     //To figure out run time for longarray sorted fetch (and sorted delete) 
     long endTime = System.nanoTime();
    long timeElapsed = endTime - startTime;
     System.out.println("Execution time in ns : " +
   timeElapsed); 
}





}
  
  
  
 
  
 
  
  



  


