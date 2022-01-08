package com.studentapp.utils;

import java.util.Random;

/**
 * @author Vimal Vithalpura
 * @project StudentApp-Serenity-HW-WK19
 * @created 08/01/2022
 */
public class TestUtils {

    public static String getRandomValue(){
        Random random = new Random();
        int randomInt = random.nextInt(100000);
        return Integer.toString(randomInt);
    }
}
