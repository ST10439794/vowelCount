/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vowelcount1;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class VowelCount1 {
    
    public static char countVowels(String word){
        word = word.toLowerCase();
        
        String vowels = "aeiou";
        
        for(int i = 0; 0 < word.length(); i++){
            char currentChar = word.charAt(i);
            
            if (vowels.indexOf(currentChar) != -1){
                return currentChar;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a word: ");
        String word = input.next();
        
        System.out.println("Vowel Found: " + VowelCount1.countVowels(word));
    }
}
