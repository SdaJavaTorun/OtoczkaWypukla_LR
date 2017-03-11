package com.sdajava.Points;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomizePoints{

    public void randomSet(){
        List<RandomPoints> pointsList = new ArrayList<>();

        RandomPoints randomPoints = new RandomPoints();
        Random generator = new Random();
        for (int i = 0; i < 5; i++) {
            randomPoints.x = generator.nextDouble()*10;
            randomPoints.y = generator.nextDouble() *10;
            randomPoints.r = Math.sqrt(randomPoints.x *randomPoints.x + randomPoints.y * randomPoints.y  );

            System.out.println("Punkt nr:\t "+ i + " x: "+randomPoints.x+" y: "+ randomPoints.y + "\t odległość od środka osii współrzędnych: " +  randomPoints.r  );
            pointsList.add(randomPoints);
        }

       //return randomPoints;
    }

}