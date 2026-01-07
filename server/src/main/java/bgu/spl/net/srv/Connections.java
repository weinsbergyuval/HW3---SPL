package bgu.spl.net.srv;

import java.io.IOException;

public interface Connections<T> {

    boolean send(int connectionId, T msg); //YA sending msg to client with connectionId

    void send(String channel, T msg);// YA sending msg to all clients subscribed to channel

    void disconnect(int connectionId);// YA disconnect client with connectionId
}
