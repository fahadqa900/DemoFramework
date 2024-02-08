package com.metlife.testsuites;

import com.metlife.pageobjects.LoginInnerPageLocators;
import com.metlife.pageobjects.LoginOuterPageLocators;
import com.metlife.testdata.InputData;
import com.metlife.utility.WebUtils;
import org.testng.annotations.Test;

public class LoginTest extends SetupTearDown
{
@Test(dataProviderClass = InputData.class,dataProvider = "invalid_DataInput",priority = 0)
public void getInvalidLogin(String uName,String uPassword)
{
 WebUtils.enterInputText(LoginOuterPageLocators.userName,uName);
 WebUtils.enterInputText(LoginOuterPageLocators.userPassword,uPassword);
 WebUtils.clickAction(LoginOuterPageLocators.userLoginButton);
 WebUtils.enterInputText(LoginOuterPageLocators.errorMessageOnInvalidCredentials,"Invalid username or password");
}
 @Test(dataProviderClass = InputData.class,dataProvider = "valid_DataInput",priority = 1)
 public void getValidLogin(String uName,String uPassword)
 {
  WebUtils.enterInputText(LoginOuterPageLocators.userName,uName);
  WebUtils.enterInputText(LoginOuterPageLocators.userPassword,uPassword);
  WebUtils.clickAction(LoginOuterPageLocators.userLoginButton);
  WebUtils.clickAction(LoginInnerPageLocators.loginIcon);
  WebUtils.clickAction(LoginInnerPageLocators.logout);
 }
}
