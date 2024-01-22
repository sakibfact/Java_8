package com.javaeight;

import java.util.stream.Stream;

public class StreamOfString {

	public static void main(String[] args) {
		
           Stream<String> name=Stream.of("java","kafka","adva");
           
           name.filter(item -> item.endsWith("a")).forEach(System.out::println);
	}
}
