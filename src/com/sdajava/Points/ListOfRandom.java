package com.sdajava.Points;

import java.util.ArrayList;
import java.util.List;

public class ListOfRandom {

    public List<RandomPoints> pointsList = new ArrayList<>();

     RandomizePoints randomizePoints = new RandomizePoints();

   // public void addPoint() {
    //    RandomPoints p1 = randomizePoints.randomSet();
      //  pointsList.add(p1);
  //  }

    public void showValue(){
        for(RandomPoints q: pointsList){
            System.out.print(q.r);
        }

    }



}
