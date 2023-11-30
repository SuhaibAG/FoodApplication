package org.example;

public class User {
    private String name;
    private int age;
    private String dieteryPreference;
    private double height;
    private double weight;


    public User(String name, int age,double height,double weight, String dieteryPreference) {
        this.name = name;
        this.age = age;
        this.dieteryPreference = dieteryPreference;
        //both the height and weight cm and kg.
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

    public void setDieteryPreference(String dieteryPreference) {
        this.dieteryPreference = dieteryPreference;
    }

    public void updatePreferances(String atkins_diet) {
    }

    public String getPreferances() {
        return getPreferances();
    }
}
