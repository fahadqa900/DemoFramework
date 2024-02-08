package com.metlife.testsuites;

import com.metlife.utility.WebUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class SetupTearDown
{
@BeforeClass
public void browserSetup()
{
WebUtils.browserInitialize("Chrome");
}
@BeforeMethod
public void launchWebBrowser()
{
WebUtils.launchBrowser("https://demo.openemr.io/openemr/interface/login/login.php?site=default");
}
@AfterMethod
public void handlingAlerts()
{
WebUtils.handlingRandomAlertWindow();
}
@AfterClass
public void closeWebBrowser()
{
WebUtils.closeBrowser();
}
}
