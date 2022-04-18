package java.aagranda.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SampleOne {

    static boolean esPar(Integer n){
        return n % 2 == 0;
    }

    public static void main(String[] args){
        List<Integer> numPars = Arrays.asList(1,2,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        List<Integer> result = new ArrayList<>();

        // funcional metodo
        result = numPars.stream()
                .filter(SampleOne::esPar)
                .collect(Collectors.toList());

        /**
         * Modelo de programacion Imperativa
         *
         */

        /**
        for (int i = 0; i < numPars.size(); i++) {
            if (numPars.get(i) % 2 == 0) {
                result.add(numPars.get(i));
            }
        }*/

        System.out.print(result);
    }
}
