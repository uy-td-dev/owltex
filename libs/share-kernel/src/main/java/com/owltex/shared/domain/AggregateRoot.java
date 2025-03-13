package com.owltex.shared.domain;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor
public abstract class AggregateRoot extends BaseEntity{
    private final List<DomainEvent> domainEvents = new ArrayList<>();
    protected void addDomainEvent(DomainEvent event){
        domainEvents.add(event);
    }
}
