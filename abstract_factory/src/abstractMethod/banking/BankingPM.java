package abstractMethod.banking;

import abstractMethod.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void menageProject() {
        System.out.println("Banking PM manages banking project... ");
    }
}
