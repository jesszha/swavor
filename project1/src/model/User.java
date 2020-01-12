package model;

import exceptions.TooManyFavorsException;

import java.util.Set;

public class User {
    private int MAX_FAVORS = 2;

    private String name;
    private String username;
    private String about;
    private Set<ServiceCategory> skillCategories;
    private double avgRating; //out of 10
    private int numberOfRatings;
    //private Set<User> friends;
    //private Set<User> favor;

    public User(String name, String username) {
        this.name = name;
        this.username = username;
        this.avgRating = 0.00;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getAbout() {
        return this.about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Note this needs to be called to set ranking from database
    public void setAvgRating(double avgRating) {
        this.avgRating = avgRating;
    }

    public void addSkillCategory(ServiceCategory skill) {
        skillCategories.add(skill);
    }

    /*public void addFriend(User friend) {
        this.friends.add(friend);
    }

    //public void addFavor(User owe) throws TooManyFavorsException {
    //    if (this.favor.size() >= MAX_FAVORS) throw new TooManyFavorsException("You owe too many favors.");favor.add(owe);
    //}*/

    //TODO: update ranking
    public void updateAvgRating(double rating) {

    }

}
