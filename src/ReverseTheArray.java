import java.util.Arrays;
import java.util.Scanner;
class Solution{
    public int[] ReverseArr(int[] arr )
    {
        int arrLength = arr.length;
        int[] arra = new int[arrLength];
        arra = arr;
        int temp;
        int j=arra.length-1;
        for(int i=0;i<arrLength/2;i++){
            temp=arra[i];
            arra[i] = arra[j];
            arra[j] = temp;
            j--;
        }
        return arra;
    }
}


public class ReverseTheArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int sizeOfArray = sc.nextInt();
        int[] arr = new int[sizeOfArray];
        System.out.print("Enter the Elements of the array : ");
        for(int i=0;i<sizeOfArray;i++){
            arr[i] = sc.nextInt();
        }
        Solution answer = new Solution();

        System.out.println("after reversed the array : "+ Arrays.toString(answer.ReverseArr(arr)));

        sc.close();
    }
}
