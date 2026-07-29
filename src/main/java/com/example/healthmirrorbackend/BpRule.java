package com.example.healthmirrorbackend;

public class BpRule {
    private String stage;
    private int systolicmin;
    private int diastolicmin;

    public BpRule(String stage, int systolicmin, int diastolicmin) {
        this.stage = stage;
        this.systolicmin = systolicmin;
        this.diastolicmin = diastolicmin;
    }

    

     
    
    public boolean bpCalculationRule(int systolicVar, int diastolicVar) {
       return systolicVar  >= systolicmin || diastolicVar >= diastolicmin;
    }

    public String getStage() {
        return stage;
    }
    

    
}
    

