package classes;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void testLevenshteinDistance() {

		int result = StringUtils.levenshteinDistance("distance", "distance");
		assertEquals(0, result);

	}
}
