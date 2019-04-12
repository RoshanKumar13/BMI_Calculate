package com.example.bmi_roshankumarshah;

public class BMI_Act {

    private double height, weight;

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

    public double BMI(){
        double ht = height/100;
        double result = weight/(ht*ht);
        return result;
    }
}
