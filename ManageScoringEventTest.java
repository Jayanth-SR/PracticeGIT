import Controllers.ScoringEventController;
import Helpers.BrowserInitHelper;
import Helpers.DriverHelper;
import Pom.ManageScoringEventPage;
import Utils.ConsoleLogger;
import org.graphwalker.core.Assert;
import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.Driver;
import java.util.List;
import java.util.Set;

@GraphWalker(value = "random(edge_coverage(100))")
public class ManageScoringEventTest extends ExecutionContext implements ManageScoringEvent {
    ManageScoringEventPage manageScoringEventPage = new ManageScoringEventPage();
    ScoringEventController scoringEventController = new ScoringEventController();

    public void v_LaunchpadPage(){

    }

    public void e_ClickOnAppIcon(){
        DriverHelper.waitUntilLoaderInvisible();
        DriverHelper.clickXpath(manageScoringEventPage.getWaffleIcon());
    }

    public void v_ScoringEventOption(){
        /*Checking Scoring Event option after clicking on App Icon*/
        DriverHelper.checkElementDisplayByXpath(manageScoringEventPage.getScoringEventOption(),"Scoring Event");
    }

    public void e_ScoringEvent(){
        /*Clicking on Scoring Event option*/
        DriverHelper.clickXpath(manageScoringEventPage.getScoringEventOption());
        DriverHelper.waitUntilLoaderInvisible();
    }

    public void v_ScoringEventPage(){
        /*Checking Manage Scoring Event Page header*/
        DriverHelper.checkElementDisplayByXpath(manageScoringEventPage.getPageHeader(),"Manage Scoring event page");
    }

    public void v_BlueFilterOptions() {
        /*Checking Blue Filter Elements*/
       scoringEventController.toVerifyListOfElements(manageScoringEventPage.getBlueFiltersOptions());
    }

    public void v_DistrictTabTableHeader(){
        /*Checking District tab*/
       // DriverHelper.checkElementDisplayByXpath(manageScoringEventPage.getDistrictTab(),"District tab");
        /*Verifying Table Header*/
       // DriverHelper.checkElementDisplayByXpath(manageScoringEventPage.getTableHeader(),"Table header");
    }

    public void v_UnresolvedScoresAndGradersNeededBoxIndicator(){
        /*Checking Unresolved Score key*/
       // DriverHelper.checkElementDisplayByXpath(manageScoringEventPage.getUnresolvedScore(),"Unresolved Score key");
        /*Checking Graders Needed key*/
      //  DriverHelper.checkElementDisplayByXpath(manageScoringEventPage.getGraderNeeded(),"Grader needed  key");
    }

    public void e_ClickOnUnresolvedScores(){
        /*Clicking on Unresolved Score key*/
//        DriverHelper.clickXpath(manageScoringEventPage.getUnresolvedScore());
//        DriverHelper.waitUntilLoaderInvisible();

    }

    public void v_UnresolvedScoresEvent(){
        /*Checking Unresolved Score Indicator*/
        //DriverHelper.checkElementDisplayByXpath(manageScoringEventPage.getUnresolvedScoreIndicator(), "Unresolved score indicator");
    }

    public void e_ClickOnGradersNeeded(){
        /*Clicking Graders Needed key*/
//        DriverHelper.clickXpath(manageScoringEventPage.getGraderNeeded());
//        DriverHelper.waitUntilLoaderInvisible();
    }

    public void v_GradersNeededEvents(){
        /*Checking Graders Needed Indicator*/
       // DriverHelper.checkElementDisplayByXpath(manageScoringEventPage.getGraderNeededIndicator(),"Grader needed indicator");
    }

    public void v_OtherIcons(){
        /*Checking Download Icon*/
//        DriverHelper.checkElementDisplayByXpath(manageScoringEventPage.getDownloadIcon(),"Download icon");
//        /*Checking Bulk Event Window Change Icon*/
//        DriverHelper.checkElementDisplayByXpath(manageScoringEventPage.getBulkEventWindowHandle(),"Bulk Event Window Handle Icon");
//        /*Checking Delete Icon*/
//        DriverHelper.checkElementDisplayByXpath(manageScoringEventPage.getDeleteIcon(),"Delete icon");
    }

    public void e_ClickOnDownloadIcon(){
        /*Clicking Download Icon*/
      //  DriverHelper.clickXpath(manageScoringEventPage.getDownloadIcon());
    }

    public void v_DownloadOptions(){
        /*Verifying the Options After clicking Download Icon*/
      //  scoringEventController.toVerifyListOfElements(manageScoringEventPage.getDownloadOptions());
    }

    public void e_ClickOnPDFPortraitOption(){
        /*To disable pop-up blocker*/
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("disable-popup-blocking");

    }

    public void v_DownloadedPDFPortrait(){
//        String parentWindow = BrowserInitHelper.getInstance().getWindowHandle();
//        DriverHelper.clickXpath(manageScoringEventPage.getPdfPortraitOption());
//        DriverHelper.waitUntilLoaderInvisible();
//        DriverHelper.waitForPageLoadComplete();
//        DriverHelper.waitTill(1);
//        Set<String> allTabs = BrowserInitHelper.getInstance().getWindowHandles();
//        for (String child : allTabs) {
//            if (!parentWindow.equalsIgnoreCase(child)) {
//                BrowserInitHelper.getInstance().switchTo().window(child);
//
//                /*Getting the URL*/
//                String browserUrl = BrowserInitHelper.getInstance().getCurrentUrl();
//
//                /*Verifying URL contains .pdf*/
//                if (browserUrl.contains(".pdf")){
//                    ConsoleLogger.SuccessLog("URl contains .pdf");
//                }
//                BrowserInitHelper.getInstance().close();
//            }
//        }
//        BrowserInitHelper.getInstance().switchTo().window(parentWindow);
    }

    public void e_ClickOnPDFLandScapeOption(){
        //DriverHelper.clickXpath(manageScoringEventPage.getDownloadIcon());
    }

    public void v_DownloadedPDF(){
//        String parentWindow = BrowserInitHelper.getInstance().getWindowHandle();
//        DriverHelper.clickXpath(manageScoringEventPage.getPdfLandscape());
//        DriverHelper.waitUntilLoaderInvisible();
//        DriverHelper.waitForPageLoadComplete();
//        DriverHelper.waitTill(1);
//        Set<String> allTabs = BrowserInitHelper.getInstance().getWindowHandles();
//        for (String child : allTabs) {
//            if (!parentWindow.equalsIgnoreCase(child)) {
//                BrowserInitHelper.getInstance().switchTo().window(child);
//
//                /*Getting the URL*/
//                String browserUrl = BrowserInitHelper.getInstance().getCurrentUrl();
//
//                /*Verifying URL contains .pdf*/
//                if (browserUrl.contains(".pdf")){
//                    ConsoleLogger.SuccessLog("URl contains .pdf");
//                }
//                BrowserInitHelper.getInstance().close();
//            }
//        }
//        BrowserInitHelper.getInstance().switchTo().window(parentWindow);
    }

    public void e_CreateScoringEvent(){
        /*Clicking Create Scoring Event*/
        DriverHelper.clickXpath(manageScoringEventPage.getCreateScoringEvent());
        DriverHelper.waitUntilLoaderInvisible();
    }

    public void v_NewScoringEvent(){
        /*Verifying New Scoring Event page header*/
        DriverHelper.checkElementDisplayByXpath(manageScoringEventPage.getPageHeader(), "New scoring Event page");
    }
}
