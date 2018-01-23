package com.jack.csci1660.exersise1;

public class Main {

    public static void main(String[] args) {
        String cityName  = "Albuquerque";
        int    zipCode   = 87101;
        int[]  highTemps = {47, 51, 51, 51, 48};

        System.out.printf("City Name: %s\n", cityName);

        System.out.printf("Zip Code:  %s\n", zipCode);

        int tot = 0;
        for (int i=0; i < highTemps.length; i++) {
            tot += highTemps[i];
        }
        float avgTemp = (float)tot/highTemps.length;
        System.out.printf("Average High Temperature %f", avgTemp);
    }
}
