package abstractMethod.website;

import abstractMethod.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website code...");
    }
}
