package abstractMethod.orders;

import abstractMethod.Developer;
import abstractMethod.ProjectManager;
import abstractMethod.ProjectTeamFactory;
import abstractMethod.Tester;
import abstractMethod.website.WebsiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory websiteTeamFactory = new WebsiteTeamFactory();
        Developer phpDev = websiteTeamFactory.getDeveloper();
        Tester manualTester = websiteTeamFactory.getTester();
        ProjectManager websitePM = websiteTeamFactory.getProjectManager();

        phpDev.writeCode();
        manualTester.testCode();
        websitePM.menageProject();
    }

}
