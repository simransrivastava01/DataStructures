//HEAPSORT

import java.util.*;

class GFG {
    static void heapSort(int arr[],int n)
    {
        for(int i=n/2-1;i>=0;i--)
        {
            heapify(arr,n,i);
        }
        
        for(int i=n-1;i>0;i--)
        {
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            
            heapify(arr,i,0);
        }
    }
    static void heapify(int arr[],int n,int i)
    {
        int root=i;
        int l=2*i+1;
        int r=2*i+2;
        
        if(l<n && arr[l]>arr[root])
        {
            root=l;
        }
        if(r<n && arr[r]>arr[root])
        {
            root=r;
        }
        
        if(root!=i)
        {
            int temp=arr[i];
            arr[i]=arr[root];
            arr[root]=temp;
            
            heapify(arr,n,root);
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
		heapSort(arr,n);
		for(int i=0;i<n;i++)
		{
		    System.out.print(arr[i]+" ");
		}
	}
}