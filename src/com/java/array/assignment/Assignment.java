
package com.java.array.assignment;

import java.util.Arrays;

/**
 * This class contains various methods for manipulating arrays (such as
 * sorting unique array )
 * 
 * This class is a assignment to is solution class, question as follow
 * 
 * 1. write a program to remove duplicate elements from given array
 * 2. write a program to remove a given element from array
 * 3. write a program to compare two array
 * 4. Calculate the average of given array
 * 5. write a program to swap two array element
 * 6. write a program to return 2nd highest element from given array
 * 7. write a program to sort a given array (Ascending order)
 * 8. write a program to addition of two array
 *
 *
 * @author PRANAV
 *
 */
public class Assignment {

	static int arr [] = {10,20,30,40};
	static int arr1[] = {10,20,30,40};
	static int len = arr.length;
	static int newArr [] = new int [len];
	static int index = 0;
	static int index1 = 0;
	static int index2 = 0;
	int smallno = 0;
	

    /**
     * unique array (remove duplicate element from array)
     * Written type of method is void 
     * we can't change the capacity of single array 
     * so not able to store a unique value in array
     * @param arr
     * 
     */
    public static void uniqueElements(int arr[]){
        for (int i = 0; i < len; i++){ 
            int count = 0;   
            for (int j = 0; j < i; j++){  
                if (arr[i] == arr[j]){   
                    count = 1;  
                    break;   
                }  
            }    
            if (count == 0){   
                newArr[index] = arr[i];  
                index++;
        }  
        
        }  
        for(int k = 0; k < index; k++)  
            System.out.print( newArr[k] + " ");   
    
        return ;   
    }
    
    
  
    /**
     * Remove given element from array
     * method can able to remove 1st occurrence of given element.
     * @param element
     * @return new array excepting the given element.
     */
    public static int[] removeElement(int element) { 
    	int z = 0;
    	int a1 [] = new int [arr.length-1];
        // find index of n
            for (int i=0; i<arr.length; i++){
                if(arr[i] == element){
                    z = i;
                }
            }
        // remove the values n
            for (int j=0;j<z;j++){
                a1[j] = arr[j];
            }
        // append value
            for (int k=z;k<arr.length-1;k++){
            a1[k] = arr[k+1];
        }
        System.out.println(Arrays.toString(a1));
        return a1;
    }
    
    

    /**
     * compare two array
     * method can compare content in given two string 
     * if content of given both array is same the return true 
     *
     * @param arr
     * @param arr1
     * @return
     */
    public static boolean compareArray(int arr[],int arr1[]){
        return Arrays.toString(arr).equals(Arrays.toString(arr1)); 
    }
    
    
    /**calculate average if given array
     * Average = sum of all element present in array / total number of element present in array.
     * 
     * @param arr
     * @return
     */
    public double average(int arr[]) {
		return add(arr)/arr.length;
	}
    
    
    // 
    /**
     * swap two elements in array
     * Method exchanging the values of given two variables
     * @param a given 
     * @param index1
     * @param index2
     */
    public void swap(int a[],int index1, int index2) {
        int t = a[index1] + a[index2];
        a[index1] = t - a[index1];
        a[index2] = t - a[index2];	
        return ;
    }
    
    /**
     * Second Highest element in array
     * @param arr
     * @return
     */
    public static int secondHighElement(int arr[]){
        return sortAscending(arr)[arr.length-2];
    }
    
    
    /**
     * sort by ascending order
     * The selection sort algorithm sorts an array by repeatedly finding the minimum element 
     * (considering ascending order) from the unsorted part and putting it at the beginning. 
     * @param arr
     * @return
     */
    public static int[] sortAscending(int arr[]){
		for (int i = 0; i < len-1; i++){	
			int min_idx = i;
			for (int j = i+1; j < len; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}	
        return arr ;
	}    
    

    /**
     * addition of two array
     * @param arr
     * @param arr1
     * @return
     */
    public static int addTwoArr(int arr[],int arr1[]){
    	return add(arr)+ add(arr1);
    }
    
    
    /**
     * addition of array
     * @param arr
     * @return
     */
    public static int add(int arr[]) {
		int total = 0;
		for(int i:arr) {
			total += i;
		}
		return total ;	
	}
    
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
