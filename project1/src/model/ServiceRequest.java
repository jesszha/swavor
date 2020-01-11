package model;

public abstract class ServiceRequest {
    protected ServiceCategory category;
    protected User postUser; // user that was posted
    protected String description;
    protected Location location;

    public ServiceRequest(ServiceCategory category, User postUser, String description, Location location) {
        this.category = category;
        this.postUser = postUser;
        this.description = description;
        this.location = location;
    }

    public ServiceCategory getServiceCategory() {
        return category;
    }

    public User getPostUser() {
        return postUser;
    }

    public String getDecsription() {
        return description;
    }

    public Location getLocation() {
        return location;
    }

    public void setCategory(ServiceCategory category) {
        this.category = category;
    }

    public void setPostUser(User postUser) {
        this.postUser = postUser;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}