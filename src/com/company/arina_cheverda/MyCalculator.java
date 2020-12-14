package com.company.arina_cheverda;

import do_not_change.Calculator;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class MyCalculator extends Calculator {
    /**
     * This is the constructor of a Calculator
     * @param numbers the list of numbers
     */
    public MyCalculator(List<Number> numbers) {
        super(numbers);
    }

    /**
     * This function simply goes
     * through all the elements of the list and
     * sums up the values of the numbers, casting them to double
     * @return
     */
    @Override
    public double summarize() {
        double sumOfAllListNumbers = 0.0;
        for (Number currentNumber: this.getNumbers()) sumOfAllListNumbers+=currentNumber.doubleValue();
        return sumOfAllListNumbers;
    }

    /**
     * This function simply goes through all
     * the elements of the list and multiplies
     * the values of the numbers by casting them to double
     * @return
     */
    @Override
    public double multiply() {
        double multiplyOfAllListNumbers = 1;
        for (Number currentNumber: this.getNumbers()) multiplyOfAllListNumbers*=currentNumber.doubleValue();
        return multiplyOfAllListNumbers;
    }

    /**
     * This function simply iterates over all the elements
     * of the list and removes values that are equivalent to zero.
     */
    @Override
    public void deleteNegativeNumbers() {
        for (int i = 0; i < this.getNumbers().size(); i++){
            if(this.getNumbers().get(i).doubleValue()<0) {
                this.getNumbers().remove(i);
                i--;
            }
        }
    }

    /**
     * This function simply loops through all the elements of the list and compares it with a specific type,
     * casts it to a double, divides it, removes the past value and adds a new original type
     * @param divisor the divisor
     */
    @Override
    public void divideBy(double divisor) {
        for (int i = 0; i < this.getNumbers().size(); i++){
            Number currentNumber = this.getNumbers().get(i);
            this.getNumbers().remove(i);
            /* BigDecimal, BigInteger, Byte, Double, Float, Integer, Long, and Short */
            if (currentNumber instanceof BigDecimal){
                BigDecimal newValue = BigDecimal.valueOf(currentNumber.doubleValue()/divisor);
                this.getNumbers().add(i,newValue);
            }
            else if (currentNumber instanceof BigInteger){
                BigInteger newValue = BigInteger.valueOf((long) (currentNumber.doubleValue()/divisor));
                this.getNumbers().add(i,newValue);

            }
            else if (currentNumber instanceof Byte){
                Byte newValue = (byte) (currentNumber.doubleValue() / divisor);
                this.getNumbers().add(i,newValue);

            }
            else if (currentNumber instanceof Double){
                this.getNumbers().add(currentNumber.doubleValue() / divisor);
            }
            else if (currentNumber instanceof Float){
                Float newValue = Float.valueOf(String.valueOf(currentNumber.doubleValue() / divisor));
                this.getNumbers().add(i,newValue);

            }
            else if (currentNumber instanceof Integer){
                Integer newValue = (int) (currentNumber.doubleValue() / divisor);
                this.getNumbers().add(i,newValue);

            }
            else if (currentNumber instanceof Long){
                Long newValue = (long) (currentNumber.doubleValue() / divisor);
                this.getNumbers().add(i,newValue);
            }
            else if (currentNumber instanceof Short){
                Short newValue = (short) (currentNumber.doubleValue() / divisor);
                this.getNumbers().add(i,newValue);

            }

        }
    }

    /**
     * This function simply goes through all the elements of the list and compares it with a specific type,
     * casts it to a double, finds its root, removes the past value and adds a new one of the original type
     */
    @Override
    public void getSquareRoot() {
        for (int i = 0; i < this.getNumbers().size(); i++){
            if(this.getNumbers().get(i).doubleValue()<0) throw new ArithmeticException();
            else {
                Number currentNumber = this.getNumbers().get(i);
                this.getNumbers().remove(i);
                /* BigDecimal, BigInteger, Byte, Double, Float, Integer, Long, and Short */
                if (currentNumber instanceof BigDecimal){
                    BigDecimal newValue = BigDecimal.valueOf(Math.sqrt(currentNumber.doubleValue()));
                    this.getNumbers().add(i,newValue);

                }
                else if (currentNumber instanceof BigInteger){
                    BigInteger newValue = BigInteger.valueOf((long) (Math.sqrt(currentNumber.doubleValue())));
                    this.getNumbers().add(i,newValue);

                }
                else if (currentNumber instanceof Byte){
                    Byte newValue = (byte) (Math.sqrt(currentNumber.doubleValue()));
                    this.getNumbers().add(i,newValue);

                }
                else if (currentNumber instanceof Double){
                    this.getNumbers().add(Math.sqrt(currentNumber.doubleValue()));

                }
                else if (currentNumber instanceof Float){
                    Float newValue = Float.valueOf(String.valueOf(Math.sqrt(currentNumber.doubleValue())));
                    this.getNumbers().add(i,newValue);

                }
                else if (currentNumber instanceof Integer){
                    Integer newValue = (int) (Math.sqrt(currentNumber.doubleValue()));
                    this.getNumbers().add(i,newValue);

                }
                else if (currentNumber instanceof Long){
                    Long newValue = (long) (Math.sqrt(currentNumber.doubleValue()));
                    this.getNumbers().add(i,newValue);

                }
                 else if (currentNumber instanceof Short){
                    Short newValue = (short) (Math.sqrt(currentNumber.doubleValue()));
                    this.getNumbers().add(i,newValue);

                }

            }
        }
    }
}
