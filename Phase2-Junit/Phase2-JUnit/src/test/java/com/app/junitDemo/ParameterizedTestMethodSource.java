package com.app.junitDemo;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ParameterizedTestMethodSource {

	@ParameterizedTest
	@MethodSource("stringParameters")
	public void getDataFromMethod(String input) {
		System.out.println("The value from method is :" + input);
	}

	public static Stream<String> stringParameters() {
		return Stream.of("Monday", "Tuesday", "Wednesday");
	}
}
