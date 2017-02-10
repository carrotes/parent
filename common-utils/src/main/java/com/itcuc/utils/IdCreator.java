package com.itcuc.utils;

import java.util.UUID;

public class IdCreator {
	public static String createId(){
		return UUID.randomUUID().toString();
	}
}
