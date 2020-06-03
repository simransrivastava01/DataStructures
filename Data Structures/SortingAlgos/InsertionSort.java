
//Insertion SORT//

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner obj = new Scanner(System.in);
		int n=obj.nextInt();
		int arr[]=new int[n];
		int j=0;
		for(int i=0;i<n;i++)
		{arr[i]=obj.nextInt();}
		
		for(int i=0;i<n;i++)
		{
		  int key=arr[i];
		  j=i-1;
		 if(j>=0 && arr[j]>key)
		 {
		     arr[j+1]=arr[j];
		     j=j-1;
		 }
		 arr[j+1]=key;
		}
		for(int i=0;i<n;i++)
		{
		    System.out.print(arr[i]+" ");
		}
	}
}