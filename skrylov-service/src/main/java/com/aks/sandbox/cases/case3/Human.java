package com.aks.sandbox.cases.case3;

public class Human {

    private String gender;

    private int brainVolume;

    public Human(String gender, int brainVolume) {
        this.gender = gender;
        this.brainVolume = brainVolume;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setBrainVolume(int brainVolume) {
        this.brainVolume = brainVolume;
    }

    public int getBrainVolume() {
        return brainVolume;
    }

    public Human fuck(Human mother) {
        if (gender == "man" && mother.gender == "female") {
            Human baby = new Human(gender, brainVolume);
            brainVolume = (brainVolume + mother.brainVolume) / 2;
            baby.setBrainVolume(brainVolume);
            return baby;
        } else {
            System.out.println("Так дети не получатся");
            return null;
        }

    }

}
