package com.bankcqrsexample.cqrs.core.handlers;

import com.bankcqrsexample.cqrs.core.domain.AggregateRoot;

public interface EventSourcingHandler<T> {
    void save(AggregateRoot aggregate);
    T getById(String id);
}
