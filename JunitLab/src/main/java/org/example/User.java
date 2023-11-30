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
        //make a list of foods
        food[] foods = new food[3];
        foods[0] = new food("Banana", "Calories: 95");
        foods[1] = new food("Apple", "Calories: 60");
        foods[2] = new food("Steak", "Calories: 110");

        //check if the foods are registered correctly
        MealPlan plan = new MealPlan(foods);

        assertEquals(foods, plan.getItems());
    }


    @Test
    public void testBudget(){
        Budgetting budget = new Budgetting();
        double amount = 50;
        budget.accessBudgetPlan();
        Boolean succesScenario = budget.setBudget(amount);

        //verifies the budget plan
        assertTrue(succesScenario);


    }

    @Test
    public void testUpdateProfile(){
        User profile = new User("Rayan", 25, 1.8,78,"Vegan");
        Account acc = new Account("rayan123", "password123");

        //logging in with username and password
        acc.login("rayan123", "password123");
        profile.updatePreferances("Atkins_diet");
        profile.setAge(27);

        //comment for thing
        assertEquals("Atkins_diet", profile.getPreferances());
        assertEquals(27, profile.getAge());

    }
    @Test
    public void testCalculator() {
        User Calculator = new User("Mohammad", 27, 1.75,61,"Default");

        // Test calculateBMI method
        Calculator.calculateBMI(Calculator.getWeight(),Calculator.getHeight());
        assertEquals(22.86, Calculator.getBmi(), 0.01); // we used delta for floating-point precision

        // Test calculateCalories method
        Calculator.calculateCalories(Calculator.getWeight(),Calculator.getHeight(), Calculator.getAge());
        assertEquals(1768.0, Calculator.getCalories(), 0.01); //same here
    }

}
