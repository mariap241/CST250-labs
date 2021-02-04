
package edu.ru.lab02b;

public class MainClass {
    
    public static void main(String[] args){
        
        int ar1[]={5, 6, 7, 8, 10, 3, 9};
        
        int ar2[]= mySort(ar1);
        
        System.out.println("input array: "+ ar1[2]);
    
     
    }
    
    public static int[] mySort(int[] inputArray){
        
        int arraySize = inputArray.length;
        for (int i = 0; i < arraySize - 1; i++){
            int index=i;
     
        for (int j = i + 1; j < arraySize; j++){
            if (inputArray[j] < inputArray[index]){
                index = j;
                
            }
        }
         int temp = inputArray[i];
         inputArray[i] = inputArray[index];
         inputArray[index]= temp;
         
        } 
        return inputArray;
    }
}

