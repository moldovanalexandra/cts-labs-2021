package ro.ase.acs.adapter;

public class WhatsappService implements WhatsappSender{

    @Override
    public void sendMessage(String message, String friendName) {
        System.out.println(String.format("Sending message %s to %s", message, friendName));
    }
}
