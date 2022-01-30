package com.hcc.learnsteps.leetcode.hot100;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author hanchenchen <hanchenchen@kuaishou.com>
 * Created on 2021-12-25
 */
public class Solution4 {
    public static void main(String[] args) {
        String s = "hcc";
        Set<String> collect = Arrays.stream(s.split(",")).collect(Collectors.toSet());
        System.out.println(collect);
    }
}
