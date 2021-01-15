package com.epam.training.restaurant.domain;


public class Chips implements Food {

    @Override
    public double calculateHappiness(Client client) {
        // if food had an extras list, or could see the order's extras list, i could return only the increment, and double it in ketchup
//        if (extras != null) {
//            return client.getHappiness() * 0.05;
//        }
        return client.getHappiness() * 0.05;
    }


}
