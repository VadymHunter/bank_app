package abstractMethod.banking;

import abstractMethod.Developer;
import abstractMethod.ProjectManager;
import abstractMethod.ProjectTeamFactory;
import abstractMethod.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper(){
        return new JavaDeveloper();
    }
    @Override
    public Tester getTester(){
        return new QATester();
    }
    @Override
    public ProjectManager getProjectManager(){
        return new BankingPM();
    }
}
