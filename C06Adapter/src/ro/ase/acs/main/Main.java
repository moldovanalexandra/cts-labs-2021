package ro.ase.acs.main;

import ro.ase.acs.adapter.*;

public class Main {

    public static void main(String[] args) {
        SmsSender sender = new TwilioService();
        sender.sendSMS(0743123123, "hello");

        sender = new SmsToWhatsAppObjectAdapter(new WhatsappService());
        sender.sendSMS(0743123123, "hello");

        sender = new SmsToWhatAppClassAdapter();
        sender.sendSMS(723234235, "hello 3");

    }
}
