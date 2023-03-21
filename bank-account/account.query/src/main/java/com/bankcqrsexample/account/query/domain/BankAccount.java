package com.bankcqrsexample.account.query.domain;

import com.bankcqrsexample.account.common.dto.AccountType;
import com.bankcqrsexample.cqrs.core.domain.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BankAccount extends BaseEntity {

    @Id
    private String id;

    private String accountHolder;
    private Date creationDate;
    private AccountType accountType;
    private double balance;
}
