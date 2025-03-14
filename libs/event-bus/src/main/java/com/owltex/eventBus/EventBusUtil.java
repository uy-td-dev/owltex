package com.owltex.eventBus;

public interface EventBusUtil {
    void publish(String address, Object event);
    void send(String address, Object event);
    <T> T request(String address, Object event);
}
