package org.pesolutions.tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.pesolutions.solutions.*;

public final class ProjectEulerSolutionsTest {

	/**
	 * Test for Problem 1
	 */
	@Test
	public void testP0001() {
		assertEquals("233168", new P0001().execute());
	}

	@Test
	public void testP0002() {
		assertEquals("4613732", new P0002().execute());
	}
}
