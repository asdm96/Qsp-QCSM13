package com.demoTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import demo.actiTime.GenericUtils.BaseClass;

public class TestCase2 extends BaseClass {
	@Test
	public void sample() {
		System.out.println("started");
		Assert.fail();
		System.out.println("ended");
	}

}
