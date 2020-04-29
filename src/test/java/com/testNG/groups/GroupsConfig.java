package com.testNG.groups;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class GroupsConfig {
	// Before suite configuration for test methods belong to group G1
		@BeforeSuite(groups = {"G1"})
	    public void BeforeSetupOfG1Group(){
	        System.out.println("BeforeSetupOfG1Group");
	    }
		
		// Before suite configuration for test methods belong to group G2
		@BeforeSuite(groups = {"G2"})
	    public void BeforeSetupOfG2Group(){
	        System.out.println("BeforeSetupOfG2Group");
	    }

		// Before method configuration for for test methods belong to group G1
		@BeforeMethod(groups = {"G1"})
	    public void BeforeMethodOfG1Group(){
	        System.out.println("BeforeMethodOfG1Group");
	    }
		
		// Before method configuration for for test methods belong to group G2
		@BeforeMethod(groups = {"G2"})
	    public void BeforeMethodOfG2Group(){
	        System.out.println("BeforeMethodOfG2Group");
	    }

	   
		// After method configuration for for test methods belong to group G1
	    @AfterMethod(groups = {"G1"})
	    public void AfterMethodOfG1Group(){
	        System.out.println("AfterMethodOfG1Group");
	    }

	    // After method configuration for for test methods belong to group G2
	    @AfterMethod(groups = {"G2"})
	    public void AfterMethodOfG2Group(){
	        System.out.println("AfterMethodOfG2Group");
	    }

	    // After suite configuration for test methods belong to group G1
	    @AfterSuite(groups= {"G1"})
	    public void tearDownOfG1Group(){
	        System.out.println("tearDownOfG1Group");
	    }
	    
	    // After suite configuration for test methods belong to group G2
	    @AfterSuite(groups= {"G2"})
	    public void tearDownOfG2Group(){
	        System.out.println("tearDownOfG2Group");
	    }
}
