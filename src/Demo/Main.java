package Demo;

import javafx.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        HashSet<String> hs = new HashSet<>();
//        hs.add("hello");
//        hs.add("Hello");
//        hs.add("World");
//        System.out.println("Count: "+hs.size());

//            System.out.println("Hãy Nhập 10 Số Nguyên Khác Nhau");
            HashSet<Integer> sn = new HashSet<>();
            Scanner sc = new Scanner(System.in);
//            for (int i = 1; i == 10;i++){
//                System.out.println("Số "+ i +":");
//                sc.nextLine();
//                sn.add(sc.nextInt());
//            }
//            for (Integer elm : sn){
//                System.out.println(elm);
//            }
        //
//        while (sn.size() < 10){
//            System.out.println("Nhap 1 So Nguyen: ");
//            sn.add(sc.nextInt());
//        }
        PriorityQueue<Integer> ps = new PriorityQueue<>();
        ps.add(4);
        ps.add(8);
        ps.add(1);
        ps.add(5);
        while (ps.size()>0){
            int i = 0;
            i = ps.poll();
            System.out.println("Queue: " +i);
        }
        PriorityQueue<Student> spt = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("B10",20);
        hm.put("A5",18);
        System.out.println(hm.get("B10"));
        System.out.println(hm.get("A5"));
    }
}
