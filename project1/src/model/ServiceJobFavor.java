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
}
