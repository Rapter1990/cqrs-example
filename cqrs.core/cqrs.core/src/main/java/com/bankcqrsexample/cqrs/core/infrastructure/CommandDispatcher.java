package com.bankcqrsexample.cqrs.core.infrastructure;

import com.bankcqrsexample.cqrs.core.commands.BaseCommand;
import com.bankcqrsexample.cqrs.core.commands.CommandHandlerMethod;

// Mediator
public interface CommandDispatcher {
    <T extends BaseCommand> void registerHandler(Class<T> type, CommandHandlerMethod<T> handler);
    void send(BaseCommand command);
}
