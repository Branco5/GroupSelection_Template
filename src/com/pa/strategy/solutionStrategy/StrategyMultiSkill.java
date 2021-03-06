package com.pa.strategy.solutionStrategy;
/*
 *@author patriciamacedo
 */
import java.util.Map;

public class StrategyMultiSkill implements Strategy {

    /**
     *
     * @param personList - List of persons in the group
     * @return ratio between person that domain more than 5 languages and group size
     */
    @Override
    public float calculateGlobalIndex(Map<Integer, Programmer> personList){
        int countL=0;
        for (Programmer programmer : personList.values()) {
            if( programmer.getNumberLanguages()>5)
                countL++;
        }
        return countL*1.f/personList.size();
    }

}
