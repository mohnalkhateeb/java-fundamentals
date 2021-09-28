package basiclibrary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello world");

        Library demo = new Library();
        demo.someLibraryMethod();
//        demo.looping(2, "Jason");
//        demo.scrapper("https://en.wikipedia.org/");
        System.out.println(Arrays.toString(demo.roll(4)));
        System.out.println(demo.hasDuplicates(new int[]{1, 2, 3, 4})) ;
        System.out.println(demo.hasDuplicates(new int[]{1, 2, 3, 4,4})) ;
        System.out.println(demo.avgCalc(new int[]{1, 2, 3, 4,4})) ;
        System.out.println(Arrays.toString(demo.arrayOfArrays(new int[][]{
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57},
        }))) ;

        //Lab3 call functions
        System.out.println((demo.temperaturesHashSet(new int[][]{
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57},
        }))) ;


        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        System.out.println(demo.tally(votes));

    }
}