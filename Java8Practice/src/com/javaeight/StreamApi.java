package com.javaeight;

import java.util.Arrays;
import java.util.List;

public class StreamApi {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 60, 67, 20, 10, 15, 7);

		list.stream().filter(num -> num % 5 == 0).forEach(System.out::println);

	}
}
