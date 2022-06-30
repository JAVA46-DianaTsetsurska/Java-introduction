package telran.texts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringClassTests {

	@Test
	void deepCompareTest() {
		String str1 = "1234,tT89";
		String str2 = "1234,tT89";
		String str3 = "19";
		String str4 = "kugy";
		String str5 = "98Tt,321";
		int expected1[] = {8, 0};
		int expected2[] = {1, 1};
		int expected3[] = {0, 8};
		int expected4[] = {0, 0};
		assertArrayEquals(expected1,Strings.deepNoRepeatedCompare(str1, str2));
		assertArrayEquals(expected2,Strings.deepNoRepeatedCompare(str1, str3));
		assertArrayEquals(expected3,Strings.deepNoRepeatedCompare(str1, str5));
		assertArrayEquals(expected4,Strings.deepNoRepeatedCompare(str1, str4));
	}

}
