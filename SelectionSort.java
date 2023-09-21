package com.Array.pack;

public class SelectionSort{
	public static void main(String[] args) {
		int[]a= {10,5,6,4,8,45,6};
		sort(a);
		for(int n:a) {
			System.out.print(n+" ");
		}
	}
   public static void sort(int[]a) {
	  for(int i=0;i<a.length-1;i++) {
		  int index=i;
		  for(int j=i+1;j<a.length;j++) {
			  if(a[j]<a[index])index=j;
		  }
		  if(i!=index) {
			  int temp=a[i];
			  a[i]=a[index];
			  a[index]=temp;
			  
		  }
		  
	  }
   }
}
