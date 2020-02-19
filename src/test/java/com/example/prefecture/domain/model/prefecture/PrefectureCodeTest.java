package com.example.prefecture.domain.model.prefecture;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.example.prefecture.domain.model.PrefectureCode;

class PrefectureCodeTest {

	@Test
	void _都道府県コードを設定() {
		PrefectureCode code = new PrefectureCode("13");
		assertEquals("13", code.getValue());
	}

	@Test
	void _Nullの場合はIllegalArgumentExceptionが発生する() {
		Exception thrown = assertThrows(IllegalArgumentException.class, () -> new PrefectureCode(null));

		assertTrue(thrown instanceof IllegalArgumentException);
		assertEquals("都道府県コードを指定してください。", thrown.getMessage());
	}
}
