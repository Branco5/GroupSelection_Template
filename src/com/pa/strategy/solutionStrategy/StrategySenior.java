package com.pa.strategy.solutionStrategy;
/*
 *@author patriciamacedo
 */
import java.util.Map;

public class StrategySenior implements Strategy {


    @Override

    public float calculateGlobalIndex(Map<Integer, Programmer> personList){
        int countOld=0;
        for (Programmer programmer : personList.values()) {
            if(programmer.getYearsOfExperience()>10)
                countOld++;
        }
        return countOld*1.f/personList.size();
    }
}
