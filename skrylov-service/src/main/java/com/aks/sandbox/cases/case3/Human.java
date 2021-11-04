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

    public Human fuck(Human human1, Human human2) {
        if (human1.gender = "man", human2.gender = "female") {
            Human human3 = new Human(gender, brainVolume);
            brainVolume = (human1.brainVolume + human2.brainVolume) / 2;
            human3.setBrainVolume(brainVolume);
            return human3;
        } else{
            System.out.println("Так дети не получатся");
        }
    }

}
