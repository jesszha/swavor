package model;

public class ServiceJobExchange implements ServiceJob {
    protected ServiceRequest sr1;
    protected ServiceRequest sr2;
    protected User u1; //user that made (posted) the request
    protected User u2; //user that traded a service

    public ServiceJobExchange(ServiceRequest sr1, ServiceRequest sr2, User u1, User u2) {
        this.sr1 = sr1;
        this.sr2 = sr2;
        this.u1 = u1;
        this.u2 = u2;
    }

    public User getUser1() {
        return u1;
    }

    public User getUser2() {
        return u2;
    }

    public ServiceRequest getServiceRequest1() {
        return sr1;
    }

    public ServiceRequest getServiceRequest2() {
        return sr2;
    }

    public void setUser1(User u1) {
        this.u1 = u1;
    }

    public void setUser2(User u2) {
        this.u2 = u2;
    }

    public void setServiceRequest1(ServiceRequest sr1) {
        this.sr1 = sr1;
    }

    public void setServiceRequest2(ServiceRequest sr2) {
        this.sr2 = sr2;
    }

}
