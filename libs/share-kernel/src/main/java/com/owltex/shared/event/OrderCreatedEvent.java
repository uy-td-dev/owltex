package com.owltex.shared.event;

import com.owltex.shared.domain.DomainEvent;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@AllArgsConstructor
public class OrderCreatedEvent extends DomainEvent {
  private final UUID orderId;
}
