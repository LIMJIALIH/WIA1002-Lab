
package Lab10;

public class Sort {
    
    public void selectionSortSmallest(int [] arr){
        for(int i = 0 ; i < arr.length - 1 ; i++){
            int smallestValue = arr[i];
            int smallestIndex = i;
            
            for(int j = i+1 ; j < arr.length ; j++){
                
                if(smallestValue > arr[j]){
                    smallestValue = arr[j];
                    smallestIndex = j;
                }
            }
            
            if(smallestIndex != i){
                    arr[smallestIndex] = arr[i];
                    arr[i] = smallestValue;
                }
        }
    }
    
    public void selectionSortLargest(int [] arr){
        for(int i = 0 ; i < arr.length - 1 ; i++){
            int largestValue = arr[i];
            int largestIndex = i;
            
            for(int j = i + 1 ; j < arr.length ; j++){
                
                if(largestValue < arr[j]){
                    largestValue = arr[j];
                    largestIndex = j;
                }
                
            }
            
            if(largestIndex != i){
                arr[largestIndex] = arr[i];
                arr[i] = largestValue;
            }
        }
    }
    
    public void insertionSort(int [] arr){
        for(int i = 1 ; i < arr.length ; i++){
            int current = arr[i];
            
            int j;
            for( j = i-1 ; j>=0 && arr[j]>current ; j--){
                arr[j+1] = arr[j];
            }
            
            arr[j+1] = current;
        }
    }
    
    public void bubbleSort(int [] arr){
        for(int i = 0 ; i < arr.length ; i++){
            boolean sort = false;
            for(int j = 0 ; j<arr.length - 1 ; j++){
                if(arr[j+1] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    sort = true;
                }
            }
            
            if(!sort){
                break;
            }
        }
    }
    
    public void mergeSort(int [] arr){
        if(arr.length > 1){
            int [] firstHalf = new int [arr.length/2];
            System.arraycopy(arr, 0, firstHalf, 0, firstHalf.length);
            mergeSort(firstHalf);
        
            int secondHalfLen = arr.length - arr.length/2;
            int [] secondHalf = new int [secondHalfLen];
            System.arraycopy(arr, arr.length/2, secondHalf, 0, secondHalfLen);
            mergeSort(secondHalf);
            
            merge(firstHalf, secondHalf, arr);
        }
    }

    private void merge(int[] firstHalf, int[] secondHalf, int[] arr) {
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;
        
        while(current1 < firstHalf.length && current2 < secondHalf.length){
            if(firstHalf[current1] < secondHalf[current2]){
                arr[current3++] = firstHalf[current1++];
            }else{
                arr[current3++] = secondHalf[current2++];
            }
        }
        
        while(current1 < firstHalf.length){
            arr[current3++] = firstHalf[current1++];
        }
        
        
        while(current2 < secondHalf.length){
            arr[current3++] = secondHalf[current2++];
        }
    }
    
    public int binarySearch(int [] arr, int key){
        int highest = arr.length - 1;
        int lowest = 0;
        int middle;
        while(highest >= lowest){
            middle = (highest + lowest) /2;
            
            if(arr[middle] == key){
                return middle;
            }else if(key < arr[middle]){
                highest = middle-1;
            }else{
                lowest = middle+1;
            }
        }
        return -1;
    }
}
