package com.sdajava.Points;

import java.util.ArrayList;
import java.util.List;

public class ListOfRandom extends RandomizePoints{

    public List<RandomPoints> pointsList = new ArrayList<>();


     public void addPoint() {
        RandomPoints p1 = this.randomSet();
        pointsList.add(p1);
     }

    public void showValue(){
        for(RandomPoints q: pointsList){
            System.out.print(q.r);
        }

    }

    public List<RandomPoints> getPointsList() {
        return pointsList;
    }
}
