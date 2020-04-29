
//BUBBLE SORT//

import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) {
		//System.out.println("GfG!");
		Scanner obj = new Scanner(System.in);
		int n=obj.nextInt();
		int arr[]=new int[n];
		int temp=0;     
		
		for(int i=0;i<n;i++)
		{arr[i]=obj.nextInt();}
		
		for(int i=0;i<n-1;i++)
		{
		    for(int j=0;j<n-1;j++)
		    {
		        if(arr[j+1]<arr[j])
		        {
		            temp=arr[j+1];
		            arr[j+1]=arr[j];
		            arr[j]=temp;
		        }
		    }
		}
		
	    for(int i=0;i<n;i++)
	    {
	        System.out.print(arr[i]+" ");
	    }
	}
}