package uk.co.library.testsuite;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;
import uk.co.library.pages.HomePage;
import uk.co.library.testbase.TestBase;

public class JobSearchTest extends TestBase {
    HomePage homePage ;

        @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
    }
    @Test (dataProvider = "jobdata",dataProviderClass = TestData.class)
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String
            distance, String salaryMin, String salaryMax, String salaryType, String jobType,String result) {

        homePage.acceptCookies();
        homePage.enterJobTitle(jobTitle);
        homePage.enterlocation(location);
        homePage.selectDistance(distance);
        homePage.clickonmoresearchoptions();
        homePage.enterSalarymin(salaryMin);
        homePage.entersalarymax(salaryMax);
        homePage.selectSalaryType(salaryType);
        homePage.selectJobTypeDropdown(jobType);
        homePage.clickOnFindjob();
        String expectedMsg = result;
        Assert.assertEquals(result,homePage.verifyResult(result));

    }
}