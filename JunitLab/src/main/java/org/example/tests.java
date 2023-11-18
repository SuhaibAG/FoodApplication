package org.example;
import org.junit.*;

import static org.junit.Assert.*;


public class tests {

    @Test
    public void testNutritionalInformationDisplay() {
        // Assuming you have a class named NutritionalInformationDisplay
        food plan = new food();

        // Test data
        String foodItem = "Banana";
        String expectedNutritionalInfo = "Calories: 105, Carbs: 27g, Protein: 1.3g, Fat: 0.3g, Vitamins: A, B6, C";

        // Set up the application with known data
        plan.setData(foodItem, expectedNutritionalInfo);

        // Verify the displayed nutritional information matches the expected data
        assertEquals(expectedNutritionalInfo, plan.getNutritionalInfo());
    }

    @Test
    public void testMealPlanGeneration() {
        //make a list of fooods
        food[] foods = new food[3];
        foods[0] = new food("Banana", "Calories: 105");
        foods[1] = new food("Apple", "Calories: 110");
        foods[2] = new food("Steak", "Calories: 110");

        //check if the foods are registered correctly
        MealPlan plan = new MealPlan(foods);

        assertEquals(foods, plan.getItems());
    }



}

