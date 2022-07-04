package com.denismamoni.workshopmongo.services.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class URL {

	public static String decodeParam(String text) {
		try {
			return URLDecoder.decode(text, "UTf-8");
		} catch (UnsupportedEncodingException e) {
			return "";
		}
	}
}
