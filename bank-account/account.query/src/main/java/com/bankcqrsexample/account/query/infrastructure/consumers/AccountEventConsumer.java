package com.bankcqrsexample.account.query.infrastructure.consumers;

import com.bankcqrsexample.account.common.events.AccountClosedEvent;
import com.bankcqrsexample.account.common.events.AccountOpenedEvent;
import com.bankcqrsexample.account.common.events.FundsDepositedEvent;
import com.bankcqrsexample.account.common.events.FundsWithdrawnEvent;
import com.bankcqrsexample.account.query.api.controllers.AccountLookupController;
import com.bankcqrsexample.account.query.infrastructure.handlers.EventHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

import java.util.logging.Level;
import java.util.logging.Logger;

@Service
@RequiredArgsConstructor
public class AccountEventConsumer implements EventConsumer {

    private final Logger logger = Logger.getLogger(AccountLookupController.class.getName());

    private final EventHandler eventHandler;

    @KafkaListener(topics = "AccountOpenedEvent", groupId = "${spring.kafka.consumer.group-id}")
    @Override
    public void consume(AccountOpenedEvent event, Acknowledgment ack) {

        logger.log(Level.INFO, "AccountEventConsumer is working with AccountOpenedEvent");

        this.eventHandler.on(event);
        ack.acknowledge();
    }

    @KafkaListener(topics = "FundsDepositedEvent", groupId = "${spring.kafka.consumer.group-id}")
    @Override
    public void consume(FundsDepositedEvent event, Acknowledgment ack) {

        logger.log(Level.INFO, "AccountEventConsumer is working with FundsDepositedEvent");

        this.eventHandler.on(event);
        ack.acknowledge();
    }

    @KafkaListener(topics = "FundsWithdrawnEvent", groupId = "${spring.kafka.consumer.group-id}")
    @Override
    public void consume(FundsWithdrawnEvent event, Acknowledgment ack) {

        logger.log(Level.INFO, "AccountEventConsumer is working with FundsWithdrawnEvent");

        this.eventHandler.on(event);
        ack.acknowledge();
    }

    @KafkaListener(topics = "AccountClosedEvent", groupId = "${spring.kafka.consumer.group-id}")
    @Override
    public void consume(AccountClosedEvent event, Acknowledgment ack) {

        logger.log(Level.INFO, "AccountEventConsumer is working with AccountClosedEvent");

        this.eventHandler.on(event);
        ack.acknowledge();
    }
}
