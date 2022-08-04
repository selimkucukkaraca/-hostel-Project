package entity;

public class Rooms {
    private String floor;
    private String numberOfPeople;
    private String balcony;
    private String gender;

    public Rooms(String floor, String numberOfPeople, String balcony, String gender) {
        this.floor = floor;
        this.numberOfPeople = numberOfPeople;
        this.balcony = balcony;
        this.gender = gender;
    }
    public Rooms(){

    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(String numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getBalcony() {
        return balcony;
    }

    public void setBalcony(String balcony) {
        this.balcony = balcony;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Rooms = \n" +
                "floor = " + floor +
                ", numberOfPeople = " + numberOfPeople+
                ", balcony = " + balcony+
                ", gender = '" +gender+ "' " + "\n";
    }
}
