package com.company.arina_cheverda;

import do_not_change.NumberCreator;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;



public class MyNumberCreator extends NumberCreator {

    /*
    define the basic constants for further work
     */
    private static final double UPPER_BOUND = 100;
    private static final double LOWER_BOUND = -100;
    Scanner in = new Scanner(System.in);

    /**
     * a function that just reads the value from the console
     * @return
     */
    @Override
    public int validateAndSetNumberQuantity() {
        System.out.println("Insert the number of numbers in the list to be processed");
        return in.nextInt();
    }

    /**
     * helper function to check if the value entered by the user meets the initial conditions
     * @param currentNumber
     * @return
     * @throws Exception
     */
    private Number checkAppropriate (Number currentNumber) throws Exception {
        if(currentNumber.doubleValue()>UPPER_BOUND ||
                currentNumber.doubleValue()<LOWER_BOUND)
            throw new Exception("Not an appropriate value, unfortunately.");
        else return currentNumber;
    }

    /**
     * a function that generates a random negative or positive value for a variable
     * @return
     */
    private int randomizeValue(){
        Random rand = new Random();
        int randomValue = rand.nextInt(100);
        switch (rand.nextInt(2)) {
            case 1:
                return -randomValue;
            default:
                return randomValue;
        }
    }

    /**
     * a function that first randomly generates a type for a number in a list,
     * and then assigns a random value
     * @param numberQuantity the quantity of numbers in the list
     * @return
     */
    @Override
    public List<Number> generateNumbers(int numberQuantity) {
        /*
        BigDecimal, BigInteger, Byte, Double, Float, Integer, Long, and Short
         */
        Random rand = new Random();
        List<Number> generatedList = new ArrayList<>();
        while (numberQuantity>0){
            int randomizeTheTypeOfGeneratedNumber = rand.nextInt(7);
            int randomizeValue = randomizeValue();
            switch (randomizeTheTypeOfGeneratedNumber){
                case 0: //BigDecimal
                    BigDecimal max = new BigDecimal(randomizeValue);
                    generatedList.add(max);
                    break;
                case 1: // BigInteger
                    BigInteger maxLimit = new BigInteger(String.valueOf(randomizeValue));
                    generatedList.add(maxLimit);
                    break;
                case 2: // Byte
                    generatedList.add((byte)randomizeValue);
                    break;
                case 3: //Double
                    generatedList.add((double)randomizeValue);
                    break;
                case 4: //Float
                    generatedList.add((float)randomizeValue);
                    break;
                case 5: //Integer
                    generatedList.add(randomizeValue);
                    break;
                case 6: //Long
                    generatedList.add((long)randomizeValue);
                    break;
                default: // Short
                    generatedList.add((short)randomizeValue);
                    break;
            }
            numberQuantity--;
        }
        return generatedList;
    }

    /**
     * a function that first randomly generates a type for a number in a list,
     * and then reads a random value from the user
     * but check the entered value for correctness using the helper function
     * @param numberQuantity
     * @return
     */
    @Override
    public List<Number> insertNumbers(int numberQuantity) {
        Random rand = new Random();
        List<Number> generatedList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int randomizeTheTypeOfGeneratedNumber = rand.nextInt(5);
        while (numberQuantity>0){
            switch (randomizeTheTypeOfGeneratedNumber){
                /* BigDecimal, BigInteger, Byte, Double, Float, Integer, Long, and Short */
                case 0: //BigDecimal
                    try {
                        BigDecimal inputValue = in.nextBigDecimal();
                        generatedList.add(checkAppropriate(inputValue));
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Sorry, this is not a valid value for the variable.");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 1: // BigInteger
                    try {
                        BigInteger inputValue = in.nextBigInteger();
                        generatedList.add(checkAppropriate(inputValue));
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Sorry, this is not a valid value for the variable.");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 2: // Byte
                    try {
                        Byte inputValue = in.nextByte();
                        generatedList.add(checkAppropriate(inputValue));
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Sorry, this is not a valid value for the variable.");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 3: //Double
                    try {
                        Double inputValue = in.nextDouble();
                        generatedList.add(checkAppropriate(inputValue));
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Sorry, this is not a valid value for the variable.");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 4: //Float
                    try {
                        Float inputValue = in.nextFloat();
                        generatedList.add(checkAppropriate(inputValue));
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Sorry, this is not a valid value for the variable.");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 5: //Integer
                    try {
                        Integer inputValue = in.nextInt();
                        generatedList.add(checkAppropriate(inputValue));
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Sorry, this is not a valid value for the variable.");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 6: //Long
                    try {
                        Long inputValue = in.nextLong();
                        generatedList.add(checkAppropriate(inputValue));
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Sorry, this is not a valid value for the variable.");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                default: // Short
                    try {
                        Short inputValue = in.nextShort();
                        generatedList.add(checkAppropriate(inputValue));
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Sorry, this is not a valid value for the variable.");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
            }
            numberQuantity--;
        }
        return generatedList;
    }
}
