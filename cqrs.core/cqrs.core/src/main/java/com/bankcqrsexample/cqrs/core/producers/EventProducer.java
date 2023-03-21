package com.bankcqrsexample.cqrs.core.producers;

import com.bankcqrsexample.cqrs.core.events.BaseEvent;

public interface EventProducer {
    void produce(String topic, BaseEvent event);
}
