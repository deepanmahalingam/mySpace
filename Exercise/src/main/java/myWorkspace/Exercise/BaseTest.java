package myWorkspace.Exercise;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


import myWorkspace.Framework.Reporter;

public class BaseTest 
{

@BeforeTest
public void preStep(ITestContext txt)
{
	Reporter.startReport(txt);
}
@AfterTest
public void postStep()
{
	Reporter.endReport();
}
@BeforeMethod
public void setUp(Method method)
{
	Reporter.setup(method);
}
@AfterMethod
public void closeUp()
{
	
}
}
