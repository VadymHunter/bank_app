package abstractMethod.banking;

import abstractMethod.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("java developer write code...");
    }
}
