package com.readFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import javax.imageio.stream.FileImageInputStream;

import org.apache.log4j.Logger;

public class ReadTextFile {
	static Logger logger = Logger.getLogger(ReadTextFile.class.getName());

	public static void main(String[] args) throws IOException {
		
//		logger.info(new String(Files.readAllBytes(
//				Paths.get("C:\\Users\\Suresh Mylam\\eclipse-workspace\\TestNG_Listners\\Files\\Text.txt"))));
		File file = new File("C:\\Users\\Suresh Mylam\\eclipse-workspace\\1TestNG_Listners\\Files\\Text.txt");
		
		// =========================================================
		BufferedReader bd = new BufferedReader(new FileReader(file));
		String str;
//		while ((str = bd.readLine()) != null) {
//			System.out.println(str);
//		}
		

		// =========================================================
		// =========================================================
		// FileInputStream fis = new FileInputStream(f);
		// byte[] b = new byte[fis.available()];
		// fis.read(b);
		// fis.close();
		//
		// String str=new String(b);
		// System.out.println(str);
		// =========================================================

//		Scanner sc = new Scanner(file);
//		 sc.useDelimiter("\\Z"); 
//		 
//		 String fileString = new Scanner((File)file).useDelimiter("\\z").next();
//		 String fileString2 = new Scanner((File)file).useDelimiter("\\Z").next();
//		 System.out.println("using Z : " + fileString2.length());
//		 System.out.println("Using z "+ fileString.length());
//		 
//		  
////		    System.out.println(sc.next()); 
//		
////		while(sc.hasNextLine()) {
////			System.out.println(sc.nextLine());
//		}
//		=============================================
//		FileReader fr = new FileReader(file);
//		int i;
//		while(( i=fr.read())!=-1) {
//			System.out.println((char)i);
//		}
//		StringBuffer s1 = new StringBuffer("Hello");
//		StringBuffer s2 = new StringBuffer("Hello");
//		
//		System.out.println(s1.equals(s2));		
//		System.out.println(s1==s2);	
		
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		System.out.println(s1.equals(s2));		
		System.out.println(s1==s2);	
		
		boolean a = true;
		boolean b = true;
		
		System.out.println(Boolean.compare(a, b));
		
		
		
		
	}
}
