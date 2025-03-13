package com.owltex.shared.domain;

import java.util.UUID;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor()
public abstract class BaseEntity {
    protected UUID id = UUID.randomUUID();
}
