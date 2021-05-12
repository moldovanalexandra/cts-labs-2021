package ro.ase.acs.observer;

public class ChannelSubscriber implements Observer {
    @Override
    public void notification(String name) {
        System.out.println("New video uploaded" + name);
    }
}
