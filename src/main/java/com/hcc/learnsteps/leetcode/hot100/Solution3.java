package com.hcc.learnsteps.leetcode.hot100;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hanchenchen <hanchenchen@kuaishou.com>
 * Created on 2021-12-25
 */
public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> windowMap = new HashMap<>();
        int l = 0, r = 0, res = 0;
        while (r < s.length()) {
            char c = s.charAt(r);
            r++;
            windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);
            while (windowMap.get(c) > 1) {
                char d = s.charAt(l);
                windowMap.put(d, windowMap.get(d) - 1);
                l++;
            }
            res = Math.max(res, r - l);
        }
        return res;
    }
}
