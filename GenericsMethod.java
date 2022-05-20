package HomeworkCollections.company;

import java.util.*;


public class GenericsMethod {

    private static void sortPick(List<Integer> list) {

        for (int i = 0; i < list.size() - 1; i++) {

            int Nmin = i;
            int min = list.get(i);

            for (int j = i + 1; j < list.size(); j++) {

                if (min > list.get(j)) {
                    min = list.get(j);
                    Nmin = j;
                }

            }

            list.set(Nmin, list.get(i));
            list.set(i, min);

        }

    }

    public static void main(String[] args) {

        List<Integer> list1= new ArrayList<>();

        list1.add(5717);
        list1.add(5);
        list1.add(54);
        list1.add(85);
        list1.add(13);
        list1.add(498064);
        list1.add(-447);
        list1.add(57);
        list1.add(-574);
        list1.add(4);
        list1.add(498);


        System.out.println(list1.toString());

        List<Integer> list2= new ArrayList<>();

        list2.addAll(list1);

        Date start = new Date();
        Collections.sort(list1);
        Date end = new Date();
        System.out.println(end.getTime() - start.getTime());
        System.out.println(list1.toString());

        System.out.println(list2.toString());
        Date start2 = new Date();
        sortPick(list2);
        Date end2 = new Date();
        System.out.println(end2.getTime() - start2.getTime());
        System.out.println(list2.toString());
    }
}
