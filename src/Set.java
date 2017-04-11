import java.util.Random;
import java.util.TreeSet;


public class Set {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        int sum = 0;
        for (int i = 0; i <= 50; i++) {
            set.add(Random.nextInt(1000));
            sum = sum + i;
        }
        double srednia = sum / 50;
        double bigger = srednia < i;


        System.out.println(set.last());
        System.out.println(set.first());
        System.out.println(srednia);
        System.out.println(bigger);

    }
}
