package com.sdajava.Points;

import java.util.*;

public class AlgorithmOfGraham {



    public void algorithmOfGraham(List<RandomPoints> lista) {
        System.out.println("Wybieram punkt najblizej punktu 0,0 ");

        lista.forEach(r -> System.out.println(r.getR()));

        DoubleSummaryStatistics stat = lista.stream()
                                                    .map(RandomPoints::getR)
                                                    .mapToDouble(Double::doubleValue).summaryStatistics();

        System.out.println("Minimalna wartosc: " + stat.getMin());


    }


}
