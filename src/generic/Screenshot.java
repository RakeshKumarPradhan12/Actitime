package generic;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import zmq.ZError.IOException;

public class Screenshot implements ITestListener
{
public void onTestFailure(ITestResult result)
{
	TakesScreenshot ts=(TakesScreenshot)BaseTest.driver;
	File srcFile=ts.getScreenshotAs( OutputType.FILE);
	File destFile=new File( "./failedscreenshot/failed.png");
	try
	{
		FileHander.copy(srcFile,destFile);
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}

}
