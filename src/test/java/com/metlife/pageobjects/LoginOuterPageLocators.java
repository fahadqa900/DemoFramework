package com.metlife.pageobjects;

import org.openqa.selenium.By;

public class LoginOuterPageLocators
{
    public static By userName=By.id("authUser");
    public static By userPassword=By.id("clearPass");
    public static By userLoginButton=By.id("login-button");
    public static By errorMessageOnInvalidCredentials=By.cssSelector("p.text-danger");
}
