import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class NumberSorterTest {

    private NumberSorter numberSorter;

    @Before
    public void create(){

        numberSorter = new NumberSorter();
    }

    @Test
    public void shouldFindSmallestNumberInArray() {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,3,5));

        int result = numberSorter.sortNumbersToFindSmallest(numbers);

        assertThat(result, equalTo(1));

    }

    @Test
    public void shouldFindHighestNumberInArray() {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,3,5));

        int result = numberSorter.sortNumbersToFindHighest(numbers);

        assertThat(result, equalTo(9));

    }

    @Test
    public void shouldSortArraySmallestToHighest() {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(9,1,2));

        ArrayList<Integer> result = numberSorter.sortNumbersFromSmallestToHighest(numbers);

        assertThat(result, equalTo(Arrays.asList(1,2,9)));

    }

    @Test
    public void shouldSortArrayHighestToSmallest() {

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(7,2,5));

    ArrayList<Integer> result = numberSorter.sortNumbersFromHighestToLowest(numbers);

        assertThat(result, equalTo(Arrays.asList(7,5,2)));

    }



    @Test
    public void shouldCalculateAverageOfIntsInArray() {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(9,1,2));

        int result = numberSorter.getAverageOfNumbers(numbers);

        assertThat(result, equalTo(4));

    }


}