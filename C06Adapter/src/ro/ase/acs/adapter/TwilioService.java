package ro.ase.acs.adapter;

public class TwilioService implements SmsSender{

    @Override
    public void sendSMS(long phoneNumber, String message) {
        System.out.println(String.format("Sending message %s to %d", message, phoneNumber));
    }
}
