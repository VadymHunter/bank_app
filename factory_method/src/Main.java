public class Main {
    public static void main(String[] args) {

//        DeveloperFactory developerFactory = createDeveloperBySpecialty("java");
//        DeveloperFactory developerFactory = createDeveloperBySpecialty("c++");
        DeveloperFactory developerFactory = createDeveloperBySpecialty("php");
        Developer javaDeveloper = developerFactory.createdDeveloper();

        javaDeveloper.writeCode();

    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java"))
            return new JavaDeveloperFactory();
        else if (specialty.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        }
        else if (specialty.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else
            throw new RuntimeException(specialty + " is unknown specialty");
    }
}