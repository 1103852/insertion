public class inserionSort {
    int[] arraySort(int arr[]){
        int i;
        int key;
         for (int j = 1; j < arr.length; j++){
             key = arr[j];
             i = j-1;
             while (i >= 0 && arr[i]> key){
                 arr[i+1] = arr[i];
                 i = i - 1;
             }
             arr[i+1] = key;
         }
         return arr;
    }


}
