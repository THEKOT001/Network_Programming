package PACKAGE_NAME;

import java.util.Arrays;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        Random rd = new Random(); // creating Random object
        int[] arr = new int[100];
        int[] temp = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(10)+1; // storing random integers in an array
            //            System.out.println(arr[i]+" "); // printing each array element
        }
        System.out.println(Arrays.toString(arr));

        //Sort an unsorted array
        Arrays.sort(arr);

        int len = arr.length;
        int j = 0;

        //Traverse an array
        for (int i = 0; i < len - 1; i++) {

            //if value present at i and i+1 index is not equal
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }

        arr[j++] = arr[len - 1];
        int itemp = j-1;
        int itemp2 = j-1;

        for (int k = 0; k < j; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println("\n");
        int[] finalarray =new int [j];
        int k =0;
        for (int i=0; i<j;i++){
            if (i%2==0){
                finalarray[k]=arr[i];
                k++;
            }
            else {finalarray[itemp]=arr[i];
                itemp--;
            }
        }
        for (int i=0;i<j;i++){
            System.out.print(finalarray[i]+ " " );
        }
        System.out.println(" ");
        //drawing part
        int a=10;
        int[][] draw = new int [j][j];
        for (int i =0; i<j;i++){
            for (int m=0;m<j;m++){
                if(a<=finalarray[m])
                {System.out.print("#");}
                else
                {System.out.print(" ");}
                System.out.print(" ");
            }
            System.out.print("\n");

            a--;
        }
        for (int i=0;i<j;i++){
            System.out.print(finalarray[i]+ " " );
        }

    }
}
