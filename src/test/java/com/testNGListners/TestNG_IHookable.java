package com.testNGListners;

import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_IHookable implements IHookable {

	@Override
	public void run(IHookCallBack callBack, ITestResult testResult) {
		Object[] param = callBack.getParameters();
		for(int i=0;i<param.length;i++) {
			if(param[i].equals("dummy")) {
				System.out.println("skip for param");
			}else {
				callBack.runTestMethod(testResult);
			}
		}
		
	}

	@BeforeSuite
    public void beforeSuite() {
        System.out.println("before suite");
    }
     
    @Test(dataProvider="getDp")
    public void t(String p) {
        System.out.println("test method t called with parameter " + p);
    }
     
    @DataProvider
    public Object[][] getDp() {
        return new Object[][]{{"client1"}, {"client2"}, {"dummy"}};
    }

}
