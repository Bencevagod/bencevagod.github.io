package com.epam.training.restaurant.factory;

import com.epam.training.restaurant.domain.*;

import java.util.List;

public class FoodFactory {

    private static final String HOTDOG = "HOTDOG";
    private static final String CHIPS = "CHIPS";
    private static final String MUSTARD = "MUSTARD";
    private static final String KETCHUP = "KETCHUP";

    public static Food createFood(Order order) {
        Food food = createMainFood(order.getFood());
//        Food extra = addExtras(food, order.getExtras());
        Food extra = extra(food);
        System.out.println("FoodFactory: preparing food " + food + "\n******\n" + extra);
        return food;
    }

    private static Food createMainFood(String food) {
        switch (food) {
            case HOTDOG -> {return new HotDog();}
            case CHIPS -> {return new Chips();}
        }
        return null;
    }

    private static Food addExtras(Food food, List<String> extras) {
//        for (String str : extras) {
            switch (extras.get(1)) {
                case MUSTARD -> {return new Mustard(food);}
                case KETCHUP -> {return new Ketchup(food);}
//            }
        }
        return new Chips();
    }

    private static Food extra(Food food) {
        return new Ketchup(food);
    }

//    private static FoodExtraDecorator createExtra(String extra, Food food) {
//        String orderedExtra = extra.toUpperCase();
//        switch (orderedExtra) {
//            case MUSTARD -> new Mustard(food);
//            case KETCHUP -> new Ketchup(food);
//        }
//        return null;
//    }
}
