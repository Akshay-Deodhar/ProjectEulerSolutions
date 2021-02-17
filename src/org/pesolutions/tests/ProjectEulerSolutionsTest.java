package org.pesolutions.tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.pesolutions.solutions.*;

public final class ProjectEulerSolutionsTest {

	@Test
	public void testP0001() {
		assertEquals("233168", new P0001().execute());
	}

	@Test
	public void testP0002() {
		assertEquals("4613732", new P0002().execute());
	}

	@Test
	public void testP0003() {
		assertEquals("6857", new P0003().execute());
	}

	@Test
	public void testP0004() {
		assertEquals("906609", new P0004().execute());
	}

	@Test
	public void testP0005() {
		assertEquals("232792560", new P0005().execute());
	}

	@Test
	public void testP0006() {
		assertEquals("25164150", new P0006().execute());
	}

	@Test
	public void testP0007() {
		assertEquals("104743", new P0007().execute());
	}

}
