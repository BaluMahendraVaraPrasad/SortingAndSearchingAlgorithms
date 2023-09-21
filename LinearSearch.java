package com.Array.pack;

public class LinearSearch {
   public static void main(String[] args) {
	int[]a= {5,8,9,15,45,64};
	System.out.println(search(a,45));
	System.out.println(search(a,35));
   }
	static int search(int[]a, int ele) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele)return i;
		}
		return -1;	
	}
}
