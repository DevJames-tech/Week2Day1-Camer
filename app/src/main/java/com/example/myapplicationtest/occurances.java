package com.example.myapplicationtest;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class occurances {

        public void CheckArrayForInt(int []array)
        {
            //Get array and search for duplicates
            int valInArray = 0;
            Arrays.sort(array);
            int[] holdDuplicates = new int[10];

            holdDuplicates = array;

            // count each individual duplicate and get the number of each unique one
            int storeValues;
            int count = 0;
            int previous = count;

            for(int iIndex = 1; iIndex < holdDuplicates.length; iIndex++) {

                //System.out.println("holdDuplicates = " + holdDuplicates[iIndex]);
                storeValues = holdDuplicates[iIndex -1];

                if (holdDuplicates[iIndex] == storeValues) {

                    count++;
                   // System.out.println(count);

                    if(count > previous +1 )
                    {
                        previous = count;

                        System.out.println(storeValues);
                    }

                }
                else{
                    count = count - count;
                }

            }
        }

    public static void main(String[] args) {

        occurances myobj = new occurances();
        int arr[] = {10, 10, 20, 10, 20, 5, 5,23, 45,45, 5, 5};

        myobj.CheckArrayForInt(arr);

    }

}

