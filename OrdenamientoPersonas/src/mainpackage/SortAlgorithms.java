package mainpackage;

import java.util.Arrays;

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
    
    public void mergeSort(T[] arr){
        int length = arr.length;
        
        if(length == 1) return;
        
        int middle = length / 2;
        
        T[] leftArr = Arrays.copyOfRange(arr, 0, middle);
        T[] rightArr = Arrays.copyOfRange(arr, middle, length);
        
        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(leftArr, rightArr, (T[])arr);
    }
    
    private void merge(T[] leftArr, T[] rightArr, T[] arr){
        int leftSize = arr.length /2;
        int rightSize = arr.length - leftSize;
        
        T[] leftTArr = (T[])leftArr;
        
        int i = 0, l = 0, r = 0;
        
        while(l < leftSize && r < rightSize){
            if(leftArr[l].compareTo(rightArr[r]) < 0){
                arr[i] = leftArr[l];
                i++;
                l++;
            }else{
                arr[i] = rightArr[r];
                i++;
                r++;
            }
        }
        while(l < leftSize){
            arr[i] = leftArr[l];
            i++;
            l++;
        }
        while(r < rightSize){
            arr[i] = rightArr[r];
            i++;
            r++;
        }
    }
}
