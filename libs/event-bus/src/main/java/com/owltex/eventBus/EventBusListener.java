package com.owltex.eventBus;

import com.owltex.eventBus.handler.EventBusHandler;

public interface EventBusListener {
     <T> void onEvent(EventBusHandler<T> event);
}
