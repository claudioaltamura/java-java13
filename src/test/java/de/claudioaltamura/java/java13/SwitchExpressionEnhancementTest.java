package de.claudioaltamura.java.java13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SwitchExpressionEnhancementTest {

	@Test
	void switchExpression() {
		SwitchExpressionEnhancement switchPatternMatching = new SwitchExpressionEnhancement();

		assertEquals("Looks like a Sunday.", switchPatternMatching.day("x"));
	}

}