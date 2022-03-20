package week24.setOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class SetOperationsTest {

    public static void main(String[] args) {
        PriorityQueue<String> q1 = new PriorityQueue<>(List.of("George" , "Jim" , "John" , "Blake" , "Kevin" , "Michael"));
        PriorityQueue<String> q2 = new PriorityQueue<>(List.of("George" , "Katie" , "Kevin" , "Michelle" , "Ryan"));

        ArrayList<String> union = union(q1, q2);
        ArrayList<String> intersection = intersection(q1, q2);
        ArrayList<String> difference = difference(q1, q2);
        System.out.println(union);
        System.out.println(intersection);
        System.out.println(difference);

    }

    public static ArrayList<String> union(PriorityQueue<String> x, PriorityQueue<String> y) {
        PriorityQueue<String> q1 = new PriorityQueue<>(x);
        PriorityQueue<String> q2 = new PriorityQueue<>(y);
        ArrayList<String> list = new ArrayList<>();
        while (!q1.isEmpty() && !q2.isEmpty()) {
            String a = q1.peek();
            String b = q2.peek();
            if (a.compareTo(b) < 0) {
                list.add(a);
                q1.remove();
            } else if (a.compareTo(b) == 0) {
                list.add(a);
                q1.remove();
                q2.remove();
            } else {
                list.add(b);
                q2.remove();
            }
        }
        while (!q1.isEmpty()) {
            list.add(q1.poll());
        }
        while (!q2.isEmpty()) {
            list.add(q2.poll());
        }
        return list;
    }

    public static ArrayList<String> intersection(PriorityQueue<String> x, PriorityQueue<String> y) {
        PriorityQueue<String> q1 = new PriorityQueue<>(x);
        PriorityQueue<String> q2 = new PriorityQueue<>(y);
        ArrayList<String> list = new ArrayList<>();
        while (!q1.isEmpty() && !q2.isEmpty()) {
            String a = q1.peek();
            String b = q2.peek();
            if (a.compareTo(b) < 0) {
                q1.remove();
            } else if (a.compareTo(b) == 0) {
                list.add(a);
                q1.remove();
                q2.remove();
            } else {
                q2.remove();
            }
        }
        return list;
    }

    public static ArrayList<String> difference(PriorityQueue<String> x, PriorityQueue<String> y) {
        PriorityQueue<String> q1 = new PriorityQueue<>(x);
        PriorityQueue<String> q2 = new PriorityQueue<>(y);
        ArrayList<String> list = new ArrayList<>();
        while (!q1.isEmpty() && !q2.isEmpty()) {
            String a = q1.peek();
            String b = q2.peek();
            if (a.compareTo(b) < 0) {
                list.add(a);
                q1.remove();
            } else if (a.compareTo(b) == 0) {
                q1.remove();
                q2.remove();
            } else {
                list.add(b);
                q2.remove();
            }
        }
        while (!q1.isEmpty()) {
            list.add(q1.poll());
        }
        while (!q2.isEmpty()) {
            list.add(q2.poll());
        }
        return list;
    }

}
