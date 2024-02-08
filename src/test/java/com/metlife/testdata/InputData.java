package com.metlife.testdata;

import org.testng.annotations.DataProvider;

public class InputData
{
    @DataProvider
    public Object[][] invalid_DataInput()
    {
        return new Object[][]
                {
                  new Object[]{"admin","pass1"},
                  new Object[]{"admin1","pass"},
                  new Object[]{"admin1","pass1"}
                };
    }
    @DataProvider
    public Object[][] valid_DataInput()
    {
        return new Object[][]
                {
                        new Object[]{"admin","pass"},
                        new Object[]{"receptionist","receptionist"},
                        new Object[]{"physician","physician"}
                };
    }
}
