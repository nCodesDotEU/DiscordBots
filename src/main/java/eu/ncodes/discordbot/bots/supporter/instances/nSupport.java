package eu.ncodes.discordbot.bots.supporter.instances;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class nSupport {

    private long ownerId;
    private String ownerName;
    private int id;
    private String type;
    private LocalDateTime created;
    private HashMap<Long, String> members;
    private ArrayList<nMessage> messages;

    public nSupport(long ownerId, String ownerName, int id, String type){
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.id = id;
        this.type = type;
        this.created = LocalDateTime.now();
        this.members = new HashMap<Long, String>();
        this.members.put(ownerId, ownerName);
        this.messages = new ArrayList<nMessage>();
    }

    public long getOwnerId(){return this.ownerId;}
    public String getOwnerName(){return this.ownerName;}
    public int getId(){return this.id;}
    public String getType(){return this.type;}
    public LocalDateTime getCreated(){return this.created;}
    public HashMap<Long,String> getMembers(){return this.members;}
    public ArrayList<nMessage> getMessages(){return this.messages;}
    public boolean isMemberInSupport(Long id){
        return this.members.containsKey(id);
    }
    public boolean isMemberInSupport(String name){
        return this.members.containsValue(name);
    }

    public void addMessage(nMessage message){
        this.messages.add(message);
    }

}
