package sitteBilder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new VisitCardWebsiteBuilder());
        System.out.println(director.buildWebsite());
        director.setBuilder(new EnterpriseWebsiteBuilder());
        System.out.println(director.buildWebsite());

    }
}
