//QUICKSORT

import java.util.*;

class GFG {
    static int partition(int arr[],int start,int end)
    {
        int pivot=arr[end];
        int i=start-1;
        for(int j=start;j<=end-1;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,end);
        return i+1;
    }
     public static void swap(int a[],int x,int y)
    {
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    static void quickSort(int arr[],int start,int end)
    {
        if(start<end)
        {
            int x=partition(arr,start,end);
            quickSort(arr,start,x-1);
            quickSort(arr,x+1,end);
        }
    }
	public static void main (String[] args) {
		//System.out.println("GfG!");
		Scanner obj = new Scanner(System.in);
		int n=obj.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
		    arr[i]=obj.nextInt();
		}
		quickSort(arr,0,n-1);
		for(int i=0;i<n;i++)
		{
		    System.out.print(arr[i]+" ");
		}
	}
}