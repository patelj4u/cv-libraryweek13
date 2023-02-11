package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Bhavesh
 */
public class TestData {

    @DataProvider(name = "jobdata")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"Automation Tester","Harrow on the Hill","up to 25 miles","35000","45000","annum","Permanent","Permanent Automation Tester jobs in Harrow on the Hill"},
                {"Automation Engineer","Stanmore, Greater London","up to 10 miles","45000","50000","annum","Contract","Contract Automation Engineer jobs in Stanmore"},
                {"Manual Tester","London","up to 50 miles","250","400","week","Part Time","Part Time Manual Tester jobs in London"},
                {"Automation Tester","Reading","up to 35 miles","55000","70000","annum","Permanent","Permanent Automation Tester jobs in Reading"},
                {"Retail Manager","Wembley","up to 15 miles","25000","45000","annum","Permanent","Permanent Retail Manager jobs in Wembley"},
                {"Nurse","London","up to 35 miles","55000","70000","annum","Permanent","Permanent Nurse jobs in London"}
        };
        return data;
    }

}
