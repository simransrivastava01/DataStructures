//SELECTION SORT//

import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) {
		//System.out.println("GfG!");
		Scanner obj = new Scanner(System.in);
		int n=obj.nextInt();
		int arr[]=new int[n];
		int index=0,temp=0;
		
		for(int i=0;i<n;i++)
		{arr[i]=obj.nextInt();}
		
		for(int i=0;i<n;i++)
		{
		  index=i;
		  for(int j=i+1;j<n;j++)
		  {
		      if(arr[j]<arr[i])
		      {index=j;}
		  }
		  temp=arr[index];
		  arr[index]=arr[i];
		  arr[i]=temp;
		}
		for(int i=0;i<n;i++)
		{
		    System.out.print(arr[i]+" ");
		}
	}
}