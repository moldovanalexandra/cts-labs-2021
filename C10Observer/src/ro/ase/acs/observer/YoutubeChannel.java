package ro.ase.acs.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel extends Observable {
    private String channelName;
    private List<String> videos = new ArrayList<>();

    public YoutubeChannel(String channelName){
        this.channelName = channelName;
    }

    public String getChannelName(){
        return this.channelName;
    }

    public void addVideo(String name){
        videos.add(name);
        notificationToAll(name);
    }
}
