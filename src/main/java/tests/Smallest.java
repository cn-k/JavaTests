package tests;

public class Smallest {
    public static void main(String[] args) {
        int [] list = {0,8,2,6,7,5,4};
        

    }
    public static int findSmallest (int [] list){
        int smallest = -1;
        boolean is_smallest =false;
        outerloop:
        for(int i=0;i<list.length;i++){
            is_smallest=true;
            for(int j=0;j<list.length;j++){
                if(i==list[j]){
                    is_smallest = false;
                    break;
                }
            }
            if(is_smallest){
                smallest=i;
                break outerloop;
            }
        }
        return smallest;
    }

    static int findBiggest (int [] list){
        int biggest = -1;
        boolean is_biggest= false;
        outerloop:
        for(int i= list.length; i>0;i--){
            is_biggest=true;
            for (int j=0;j<list.length;j++){
                if(i==list[j]){
                    is_biggest =false;
                    break;
                }
            }
            if(is_biggest){
                biggest=i;
                break outerloop;
            }
        }
        return biggest;
    }
    static int [] bubbleSort(int[] list){
        int n = list.length;
        for(int i=0;i<n-1;i++){
            for(int j=0; j<n-i-1;j++){
                if(list[j]>list[j+1]){
                    int temp = list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                }
            }
        }
        return list;
    }

    static int findSortedSmallest(int list []){
        int smallest=-1;
        if(list[0]!=0)return 0;
        for(int i=0;i<list.length-1;i++){
            if(list[i+1]-list[i]>1){
                smallest=list[i]+1;
                break;
            }
        }
        return smallest;
    }
    static int findSortedBiggest(int list []){
        int biggest = -1;
        for(int i=list.length-1;i>0;i--){
            if(list[i]-list[i-1]>1){
                biggest=list[i]-1;
                break;
            }
        }
        return biggest;
    }
}
