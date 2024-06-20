package abstractMethod.website;

import abstractMethod.Developer;
import abstractMethod.ProjectManager;
import abstractMethod.ProjectTeamFactory;
import abstractMethod.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper(){
        return new PhpDeveloper();
    }
    @Override
    public Tester getTester(){
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }

}
