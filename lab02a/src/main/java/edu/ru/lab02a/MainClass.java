/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ru.lab02a;

public class MainClass {
    public static void main(String[] args){
        int[] inputArray= {5,6,7,8,9};
         
       
    }
    public static int mySearch(int[] inputArray, int n){
        
        for (int i=0; i<inputArray.length; i++){       
            if (inputArray[i] == 8){
                return i;
            }
        }
        return -1;
        
    
    
    }
}   
