package com.example.healthmirrorbackend;

public class UserbpClassifier {
   
   
   


   

   private static final BpRule[] BP_RULES = {
      
      
      new BpRule("Hypertension Stage 2", 160, 100),
      new BpRule("Hypertension", 140, 90),
   };


   public String classifyBp( int systolicVar, int diastolicVar) {
      for (BpRule rule : BP_RULES){
         if(rule.bpCalculationRule(systolicVar, diastolicVar)){
            
            return rule.getStage();
         }

         
      }
       // Default if no rule matches
      return "Normal";
  
   }
   

   
}



   



    

    

    
        

    



    
