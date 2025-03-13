package com.owltex.shared.domain;

import java.time.Instant;
import java.util.UUID;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor
public abstract class DomainEvent {
  private final UUID eventId = UUID.randomUUID();
  private final Instant occurredOn = Instant.now();
}
