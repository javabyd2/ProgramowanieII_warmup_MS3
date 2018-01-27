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

        Set<String> newList = new HashSet<String>(strings);
        newList.add(strings.get(random.nextInt(strings.size())));

        System.out.println(newList);


        return (List<String>) newList;
    }
}


