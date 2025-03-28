package com.green.simple_bank_dummy.card.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Card {
    private int cardId;
    private String cardNumber;
    private String expirationDate;
    private int customerId;
}
