package org.example;

public class MealPlan {
    private food[] items;
    private String preferances;

    public MealPlan(food[] items) {
        this.items = items;
    }

    public MealPlan(String preferances) {
        this.preferances = preferances;
    }

    public food[] getItems() {
        return items;
    }
}
