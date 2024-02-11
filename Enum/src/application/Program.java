package application;

import java.util.Date;

import entities.Order;
import entitiesEnum.OrderStatus;

public class Program {
    public static void main(String[] args) throws Exception {
        
        Order ord = new Order(1080, new Date(), OrderStatus.PEDING_PAYMENT);

        System.out.println(ord);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
