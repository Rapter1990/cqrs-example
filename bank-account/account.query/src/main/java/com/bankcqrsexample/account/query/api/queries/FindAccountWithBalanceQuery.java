package com.bankcqrsexample.account.query.api.queries;

import com.bankcqrsexample.account.query.api.dto.EqualityType;
import com.bankcqrsexample.cqrs.core.queries.BaseQuery;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FindAccountWithBalanceQuery extends BaseQuery {
    private EqualityType equalityType;
    private double balance;
}
