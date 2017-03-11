package com.sdajava.Points;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomizePoints{

    public RandomPoints randomSet(){

        RandomPoints randomPoints = new RandomPoints();
        Random generator = new Random();

        randomPoints.x = generator.nextDouble()*10;
        randomPoints.y = generator.nextDouble() *10;
        randomPoints.r = Math.sqrt(randomPoints.x *randomPoints.x + randomPoints.y * randomPoints.y  );


       return randomPoints;
    }

}
