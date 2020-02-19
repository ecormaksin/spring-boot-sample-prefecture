package com.example.prefecture.domain.model;

import lombok.Data;

@Data
public class PrefectureCode {
	private final String value;

	public PrefectureCode(String value) {
		if (null == value)
			throw new IllegalArgumentException("都道府県コードを指定してください。");
		this.value = value;
	}
}