package com.Array.pack;

public class BubbleSort {
	public static void sort(int[]a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j+1]<a[j]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	
   public static void main(String[] args) {
	  int[]a= {5,9,15,4,3,8,2,1};
	  sort(a);
	  for(int n:a)
	  System.out.println(n);
}
}
