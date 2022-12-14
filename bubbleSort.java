import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;
public class bubbleSort
{
	static void swap(int[] arr,int first,int second){
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}
	static void bubblesort(int[] arr){
		for(int i=0;i<arr.length;i++)
		{
			boolean swapped=false;
			for(int j=1;j<arr.length-i;j++){
				if(arr[j]<arr[j-1])
				{
					swap(arr,j,j-1);
					swapped=true;
				
				}


			}
			if(!swapped)
			{
				break;
			}


	}
	}
	public static void main(String[] args){
		int[] arr={23,0,934,23,21,455};
		System.out.println("The unsorted array is: ");
		System.out.println(Arrays.toString(arr));
		bubblesort(arr);
		System.out.println("The sorted array is: ");
		System.out.println(Arrays.toString(arr));

	}
}
