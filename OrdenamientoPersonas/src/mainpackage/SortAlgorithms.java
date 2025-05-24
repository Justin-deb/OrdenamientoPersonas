/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpackage;

/**
 *
 * @author Justin
 */
public class SortAlgorithms<T extends Comparable<T>> {
    public void quickSort(T[] arr, int start,int end){
        if(end <=start) return;
        
        int pivot = partition(arr, start, end);
        
        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }
    
    private int partition(T[] arr, int start,int end){
        T pivot = arr[end];
        int i = start -1;
        
        for(int j = start; j <= end -1 ; j++){
            if(arr[j].compareTo(pivot) < 0){
                i++;
                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        T temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
        
        return i;
    }
}
