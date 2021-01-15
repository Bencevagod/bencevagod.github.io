package com.epam.training.restaurant;

import com.epam.training.restaurant.domain.Chips;
import com.epam.training.restaurant.domain.Client;
import com.epam.training.restaurant.domain.Ketchup;
import com.epam.training.restaurant.domain.Order;
import com.epam.training.restaurant.factory.FoodFactory;
import com.epam.training.restaurant.robot.CookRobot;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Order order = new Order("Hotdog",
                new ArrayList<>(Arrays.asList("mustard", "ketchup")),
                new Client("Sanya", 100));
        CookRobot robot = new CookRobot();
        robot.addOrder(order.getClient(), order);
        FoodFactory.createFood(order);
        System.out.println(new Ketchup(new Chips()));
    }
}
