package com.sdabyd2.programowanie;

import java.util.*;

public class PTestimpl {


    public static String last(List<String> lista) {

        return lista.get(lista.size() - 1);
    }

    public static int length(List<Integer> lista1) {

        return lista1.size();
    }

    public static <T> List<T> reverse(List<T> numbers) {

        Collections.reverse(numbers);

        return numbers;
    }

    public static <T> boolean isPalindrome(List<T> myList2) {

        List<T> myNewList = new ArrayList<T>(myList2);
        PTestimpl.reverse(myList2);

        return Objects.equals(myList2, myNewList);
    }


    public static <T> Object[] removeAt(List<T> removerEle, int i) {

        List<T> myList = new ArrayList<>(removerEle);

        T b = myList.get(i - 1);
        myList.remove(i - 1);
        List<T> a = myList;

        Object[] myObject = new Object[]{a, b};

        for (Object n : myObject) {
            System.out.println(n);
        }

        return myObject;
    }

    public static List<String> randomSelect(List<String> strings, int i) {
        Random random = new Random();

        Set<String> shortSet = new HashSet<>();

        while (shortSet.size() < i) {
            int position = random.nextInt(strings.size());
            shortSet.add(strings.get(position));
        }
        List<String> shortList = new ArrayList<>(shortSet);
        return shortList;
    }

    public static List<String> compress(List<String> strings) {

        Set<String> compresed = new HashSet<>();
        for (int i = 0; i < strings.size(); i++) {
            compresed.add(strings.get(i));
        }
        System.out.println(compresed);
        List<String> compresedList = new ArrayList<>(compresed);

        return compresedList;
    }

    public static List<String> duplicate(List<String> strings) {

        List<String> duplicatedList = new ArrayList<>();
        String duplicateValue;

        for (int i = 0; i < strings.size(); i++) {
            duplicateValue = strings.get(i);
            duplicatedList.add(strings.get(i));
            duplicatedList.add(duplicateValue);
        }
        System.out.println(duplicatedList);
        return duplicatedList;
    }

    public static List<String> duplicate2(List<String> strings, int i) {

        List<String> myDuplicatedListOf3 = new ArrayList<>();

        for (int j = 0; j < strings.size(); j++) {
            for (int k = 0; k < i; k++) {
                myDuplicatedListOf3.add(strings.get(j));
            }
        }
        System.out.println(myDuplicatedListOf3);
        return myDuplicatedListOf3;
    }

    public static List<String> dropEveryNth(List<String> strings, int i) {

        List<String> droppedList = new ArrayList<>(strings);

        for (int k = 1; k < droppedList.size(); k++) {
            if (k % (i - 1) == 0) {
                droppedList.remove(k);
            }
        }
        System.out.println(droppedList);

        return droppedList;
    }
}





