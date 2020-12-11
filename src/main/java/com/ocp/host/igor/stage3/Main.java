package com.ocp.host.igor.stage3;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Statement;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> nums = new ArrayDeque<>();
        nums.add(1000);
        nums.push(2000);
        nums.add(3000);
        nums.push(4000);
        Integer i1 = nums.remove();
        Integer i2 = nums.pop();
        System.out.println(i1);
        System.out.println(i2);



        System.out.println(Integer.min(13,6));
    }
}
