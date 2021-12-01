package Practice;

import java.util.Scanner;

public class reverseofArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] array=new int[100];
        int size;
        System.out.println("Enter the size of array");
        size=s.nextInt();
        //inserting simple loop increment in array as elements
        System.out.println("Input the array values");
        for (int i = 0; i < size; i++) {
            array[i]=i;
        }
        //the part where we swap values
        int end=size-1;
        int temp;
        for (int start = 0; start < end; start++) {
            temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            end--;
        }
        //printing the reverse of array
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}
