package com.owltex.eventBus.handler;
@FunctionalInterface
public interface EventBusHandler <T>{
    void handle(T event);
}
