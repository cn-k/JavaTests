package tests;

public class QuickSort {
    public static void main(String[] args) {
        Integer [] list = {0,8,2,6,7,5,4};
        String [] names = {"cenk","ali","kerem","merve"};
        sort(list, 0, list.length-1);
        for (int i = 0 ; i<list.length;i++) {
            System.out.println(list[i]);
        }   
        sort(names, 0, names.length-1);
        for (int i = 0 ; i<names.length;i++) {
            System.out.println(names[i]);
        }
    }
    public static <T extends Comparable<T>> void sort(T[] A, int low, int high){
        if(low<high){
        int pivotIndex = partition(A, low, high);
        sort(A, low, pivotIndex-1);
        sort(A, pivotIndex+1, high);
        }
    }
    public static <T> void swap(T [] A, int index1, int index2){
        T tmp = A[index1];
        A[index1] = A[index2];
        A[index2] = tmp;
    }
    public static  <T extends Comparable<T>> int partition(T[] A, int low, int high){
        int border = low+1;
        for(int i = border; i<=high; i++){
            if(A[i].compareTo(A[low]) <= 0){
                swap(A, i, border++);
            }
        }
        swap(A, low, border-1);
        return border-1;
    }
}


