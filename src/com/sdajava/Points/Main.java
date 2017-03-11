package com.sdajava.Points;

public class Main {

    public static void main(String[] args) {

        RandomizePoints randomizePoints = new RandomizePoints();
        randomizePoints.randomSet();

        ListOfRandom listOfRandom = new ListOfRandom();
        listOfRandom.addPoint();
        listOfRandom.addPoint();
        listOfRandom.addPoint();

        listOfRandom.showValue();


        AlgorithmOfGraham graham = new AlgorithmOfGraham();

        graham.algorithmOfGraham(listOfRandom.getPointsList());


    }
}
