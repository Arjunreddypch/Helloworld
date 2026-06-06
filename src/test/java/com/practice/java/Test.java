package com.practice.java;

import java.util.HashSet;
import java.util.Set;

public class Test {
	
	
public void test() {
String text="sfdsfl$lsls(dlsfkj";
	
	String rchars=text.replaceAll("[^a-z]", "");
	String rspcecial=text.replaceAll("[a-z]", "");
	
	String reverse="";
	int count1=rchars.length();
	int count2=0;
	for(int i=0;i<text.length();i++) {
		
		if(Character.isAlphabetic(text.charAt(i))) {
			
			
			reverse=reverse+rchars.charAt(count1-1);
			count1=count1-1;
		}else {
			reverse=reverse+rspcecial.charAt(count2);
			count2=count2+1;
		}
	}
	
	System.out.println(reverse);
	

}
public static void main(String[] args) {
	
	int min=1;
	int arr[]= {1,2,5,6,7,-1};
	
	
	Set<Integer> set=new HashSet<>();
	
	for(int ar:arr) {
		
		set.add(ar);
	
	while(set.contains(min)) {
		
		min++;
	}
	
	
	
	}
	
	System.out.println(min);
	
}
}
