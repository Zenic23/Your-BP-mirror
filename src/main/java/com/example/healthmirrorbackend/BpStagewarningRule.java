package com.example.healthmirrorbackend;

public class BpStagewarningRule {

    
    private int minAge;
    private int maxAge;
    private String BPstage;
    
    private String message;
   


public BpStagewarningRule( int minAge, int maxAge, String BPstage,  String message) {
    this.minAge = minAge;
    this.maxAge = maxAge;
    this.BPstage = BPstage;
    
    this.message = message;
    
}

public boolean warningRule( int ageVar) {

    return ageVar >= minAge && ageVar <= maxAge;
    
    
    




}

public boolean stageWarningRule( String userBpstage) {
    return  BPstage.equals("Normal") || BPstage.equals(userBpstage);
    
}

public String getMessage() {
    return message;
}





    
}
