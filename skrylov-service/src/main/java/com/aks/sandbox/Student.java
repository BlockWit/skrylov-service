package com.aks.sandbox;

public class Student {

    private int experience;

    public Student(int experience) {
        this.experience = experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public int getExperience(){
        return experience;
    }
    public void train(Task task) {
        experience = experience + task.solve();
    }
}
