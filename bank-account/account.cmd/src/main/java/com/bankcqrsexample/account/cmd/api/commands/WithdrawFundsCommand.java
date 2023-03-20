package com.bankcqrsexample.account.cmd.api.commands;

import com.bankcqrsexample.cqrs.core.commands.BaseCommand;
import lombok.Data;

@Data
public class WithdrawFundsCommand extends BaseCommand {
    private double amount;
}
