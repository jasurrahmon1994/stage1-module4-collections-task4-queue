package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public static void main(String[] args) {
        new DishOrderDeterminer().determineDishOrder(10, 3);
    }

    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> res = new ArrayList<>();
        List<Integer> dishes = new ArrayList<>();
        for (int i = 0; i < numberOfDishes; i++) {
            dishes.add(i + 1);
        }
        int index = everyDishNumberToEat - 1;
        List<Integer> temp = new ArrayList<>(dishes);
        while (res.size() < numberOfDishes) {
            if(res.size() == numberOfDishes - 1){
                res.addAll(temp);
                return res;
            }
            temp.remove(dishes.get(index));
            res.add(dishes.get(index));
            if (index + everyDishNumberToEat >= dishes.size()) {
                dishes.addAll(temp);
            }
            index += everyDishNumberToEat;

        }
        return res;
    }
}
