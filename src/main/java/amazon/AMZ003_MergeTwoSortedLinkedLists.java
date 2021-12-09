package amazon;

import java.util.LinkedList;
import java.util.List;

public class AMZ003_MergeTwoSortedLinkedLists {

    private static List mergeSorted(List listA, List listB) {
        List mergedList = new LinkedList<>();
        int currentIndexA, currentIndexB;
        List biggestList;
        int biggestListCurrentIndex;
        Object elementA, elementB;

        currentIndexA = currentIndexB = 0;

        while (true) {
            if (currentIndexA == listA.size()) {
                biggestList = listB;
                biggestListCurrentIndex = currentIndexB;
                break;
            }

            if (currentIndexB == listB.size()) {
                biggestList = listA;
                biggestListCurrentIndex = currentIndexA;
                break;
            }

            elementA = (Comparable) listA.get(currentIndexA);
            elementB = (Comparable) listB.get(currentIndexB);

            if (((Comparable) elementA).compareTo(elementB) < 0) {
                currentIndexA++;
                mergedList.add((Comparable) elementA);
            } else {
                currentIndexB++;
                mergedList.add((Comparable) elementB);
            }
        }

        mergedList.addAll(biggestList.subList(biggestListCurrentIndex, biggestList.size()));
        return mergedList;
    }

    public static void main(String[] args) {
        List<Integer> listA = new LinkedList<>();
        List<Integer> listB = new LinkedList<>();

        listA.add(4);
        listA.add(8);
        listA.add(15);
        listA.add(19);
        listB.add(7);
        listB.add(9);
        listB.add(10);
        listB.add(16);

        List<Comparable> merged = mergeSorted(listA, listB);
        for (Comparable a : merged) {
            System.out.println(a.toString());
        }
    }
}
