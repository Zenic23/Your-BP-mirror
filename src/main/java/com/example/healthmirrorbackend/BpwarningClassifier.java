package com.example.healthmirrorbackend;

public class BpwarningClassifier {
    
    private static final BpStagewarningRule[] BP_STAGEWARNING_RULES = {
       new BpStagewarningRule(1, 10, "Normal", "Normal BP for child. Continue routine well-child visits and healthy habits."),
       new BpStagewarningRule(11, 20, "Normal", "Normal BP for adolescent. Maintain healthy diet, exercise, and avoid tobacco/vaping."),
       new BpStagewarningRule(21, 30, "Normal", "Normal BP for young adult. Excellent baseline. Continue routine monitoring annually."),
       new BpStagewarningRule(31, 40, "Normal", "Normal BP for adult. Maintain healthy lifestyle; check annually."),
       new BpStagewarningRule(41, 50, "Normal", "Normal BP for middle-aged adult. Optimal cardiovascular health. Continue current habits."),
       new BpStagewarningRule(51, 60, "Normal", "Normal BP for older adult. Low cardiovascular risk. Keep monitoring regularly."),
       new BpStagewarningRule(61, 70, "Normal", "Normal BP for senior. Excellent control. Monitor for orthostatic changes."),
       new BpStagewarningRule(71, 80, "Normal", "Normal BP for elderly. Very good. Ensure medication review if on other drugs."),
       new BpStagewarningRule(81, 90, "Normal", "Normal BP for very elderly. Good perfusion status. Watch for frailty/symptoms."),
       new BpStagewarningRule(91, 100, "Normal", "Normal BP for centenarian. Remarkable vascular health. Focus on quality of life."),
    };
    private static final BpStagewarningRule[] BP_STAGEWARNING_RULES2 = {
        new BpStagewarningRule(1, 10, "Hypertension Stage 2", "Stage 2 Hypertension in child: **URGENT** referral to pediatric nephrology/cardiology needed."),
        new BpStagewarningRule(11, 20, "Hypertension Stage 2", "Stage 2 Hypertension in adolescent: Immediate workup for secondary causes (renal, endocrine, coarctation)."),
        new BpStagewarningRule(21, 30, "Hypertension Stage 2", "Stage 2 Hypertension in young adult: High CVD risk. **Rule out secondary causes**. Start lifestyle + medication per guidelines."),
        new BpStagewarningRule(31, 40, "Hypertension Stage 2", "Stage 2 Hypertension: High 10-year ASCVD risk. Initiate 2-drug combination therapy + lifestyle changes."),
        new BpStagewarningRule(41, 50, "Hypertension Stage 2", "Stage 2 Hypertension: Significant cardiovascular risk. Requires prompt pharmacotherapy and adherence counseling."),
        new BpStagewarningRule(51, 60, "Hypertension Stage 2", "Stage 2 Hypertension: Strong indication for combination therapy. Target <130/80. Monitor kidney function."),
        new BpStagewarningRule(61, 70, "Hypertension Stage 2", "Stage 2 Hypertension in older adult: Clear treatment benefit. Target <130/80 if tolerated. Watch for orthostasis."),
        new BpStagewarningRule(71, 80, "Hypertension Stage 2", "Stage 2 Hypertension in elderly: Start low, go slow. Assess frailty, fall risk, and medication interactions."),
        new BpStagewarningRule(81, 90, "Hypertension Stage 2", "Stage 2 Hypertension in very elderly: Individualize targets. Prioritize symptom control and fall prevention."),
        new BpStagewarningRule(91, 100, "Hypertension Stage 2", "Stage 2 Hypertension in centenarian: Focus on comfort, avoiding overtreatment and hypotension."),
    };
    private static final BpStagewarningRule[] BP_STAGEWARNING_RULES3 = {
        new BpStagewarningRule(1, 10, "Hypertension", "Stage 1 Hypertension in child: **Refer to specialist** for secondary cause evaluation immediately."),
        new BpStagewarningRule(11, 20, "Hypertension", "Stage 1 Hypertension in adolescent: Confirm with ABPM. Screen for secondary causes (renal, endocrine)."),
        new BpStagewarningRule(21, 30, "Hypertension", "Stage 1 Hypertension in young adult: **Rule out secondary causes**. Calculate ASCVD risk. Lifestyle + consider meds if risk high."),
        new BpStagewarningRule(31, 40, "Hypertension", "Stage 1 Hypertension: Elevated 10-year CVD risk. Aggressive lifestyle modification. Add meds if ASCVD risk >=10% or diabetes/CKD."),
        new BpStagewarningRule(41, 50, "Hypertension", "Stage 1 Hypertension: Lifestyle changes critical. Reassess in 3-6 months. Start meds if uncontrolled or high risk."),
        new BpStagewarningRule(51, 60, "Hypertension", "Stage 1 Hypertension: High lifetime risk. Initiate lifestyle + medication if ASCVD risk >=10%. Target <130/80."),
        new BpStagewarningRule(61, 70, "Hypertension", "Stage 1 Hypertension in older adult: Strong evidence for treatment benefit. Target <130/80. Monitor for side effects."),
        new BpStagewarningRule(71, 80, "Hypertension", "Stage 1 Hypertension in elderly: Treat to <130/80 if tolerated. Start low, go slow. Assess orthostatic BP."),
        new BpStagewarningRule(81, 90, "Hypertension", "Stage 1 Hypertension in very elderly: Individualize target. Balance CVD benefit vs fall/frailty risk."),
        new BpStagewarningRule(91, 100, "Hypertension", "Stage 1 Hypertension in centenarian: Conservative management. Focus on quality of life and symptom control."),
    };
    private static final BpStagewarningRule[] BP_STAGEWARNING_RULES4 = {
        new BpStagewarningRule(1, 10, "Elevated", "Elevated BP in child: **Confirm measurements**. Assess for obesity/renal/endocrine causes. Lifestyle intervention."),
        new BpStagewarningRule(11, 20, "Elevated", "Elevated BP in adolescent: Strong predictor of adult hypertension. Counsel on diet (low sodium), exercise, weight."),
        new BpStagewarningRule(21, 30, "Elevated", "Elevated BP in young adult: Early warning. High likelihood of progression. **Lifestyle modification is primary treatment.**"),
        new BpStagewarningRule(31, 40, "Elevated", "Elevated BP in adult: Pre-hypertensive range. Implement DASH diet, weight loss, sodium reduction, regular exercise."),
        new BpStagewarningRule(41, 50, "Elevated", "Elevated BP in middle-aged adult: Increased 10-year CVD risk. Aggressive lifestyle changes now prevent Stage 1."),
        new BpStagewarningRule(51, 60, "Elevated", "Elevated BP in older adult: Significant risk factor for progression. Home monitoring recommended. Lifestyle therapy."),
        new BpStagewarningRule(61, 70, "Elevated", "Elevated BP in senior: Monitor closely. Non-pharmacologic therapy (diet, exercise) is mainstay unless compelling indications."),
        new BpStagewarningRule(71, 80, "Elevated", "Elevated BP in elderly: Assess frailty and orthostasis. Lifestyle changes tailored to functional status."),
        new BpStagewarningRule(81, 90, "Elevated", "Elevated BP in very elderly: Individualize approach. Avoid overtreatment. Focus on vascular health maintenance."),
        new BpStagewarningRule(91, 100, "Elevated", "Elevated BP in centenarian: Monitor for symptoms. Comfort and functional status prioritized over strict numbers."),
    };

 public String classifyWarning(int ageVar , String userBpstage) {   
    switch (userBpstage) {
        case "Normal":
            for (BpStagewarningRule rule : BP_STAGEWARNING_RULES) {
                if (rule.warningRule(ageVar) && rule.stageWarningRule(userBpstage)) {
                    return rule.getMessage();
                }
            }
            break;
        case "Hypertension Stage 2":
            for (BpStagewarningRule rule : BP_STAGEWARNING_RULES2) {
                if (rule.warningRule(ageVar) && rule.stageWarningRule(userBpstage)) {
                    return rule.getMessage();
                }
            }
        case "Hypertension":
            for (BpStagewarningRule rule : BP_STAGEWARNING_RULES3) {
                if (rule.warningRule(ageVar) && rule.stageWarningRule(userBpstage)) {
                    return rule.getMessage();
                }
            }
            break;
        case "Elevated":
            for (BpStagewarningRule rule : BP_STAGEWARNING_RULES4) {
                if (rule.warningRule(ageVar) && rule.stageWarningRule(userBpstage)) {
                    return rule.getMessage();
                }
            }
            
            break;
        default:
            throw new AssertionError();
    }
    return "   No specific warning for your age and BP stage.";
}}
