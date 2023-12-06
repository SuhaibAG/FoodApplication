package org.example;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class Main {
    public static void main(String[] args) {


    }


    public MealPlan GenerateMealPlan() {
        //make a list of foods
        Scanner input = new Scanner(System.in);
        System.out.println("enter how many foods you want to insert in your meal plan");
        int amount = input.nextInt();
        food[] foods = new food[amount];
        for (int i = 0; i < amount; i++) {
            String name = input.next();
            String nutrition = input.next();
            foods[i] = new food(name, nutrition);

        }
        //check if the foods are registered correctly
        MealPlan plan = new MealPlan(foods);
        return plan;
    }

    public void UpdateProfile(User profile, String diet, int age, int weight){

        profile.updatePreferances(diet);
        profile.setAge(age);
        profile.setWeight(weight);

    }

}