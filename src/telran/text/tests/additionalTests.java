package telran.text.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.texts.additional;

class additionalTests {

	@Test
	void hasValidBracketsTest() {
		assertTrue(additional.hasValidBrackets("{{[ghjk]}}"));
		assertFalse(additional.hasValidBrackets("()dfgswfgsf)"));
		assertFalse(additional.hasValidBrackets("[werwert(wertwrtw] wertrt)"));
		assertFalse(additional.hasValidBrackets("aaaaaa (sdfsdfdsf[dfd(f)f] zcvzxcv {{[ghjk]}} asd ){"));
	}

}
