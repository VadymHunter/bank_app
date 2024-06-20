package abstractMethod.website;

import abstractMethod.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void menageProject() {
        System.out.println("Website project manager menages website");
    }
}
