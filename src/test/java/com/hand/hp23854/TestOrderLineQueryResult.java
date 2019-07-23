package com.hand.hp23854;

import com.hand.hp23854.domain.OrderLineQueryContition;
import com.hand.hp23854.domain.OrderLineQueryResult;
import com.hand.hp23854.mapper.OrderLineMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
//String orderNumber, Integer orderLineNumber, String itemCode, String itemName, String createdBy, Integer userId)
public class TestOrderLineQueryResult {
    @Test
    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderLineMapper orderLineMapper = ac.getBean(OrderLineMapper.class);

        OrderLineQueryContition olqc= new OrderLineQueryContition("SO190716000001",10,"490000","卫龙亲嘴",1L,2L);
        List<OrderLineQueryResult> list = orderLineMapper.selectOrderLinesByCondition(olqc);
        for(OrderLineQueryResult o :list){
            System.out.println(o);
        }
    }
}
