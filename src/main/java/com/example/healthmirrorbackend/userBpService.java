package com.example.healthmirrorbackend;



public class userBpService {
    private BpRecord result1;//instance variable to store the BpRecord pojo objects [bpRecord = pojo class reference object]
    
    
    
     

    public userBpService(BpRecord result1 ) {
        this.result1 = result1; // Initialize the BpRecord with the appropriate parameters
         // Initialize the UserbpClassifier with the appropriate parameters
        
    }
    UserbpClassifier userbpClassifier = new UserbpClassifier();
    BpwarningClassifier bpwarningClassifier = new BpwarningClassifier();
    

    public String BpReport() {
        
        //UserbpClassifier userbpClassifier = new UserbpClassifier( bpRule .getStage(), bpRule.getSystolicmin(), bpRule.getDiastolicmin());
        int systolicVar = result1.getSystolic();
        int diastolicVar = result1.getDiastolic();
        int ageVar = result1.getAge();
        
        String userBpstage = userbpClassifier.classifyBp(systolicVar, diastolicVar);
        String bpmeassage = bpwarningClassifier.classifyWarning(ageVar , userBpstage);

        return   userBpstage + ":" + " " + bpmeassage;
        
        
        
        
        
               
    //test session: complete 

   
        
        
    

        

        
    

    



    

    
}
}