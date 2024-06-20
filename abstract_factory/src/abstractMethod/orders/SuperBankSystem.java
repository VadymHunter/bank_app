package abstractMethod.orders;

import abstractMethod.Developer;
import abstractMethod.ProjectManager;
import abstractMethod.ProjectTeamFactory;
import abstractMethod.Tester;
import abstractMethod.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory bankFactory = new BankingTeamFactory();
        Developer javaDev = bankFactory.getDeveloper();
        Tester qaTester = bankFactory.getTester();
        ProjectManager bankingPM = bankFactory.getProjectManager();

        javaDev.writeCode();
        qaTester.testCode();
        bankingPM.menageProject();
    }
}
