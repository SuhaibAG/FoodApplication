package org.example;

public class User {
    private String name;
    private int age;
    private String dieteryPreference;
    private double height;
    private double weight;
    private double bmi;
    private double calories;


    public User(String name, int age,double height,double weight, String dieteryPreference) {
        this.name = name;
        this.age = age;
        this.dieteryPreference = dieteryPreference;
        //both the height and weight m and kg.
        this.height = height;
        this.weight = weight;

    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDieteryPreference() {
        return dieteryPreference;
    }

    public void updatePreferances(String dieteryPreference) {
        this.dieteryPreference = dieteryPreference;
    }



    public String getPreferances() {
        return dieteryPreference;
    }

    // Function to calculate BMI and set the instance variable
    public void calculateBMI(double weight, double height) {
        bmi = weight / (height * height);
        setBmi(bmi);
    }

    public void calculateCalories(double weight, double height, int age) {
        // Using Mifflin-St Jeor(....no idea ;) )equation for Basal Metabolic Rate (BMR)
        double bmr = 10 * weight + 6.25 * height * 100 - 5 * age + 5;
        // Assuming a sedentary lifestyle, multiplying BMR by 1.2 to get total daily calories
        calories = bmr * 1.2;
        setCalories(calories);
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
}
