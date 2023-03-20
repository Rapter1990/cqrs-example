package com.bankcqrsexample.account.cmd.api.commands;

import com.bankcqrsexample.account.common.dto.AccountType;
import com.bankcqrsexample.cqrs.core.commands.BaseCommand;
import lombok.Data;

@Data
public class OpenAccountCommand extends BaseCommand {
    private String accountHolder;
    private AccountType accountType;
    private double openingBalance;
}
