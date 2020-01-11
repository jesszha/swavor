package model;

public abstract class ServiceRequest {
    protected ServiceCategory category;
    protected User postUser; // user that was posted
    protected String description;
    protected Location location;

}
