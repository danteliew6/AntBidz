package AntbidzTeam3.AntBidz.model;

public class Bidder {
    private String name;
    private String address;
    private String company;
    private int funds;

    public Bidder() {
    }

    public Bidder(String name, String address, String company) {
        this.name = name;
        this.address = address;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getFunds() {
        return funds;
    }

    public void setFunds(int funds) {
        this.funds = funds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bidder bidder = (Bidder) o;

        return name != null ? name.equals(bidder.name) : bidder.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Bidder{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", company='" + company + '\'' +
                ", funds=" + funds +
                '}';
    }
}
