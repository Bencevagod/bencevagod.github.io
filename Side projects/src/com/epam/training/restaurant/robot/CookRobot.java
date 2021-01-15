package com.epam.training.restaurant.robot;

import com.epam.training.restaurant.domain.Client;
import com.epam.training.restaurant.domain.Order;

import java.util.ArrayDeque;
import java.util.Queue;

public class CookRobot {

    private final Queue<Order> orders = new ArrayDeque<>();

    public void addOrder(Client client, Order order) {
        System.out.println("CookRobot: Order registered, client: " + client.toString() + ", order: " + order.toString() + ".");
        orders.add(order);
    }

    public void processOrders() {
        orders.poll();
    }
}
