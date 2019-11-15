package numbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BiggerAndSmallerTest {


    @Test
    public void numbersInIncreasingOrder(){
        BiggerAndSmaller algorithm = new BiggerAndSmaller();
        algorithm.find(new int [] { 2,3,4});
        Assertions.assertEquals(4, algorithm.getBigger());
        Assertions.assertEquals(2,algorithm.getSmaller());
    }

    @Test
    public void numbersInDecreasingOrder(){
        BiggerAndSmaller algorithm = new BiggerAndSmaller();
        algorithm.find(new int [] { 3,2,1});
        Assertions.assertEquals(3, algorithm.getBigger());
        Assertions.assertEquals(1,algorithm.getSmaller());
    }

    @Test
    public void numbersInAnyOrder(){
        BiggerAndSmaller algorithm = new BiggerAndSmaller();
        algorithm.find(new int [] { 3,2,1,5});
        Assertions.assertEquals(5, algorithm.getBigger());
        Assertions.assertEquals(1,algorithm.getSmaller());
    }
    @Test
    public void onlyOneNumber(){
        BiggerAndSmaller algorithm = new BiggerAndSmaller();
        algorithm.find(new int [] { 3});
        Assertions.assertEquals(3, algorithm.getBigger());
        Assertions.assertEquals(3,algorithm.getSmaller());
    }

    @Test
    public void repeatedNumbers(){
        BiggerAndSmaller algorithm = new BiggerAndSmaller();
        algorithm.find(new int [] { 14,23,23,14,15,25,23,15,12,25});
        Assertions.assertEquals(25, algorithm.getBigger());
        Assertions.assertEquals(12,algorithm.getSmaller());
    }

    @Test
    public void nullList(){
        BiggerAndSmaller algorithm = new BiggerAndSmaller();
        algorithm.find(null);
        Assertions.assertEquals(0, algorithm.getBigger());
        Assertions.assertEquals(0,algorithm.getSmaller());
    }

    @Test
    public void emptyList(){
        BiggerAndSmaller algorithm = new BiggerAndSmaller();
        algorithm.find(new int [] { });
        Assertions.assertEquals(0, algorithm.getBigger());
        Assertions.assertEquals(0,algorithm.getSmaller());
    }
}
