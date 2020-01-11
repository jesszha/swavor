package model;

public class ServiceJobExchange implements ServiceJob{
    protected ServiceRequest sr1;
    protected ServiceRequest sr2;
    protected User u1;
    protected User u2;

    public ServiceJobExchange(ServiceRequest sr1, ServiceRequest sr2, User u1, User u2) {
        this.sr1 = sr1;
        this.sr2 = sr2;
        this.u1 = u1;
        this.u2 = u2;
    }
}
