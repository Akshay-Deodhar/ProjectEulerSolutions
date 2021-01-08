package org.pesolutions.tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.pesolutions.solutions.*;

public final class ProjectEulerSolutionsTest {

	/**
	 * Test for Problem 1
	 */
	@Test
	public void testP001() {
		assertEquals("233168", new P001().execute());
	}

}
