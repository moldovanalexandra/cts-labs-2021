package ro.ase.acs.adapter;

public class SmsToWhatAppClassAdapter implements SmsSender, WhatsappSender{
    @Override
    public void sendSMS(long phoneNumber, String message) {
        String friendName = "George";
        sendMessage(message, message);
    }

    @Override
    public void sendMessage(String message, String friendName) {
        System.out.println(String.format("Sending message %s to %s", message, friendName));
    }
}
