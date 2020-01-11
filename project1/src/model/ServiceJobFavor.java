package model;

public class ServiceJobFavor implements ServiceJob {
    private ServiceRequest sr;
    private User u1; // User receiving the service (aka posted the service request)
    private User u2; // User that performed the service

    public ServiceJobFavor(ServiceRequest sr, User u1, User u2) {
        this.sr = sr;
        this.u1 = u1;
        this.u2 = u2;
    }

    public User getUser1() {
        return u1;
    }

    public User getUser2() {
        return u2;
    }

    public ServiceRequest getServiceRequest() {
        return sr;
    }

    public void setUser1(User u1) {
        this.u1 = u1;
    }

    public void setUser2(User u2) {
        this.u2 = u2;
    }

    public void setServiceRequest(ServiceRequest sr) {
        this.sr = sr;
    }

}