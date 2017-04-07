package com.hansight.cep;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;


public class OrderListener implements UpdateListener {
    private static int trigger = 0;
    @Override
    public void update(EventBean[] newEvents, EventBean[] oldEvents) {
        EventBean eb = newEvents[0];
        System.out.println("update" + trigger++);
    }
}