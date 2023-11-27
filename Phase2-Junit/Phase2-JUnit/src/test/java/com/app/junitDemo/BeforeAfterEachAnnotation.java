package com.app.junitDemo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeforeAfterEachAnnotation {

	// JUnit : @BeforeEach & @AfterEach are similar to TestNG : @BeforeMethod &
	// @AfterMethod

	@BeforeEach // Execute the init() method before each test method
	public void init() { // Pre-condition method //SetUp methbod

		System.out.println("Start the DB Connection..");

		System.out.println("Initalization Done..SetUp");

	}

	@AfterEach // execute teardown() method after each test method
	public void tearDown() {

		System.out.println("Close DB Connection.. TearDown");
	}

	@Test
	public void test1() {

		System.out.println("Execution of test method-1");
	}

	@Test
	public void test2() {

		System.out.println("Execution of test method-2");
	}

}
