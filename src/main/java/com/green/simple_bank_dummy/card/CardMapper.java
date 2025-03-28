package com.green.simple_bank_dummy.card;

import com.green.simple_bank_dummy.card.model.Card;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CardMapper {
    int save(Card card);
    int findMaxId();
}
