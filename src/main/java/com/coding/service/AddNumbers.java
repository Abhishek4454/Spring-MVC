package com.coding.service;

import org.springframework.stereotype.Service;

@Service
public class AddNumbers {

	public int addMethod(int i, int j) {
		int k=i+j;
		return k;
	}
}
