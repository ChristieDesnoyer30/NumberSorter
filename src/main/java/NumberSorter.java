import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class NumberSorter {

    //I. Number Sorter
    //
    //Write a program which contains a class named NumberSorter. A NumberSorter should be able to accept a collection of 3 numbers and do the following:
    //
    //- Return the largest number
    //- Return the smallest number
    //- Return the numbers sorted from smallest to largest
    //- Return the numbers sorted from largest to smallest
    //- Return the average of the numbers
    //
    //Write a suite of unit tests which completely test the functionality of your program.



    public int sortNumbersToFindHighest(ArrayList<Integer> nums){

        return Collections.max(nums);

    }

    public int sortNumbersToFindSmallest(ArrayList<Integer> nums){


        return Collections.min(nums);


    }

    public ArrayList<Integer>  sortNumbersFromSmallestToHighest(ArrayList<Integer> nums){

        Collections.sort(nums);

        return nums;
    }




    public ArrayList<Integer>  sortNumbersFromHighestToLowest(ArrayList<Integer> nums){

        Collections.sort(nums);

        Collections.reverse(nums);

        return nums;
    }



    public int getAverageOfNumbers(ArrayList<Integer> nums){
        int average = 0;

        for(int number : nums){

            average += number;
        }

        average = average / nums.size();

        return average;
    }




}
