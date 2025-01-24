/*
*Lyric Hogans
*CS2
*Jan,24 2025
*Finding average of 3 Test Scores
*/

public class LHTest {
   public static void main(String[] args) {
   
      double score1 = 62.4; // varible declared score 1
      double score2 = 93.6; // varible declared score 2
      double score3 = 87.5; // varible declared score 3
         
      double average = (score1 + score2 + score3) / 3; // calculates average
         
      average = Math.round(average * 100.0) / 100.0; //average 2 decimals
      
         System.out.println("Test Score 1: " + score1); //prints score 1
         System.out.println("Test Score 2: " + score2); //prints score 2
         System.out.println("Test Score 3: " + score3); //prints score 3
         
            System.out.println("The average: "+ average); // prints average

   }
}