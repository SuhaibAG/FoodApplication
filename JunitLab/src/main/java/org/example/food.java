package org.example;

public class food {
    private String name;
    private String nutritionalInfo;

    public food(String name, String nutritionalInfo) {
        this.name = name;
        this.nutritionalInfo = nutritionalInfo;
    }


    public void setData(String name, String nutritionalInfo){
        this.name = name;
        this.nutritionalInfo = nutritionalInfo;

    }

    public food() {
    }

    public String getNutritionalInfo() {
        return nutritionalInfo;
    }
}
