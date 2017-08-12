package com.domain.util.test;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Test;
import org.springframework.util.Assert;

import com.domain.util.Util;

public class UtilTest {

	@Test
	public void testGetProperty() {
		System.out.println(Util.getProperty("TEST"));
		Assert.notNull(Util.getProperty("TEST"), "Property must be readable");
	}
	
	@Test
	public void testUUID() {
		for(int i = 0; i < 5000; i++) {
			System.out.println(RandomStringUtils.randomAlphanumeric(10));
		}
	}
}
