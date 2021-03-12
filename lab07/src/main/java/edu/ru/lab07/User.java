package edu.ru.lab07;

public class User {

    private String name;
    private String location;
    private boolean locationSet;
    

    public User(String name, String location) {
        this.name = name;
        this.location = location;
        this.locationSet = true;
        
    }

    public User(String name) {
        this.name = name;
        this.location = "No location set";
        this.locationSet = false;
        
    }

    public boolean isLocationSet() {
        return locationSet;
    }

    public void setLocationSet(boolean locationSet) {
        this.locationSet = locationSet;
    }

    public Tweet tweet(String text) {
        Tweet newTweet = new Tweet(text, this);
        return newTweet;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
