package com.Array.pack;

public class MergeSort {
   public static void main(String[] args) {
	int[]a= {1,5,8,9,7,3,4,6};
	sort(a);
	for(int n:a) {
		System.out.print(n+" ");
	}
}
   public static void sort(int[]a) {
	  if(a.length==1)return;
	  int[] left =new int[a.length/2];
	  int[]right=new int[a.length-left.length];
	  for(int i=0;i<left.length;i++) {
		  left[i]=a[i];
	  }
	  for(int j=0;j<right.length;j++) {
		  right[j]=a[left.length+j];
	  }
	  sort(left);
	  sort(right);
	  merge(left,right,a);
	  
   }
   private static void merge(int[]a,int[]b,int[]c) {
	   int i=0,j=0,k=0;
	   while(i<a.length && j<b.length) {
		   if(a[i]<b[j]) {
			   c[k]=a[i];
			   i++;
			   k++;
			   
		   }else {
			   c[k]=b[j];
			   j++;
			   k++;
			   
		   }
	   }
	   while(i<a.length) {
		   c[k]=a[i];
		   i++;
		   k++;
		   
	   }
	   while(j<b.length) {
		   c[k]=b[j];
		   j++;
		   k++;
		   
	   }
   }
}
