package com.dataprovideTestNG;

import org.testng.annotations.Test;

public class ClassA {
	 @Test(priority=1)
	 public void A1() {
	System.out.println("A1");
	 }
	 
	 @Test(priority=2)
	 public void A2() {
	System.out.println("A2");
	 }
	 
	 @Test(priority=3)
	 public void A3() {
	System.out.println("A3");
	 }

//	public static void main(String[] args) {
//
//		String[] ar = { "author Paul Eggert",
//
//				"5e0e89eac1a00a2edb87ea7b69f1f38c2b1249e1 1 1 1", "author Paul Eggert",
//				"author-mail <eggert@cs.ucla.edu>", "author-time 861998989", "author-tz +0000", "committer Paul Eggert",
//				"committer-mail <eggert@cs.ucla.edu>", "committer-time 861998989", "committer-tz +0000",
//				"summary GNU tar 1.12", "previous 1d0c64017d67fef025d796a7af923df9f73de701 src/tar.c",
//				"filename src/tar.c", "/* A tar (tape archiver) program.",
//				"17afd0438f6d86686e9bc6df80e538b3201b889e 2 2 1", "author Paul Eggert",
//				"author-mail <eggert@cs.ucla.edu>", "author-time 998923316", "author-tz +0000", "committer Paul Eggert",
//				"committer-mail <eggert@cs.ucla.edu>", "committer-time 998923316", "committer-tz +0000",
//				"summary (ANCHORED_OPTION, IGNORE_CASE_OPTION, NO_ANCHORED_OPTION,"
//
//		};
////		retrieveAuthor(ar);
//		System.out.println(lengthOfLongestSubstring("pwwkew"));
//
//	}

//	public static void retrieveAuthor(String[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i].length() > 0) {
//				if (arr[i].contains("author ")) {
//					String[] text = arr[i].split(" ");
//					String name = "";
//					for (int j = 1; j < text.length; j++) {
//						name = name + text[j] + " ";
//					}
//					System.out.println(name.trim());
//				}
//			}
//		}
//	}
	
//	 public static int lengthOfLongestSubstring(String s) {
//	        int n = s.length(), ans = 0;
//	        int[] index = new int[128]; // current index of character
//	        // try to extend the range [i, j]
//	        for (int j = 0, i = 0; j < n; j++) {
//	            i = Math.max(index[s.charAt(j)], i);
//	            ans = Math.max(ans, j - i + 1);
//	            index[s.charAt(j)] = j + 1;
//	        }
//	        return ans;
//	    }

}
