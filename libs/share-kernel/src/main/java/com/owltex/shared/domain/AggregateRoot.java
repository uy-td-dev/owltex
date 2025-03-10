package com.owltex.shared.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;
@Getter
@SuperBuilder
@NoArgsConstructor
public abstract class AggregateRoot extends BaseEntity{
    private final List<DomainEvent> domainEvents = new ArrayList<>();
    protected void addDomainEvent(DomainEvent event){
        domainEvents.add(event);
    }
}
