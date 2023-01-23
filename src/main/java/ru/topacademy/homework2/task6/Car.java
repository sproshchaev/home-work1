package ru.topacademy.homework2.task6;

public class Car {
    private String Make;
    private String Model;
    private int RegistrationNum;

    public Car(String Make, String Model, String RegN) {
        Make = "";
        Model = "";
        RegN = "";
    }

    public String getMake() {
        return Make;
    }

    public String getModel() {
        return Model;
    }

    public boolean hire(String newHirer) {
        return true;
    }

    public boolean returnFromHire() {
        return false;
    }

    public int getRego() {
        RegistrationNum++;
        return RegistrationNum;
    }

    public boolean hireable() {
            return true;
    }

    public String toString() {
        return "Vehicle ID number: " + getRego() + "-" + "Make is: " + getMake() + "-" + "Model is: " + getModel();
    }


}


