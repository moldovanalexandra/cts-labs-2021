package ro.ase.acs.adapter;

public interface SmsSender {
    public void sendSMS(long phoneNumber, String message);
}
