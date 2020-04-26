package udemy.example_34_lambda_expression_part2;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        // map method
        int[] arr1 = new int[10];
        List<Integer> list1 = new ArrayList<>();

        fillArr(arr1);
        fillList(list1);

        System.out.println(Arrays.toString(arr1));
        System.out.println(list1);

        arr1 = Arrays.stream(arr1).map(a -> 2).toArray();
        list1 = list1.stream().map(a -> a * 2).collect(Collectors.toList());

        System.out.println(Arrays.toString(arr1));
        System.out.println(list1);
        System.out.println();

        //filter method
        int[] arr2 = new int[10];
        List<Integer> list2 = new ArrayList<>();

        fillArr(arr2);
        fillList(list2);

        System.out.println(Arrays.toString(arr2));
        System.out.println(list2);

        arr2 = Arrays.stream(arr2).filter(a -> a % 2 == 0).toArray();
        list2 = list2.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());

        System.out.println(Arrays.toString(arr2));
        System.out.println(list2);

        //forEach method
        int[] arr3 = new int[10];
        List<Integer> list3 = new ArrayList<>();

        fillArr(arr3);
        fillList(list3);

        System.out.println(Arrays.toString(arr3));
        System.out.println(list3);

        Arrays.stream(arr3).forEach(System.out::println);
        list3.stream().forEach(System.out::println);

        System.out.println();

        //reduce method
        int[] arr4 = new int[10];
        List<Integer> list4 = new ArrayList<>();

        fillArr(arr4);
        fillList(list4);

        System.out.println(Arrays.toString(arr4));
        System.out.println(list4);

        int sum = Arrays.stream(arr4).reduce((acc, b) -> acc + b).getAsInt();
        int mult = list4.stream().reduce((acc, b) -> acc * b).get();

        System.out.println("sum1 = " + sum);
        System.out.println("sum2 = " + mult);
        System.out.println();

        // filter + map
        int[] arr5 = new int[10];
        fillArr(arr5);
        System.out.println(Arrays.toString(arr5));
        arr5 = Arrays.stream(arr5).filter(a -> a % 2 != 0).map(a -> a * 2).toArray();
        System.out.println(Arrays.toString(arr5));
        System.out.println();

        // set в поток
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);
        set = set.stream().map(a -> a * 3).collect(Collectors.toSet());
        System.out.println(set);
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i+1);
        }
    }

    private static void fillArr(int[] arr) {
        for (int i = 0; i < 10; i++) {
            arr[i] = i+1;
        }
    }
}
