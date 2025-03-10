package com.owltex.shared.event;

import com.owltex.shared.domain.DomainEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.UUID;
@Getter
@SuperBuilder
@AllArgsConstructor
public class OrderCreatedEvent extends DomainEvent {
    private final UUID orderId;
}
