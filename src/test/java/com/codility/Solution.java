package com.codility;

//write your code in Java

//you can also use imports, for example:
import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

/**
 * (c) Copyright 2018, Synopsys, Inc. All rights reserved worldwide.
 * 
 * You may not copy this code and post it anywhere without written consent from
 * the copyright holder.
 **/

class Solution {

	List<Important> highlights;

	/**
	 * Tags used to flag important log messages.
	 **/
	enum Tag {
		// fill in with necessary details -- COMPLETING THIS IS OPTIONAL, BUT BONUS IF
		// YOU USE THIS CORRECTLY!
	}

	/**
	 * Encapsulates important log messages for further processing.
	 **/
	class Important {

		String str = null;

		// fill in with necessary details
		// List<String> items = new ArrayList<>();
		// Important highlights;

		Important(String item) {
			this.str = item;
		}

		public String toString() {
			return str;
		}

	}

	public Solution() {
		// add necessary stuff here
		this.highlights = new ArrayList<>();
	}

	public String solution(String log) {
		// write your code in Java

		Solution sol = new Solution();

		String[] str = log.split("\\s*\\r?\\n\\s*");
		for (String s : str) {
			String res = null;
			if (s.toUpperCase().contains("EXCEPTION:")) {
				res = "EXCEPTION found: " + s;
				Important exception = new Important(res);
				highlights.add(exception);

			} else if (s.toUpperCase().contains("ERROR:")) {
				res = "ERROR found: " + s;
				Important error = new Important(res);
				highlights.add(error);
			} else if (s.toUpperCase().contains("RESULT:")) {
				res = "RESULT found: " + s;
				Important result = new Important(res);
				highlights.add(result);
			}
		}
		///// DO NOT CHANGE THE CODE BELOW /////
		return formatResults();
	}

	///// DO NOT CHANGE CODE BELOW /////
	private String formatResults() {
		String results = "{";
		for (Important item : highlights) {
			results += "'" + item + "',";
		}
		results += "}";
		return results;
	}

}
