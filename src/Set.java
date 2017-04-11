import java.util.Random;
import java.util.TreeSet;

/**
 * Created by Helmut on 2017-04-11.
 */
public class Set {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i <51; i++){
        set.add(Random.nextInt(1000));
        int first = set.first();

    }
}
