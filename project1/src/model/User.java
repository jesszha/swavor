package model;

import exceptions.TooManyFavorsException;

import java.util.Set;

public class User {
    private int MAX_FAVORS = 2;

    private String name;
    private String username;
    private String about;
    private Set<ServiceCategory> skillCategories;
    //private Set<User> friends;
    //private Set<User> favor;

    public User(String name, String username) {
        this.name = name;
        this.username = username;
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

    public void addSkillCategory(ServiceCategory skill) {
        skillCategories.add(skill);
    }

    /*public void addFriend(User friend) {
        this.friends.add(friend);
    }

    //public void addFavor(User owe) throws TooManyFavorsException {
    //    if (this.favor.size() >= MAX_FAVORS) throw new TooManyFavorsException("You owe too many favors.");favor.add(owe);
    //}*/
}
