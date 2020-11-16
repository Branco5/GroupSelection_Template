package com.pa.strategy.solutionStrategy;
/*
 *@author patriciamacedo
 */
import java.util.Map;

import static java.lang.Integer.*;

public class StrategySpecialized implements Strategy {

    /**
     *
     * @param personList - List of persons in the group
     * @return ratio between person with more than 5 year of experience and the others
     */
    @Override
    public float calculateGlobalIndex(Map<Integer, Programmer> personList){
        int countYoung=0;
        int countOld=0;

        for (Programmer programmer : personList.values()) {

            if(programmer.getYearsOfExperience()>5)
                countOld++;
            if(programmer.getYearsOfExperience()<=5)
                countYoung++;

        }
       return countYoung*1.f/countOld;

    }
    public Programmer selectLeader(Map<Integer, Programmer> personList) {

        int min= MAX_VALUE;
        Programmer p=null;
        for (Programmer programmer : personList.values()) {
            if((programmer.getYearsOfExperience()==5) && (programmer.getNumberLanguages()<min)) {
                    min = programmer.getNumberLanguages();
                    p = programmer;
                }
        }
        return p;
    }
}
