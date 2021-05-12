package ro.ase.acs.main;

import ro.ase.acs.observer.ChannelSubscriber;
import ro.ase.acs.observer.YoutubeChannel;

public class Main {

    public static void main(String[] args) {
	// write your code here
        YoutubeChannel ytChannel = new YoutubeChannel("Casey Neistat");
        ChannelSubscriber subscriber1 = new ChannelSubscriber();
        ChannelSubscriber subscriber2 = new ChannelSubscriber();

        ytChannel.subscribe(subscriber1);
        ytChannel.subscribe(subscriber2);

        ytChannel.addVideo("The story of my life");
    }
}
