package sitteBilder;

public class VisitCardWebsiteBuilder  extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("Visit");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(500);
    }
}
