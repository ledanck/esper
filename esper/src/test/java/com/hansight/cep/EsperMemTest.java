package com.hansight.cep;

import com.espertech.esper.client.Configuration;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.client.EPStatement;

import java.util.Random;


public class EsperMemTest {

    public static void main(String...args) throws Exception {
        Configuration config= new Configuration();

        EPServiceProvider epService = EPServiceProviderManager.getDefaultProvider(config);

        String expression = "SELECT price FROM OrderEvent(price > 10).win:ext_timed(occur_time, 1 minutes) group by price HAVING count(*)>=1";
        EPStatement statement = epService.getEPAdministrator().createEPL(expression);

        statement.addListener(new OrderListener());

        //for (int i = 0 ; i < ; i++){
        long i = 0;
        Random random = new Random();
        while (true){
            OrderEvent e = new OrderEvent(random.nextInt(10000), "Name"+i);
            i++;
            epService.getEPRuntime().sendEvent(e);
            Thread.sleep(0,1);
            //System.gc();
            if(i % 10000 == 0){
                System.out.println(System.currentTimeMillis() + ": "+i);
            }
        }
    }
}