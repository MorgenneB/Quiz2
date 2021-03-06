/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Morgenne Besenschek
 */
public class Quiz2 {

    /**
     * Takes in a number and calculates the sum from 1 to that number
     * Example: sumUpTo(5) would return 15
     * Because 1 + 2 + 3 + 4 + 5 = 15
     * 
     * @param n the number to sum up to
     * @return 
     */
    public int sumUpTo(int n){
        
        //if number entered is less than or equal to 1
        if(n <= 1){  
            //return entered number to the user
            return n;
        }
        //if number entered is greater than 1
        else{
            //return the sum of the entered number plus the number minus one
            return n + sumUpTo(n - 1);
        }
        
    }
    
    /**
     * Takes in a String and returns the same String in reverse
     * 
     * @param word the word to be reversed
     * @return the input word reversed
     */
    public String reverseString(String word){
        //if the length of the word is one character or less
        if(word.length() <= 1)
        {
            //return the entered word to the user
            return word;
        }
        //if the length of the word is more than one character
        else{
            //return the entered word minus its last letter, and the last letter of the word
            return word.charAt(word.length() - 1) + reverseString(word.substring(0, word.length() - 1));
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Use this section for conducting tests
        Quiz2 test = new Quiz2();
        //use test.sumUpTo(__)  or test.reverseString(___) to test
        System.out.println(test.sumUpTo(10));
        System.out.println(test.reverseString("mississippi"));
        
    }
    
}
