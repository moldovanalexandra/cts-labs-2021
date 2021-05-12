package ro.ase.acs.adapter;

public class SmsToWhatsAppObjectAdapter implements SmsSender{
    private WhatsappService service;

    public SmsToWhatsAppObjectAdapter(WhatsappService service){
        this.service = service;
    }

    @Override
    public void sendSMS(long phoneNumber, String message) {
        String friendName = "John"; // getFriendNameByPhoneNumber(phoneNumber);
        service.sendMessage(message,friendName);
    }
}
