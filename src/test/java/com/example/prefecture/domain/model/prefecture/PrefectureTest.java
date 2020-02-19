package com.example.prefecture.domain.model.prefecture;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PrefectureTest {

	@Test
	void _都道府県コードと都道府県名を指定() {
		Prefecture prefecture = new Prefecture("13", "東京都");
		assertEquals("13", prefecture.getCode());
		assertEquals("東京都", prefecture.getName());
	}
}
