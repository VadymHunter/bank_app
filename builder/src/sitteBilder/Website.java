package sitteBilder;

public class Website {
    private String name;
    private Cms cms;
    private int price;

    public Cms getCms() {
        return cms;
    }

    public void setCms(Cms cms) {
        this.cms = cms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Website{" +
               "name='" + name + '\'' +
               ", cms=" + cms +
               ", price=" + price +
               '}';
    }
}
