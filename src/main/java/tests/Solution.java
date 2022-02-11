/*
 * Click `Run` to execute the snippet below!
 */

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
    public static void main(String[] args) {
        //int [] list =  {-1, 5, 0, 2, 1, 9, 4};
        //int smallest = findSmallestNumber(list);

        System.out.println(findSmallestNumber(new int[]{-1, 5, 0, 2, 1, 9, 4}) == 3);
        System.out.println(findSmallestNumber(new int[]{1}) == 2);
        System.out.println(findSmallestNumber(new int[]{-1}) == 1);
        System.out.println(findSmallestNumber(new int[]{2}) == 1);
        System.out.println(findSmallestNumber(new int[]{1, 2}) == 3);
        System.out.println(findSmallestNumber(new int[]{-1, 0, 2}) == 1);
        System.out.println(findSmallestNumber(new int[]{-1, 0, 2, 1, 1000000, 5, 3, 8, 4, -1000000}) == 6);
    }

    public static int [] sort(int [] list){
        int n=list.length;
        for(int i=0; i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(list[j]>list[j+1]){
                    int temp = list[j+1];
                    list[j+1]=list[j];
                    list[j]=temp;
                }
            }
        }
        return list;
    }

    public static int findSmallest(int[] list){
        int smallest=-1;
        if(list.length==1 && list[0]!=1 || list.length==0){
            smallest = 1;
        }
        else if(list.length==1 && list[0]==1){
            smallest = 2;
        }
        else {
            for (int i = 0; i < list.length-1 ; i++) {
                if (list[i] >= 0 && list[i + 1] >= 0) {
                    if (list[i + 1] - list[i] > 1) {
                        smallest = list[i] + 1;
                        break;
                    }
                }
            }
            if (smallest == -1) {
                smallest = list[list.length - 1] + 1;
            }
        }
        return smallest;
    }

    public static int findSmallestNumber(int list[]){
        int [] sortedArray = sort(list);
        return findSmallest(sortedArray);
    }
}



/* 
Your previous Python 3 content is preserved below:

'''
Write a function that;

Given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
'''

def solution(arr):
    pass


 */





