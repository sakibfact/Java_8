package com.javaeight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamWithObject {

	public static void main(String[] args) {
		
			
		
		  List<String> nameWithStream=new ArrayList<>();
		  
		  nameWithStream.add("job"); nameWithStream.add("Tom");
		  nameWithStream.add("jhon"); nameWithStream.add("jobs");
		  
		  Stream<String> names=nameWithStream.stream(); System.out.print(names);
		 
		 
		
		
		 
	}
}
