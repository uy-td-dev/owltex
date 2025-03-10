package com.owltex.shared.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Getter
@SuperBuilder
@NoArgsConstructor()
public abstract class BaseEntity {
    protected UUID id = UUID.randomUUID();
}
