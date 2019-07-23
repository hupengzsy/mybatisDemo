package com.hand.hp23854.mapper;

import com.hand.hp23854.domain.OrderLineQueryContition;
import com.hand.hp23854.domain.OrderLineQueryResult;

import java.util.List;

public interface OrderLineMapper {

    List<OrderLineQueryResult> selectOrderLinesByCondition(OrderLineQueryContition condition);
}
