package com.example.healthmirrorbackend;

public class BpRecord {
    private int systolic;
    private int diastolic;
    private int age;

    public BpRecord(int systolic, int diastolic, int age) {
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.age = age;
    }
    // setters
    public void setSystolic(int systolic) {
        this.systolic = systolic;
    }

    public void setDiastolic(int diastolic) {
        this.diastolic = diastolic;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // getters
    public int getSystolic() {
        return systolic;
    }

    public int getDiastolic() {
        return diastolic;
    }

    public int getAge() {
        return age;
    }
}
