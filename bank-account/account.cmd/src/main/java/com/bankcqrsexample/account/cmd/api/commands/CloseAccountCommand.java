package com.bankcqrsexample.account.cmd.api.commands;

import com.bankcqrsexample.cqrs.core.commands.BaseCommand;

public class CloseAccountCommand extends BaseCommand {
    public CloseAccountCommand(String id) {
        super(id);
    }
}

