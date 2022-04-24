import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Job> list = new ArrayList<>();

        list.add(new Job(7, 10));
        list.add(new Job(4, 6));
        list.add(new Job(2, 5));
        list.add(new Job(11, 12));

        Collections.sort(list);

        List<Job> A = new ArrayList<>();

        A.add(list.get(0));
        int j = 0;

        for (Job job : list) {
            if (A.get(j).getFinishTime() <= job.startingTime()) {
                A.add(job);
                j++;
            }
        }

        System.out.println(A); // A is an optimal solution
    }
}
