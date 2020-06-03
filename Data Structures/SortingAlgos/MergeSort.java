import java.util.Scanner;
//Merge Sort
class GFG
{
    public static void sort(int a[])
    {
        if(a.length>1)
        {
            int i=0,j=0;
            int mid=a.length/2;
            int left[]=new int[mid];
            int right[]=new int[a.length-mid];
            for(i=0;i<mid;i++)
            {
                left[i]=a[i];
            }
            for(i=mid,j=0;i<a.length;i++,j++)
            {
                right[j]=a[i];
            }
            sort(left);
            sort(right);
            merge(left,right,a);
        }
    }
    public static void merge(int left[],int right[],int a[])
    {
        int i=0,j=0,k=0;
        int l=left.length;
        int r=right.length;
        int alength=a.length;
        while(i<l && j<r)
        {
             if(left[i]<right[j])
             {
                 a[k]=left[i];
                 k++;
                 i++;
             }
             else
             {
                 a[k]=right[j];
                 k++;
                 j++;
             }
        }
        while(i<l)
        {
            a[k]=left[i];
            k++;
            i++;
        }
        while(j<r)
        {
            a[k]=right[j];
            k++;
            j++;
        }
    }
    public static void main(String[] args)
    {
        // Write your code here
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
          arr[i]=obj.nextInt();
        }
        sort(arr);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    }