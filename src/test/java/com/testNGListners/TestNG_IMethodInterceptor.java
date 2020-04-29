package com.testNGListners;

import java.util.ArrayList;
import java.util.List;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class TestNG_IMethodInterceptor implements IMethodInterceptor{

	@Override
	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
		List<IMethodInstance> result = new ArrayList<IMethodInstance>();
		
		for(IMethodInstance meth : methods) {
			Test testMethod = (Test) meth.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class);
			if(testMethod.priority()==1) {
				result.add(meth);
			}
		}		
		return result;
	}

}
