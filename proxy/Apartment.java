package proxy;

public class Apartment {
    String location;
    int monthlyRentCost;
    public Apartment(String location,int monthlyRentCost)
    {
        this.location=location;
        this.monthlyRentCost=monthlyRentCost;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getMonthlyRentCost() {
        return monthlyRentCost;
    }

    public void setMonthlyRentCost(int monthlyRentCost) {
        this.monthlyRentCost = monthlyRentCost;
    }
}
