package abstractMethod;

import abstractMethod.Developer;
import abstractMethod.ProjectManager;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
