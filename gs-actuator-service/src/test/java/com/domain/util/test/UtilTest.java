package com.domain.util.test;

import org.junit.Test;
import org.springframework.util.Assert;

import com.domain.util.Util;

public class UtilTest {

	@Test
	public void testGetProperty() {
		System.out.println(Util.getProperty("TEST"));
		Assert.notNull(Util.getProperty("TEST"), "Property must be readable");
	}
}
