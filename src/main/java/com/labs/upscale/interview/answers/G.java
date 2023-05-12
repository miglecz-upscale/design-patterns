package com.labs.upscale.interview.answers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class G {
    public static void main(String[] args) {
        List<Integer> lowers;
        //
        lowers = findLower1(List.of(1, 2, 3, 4, 5), 1);
        System.out.println(lowers == null ? 0 : lowers.size());
        //versus
        lowers = findLower2(List.of(1, 2, 3, 4, 5), 1);
        System.out.println(lowers.size());
    }

    static List<Integer> findLower1(List<Integer> list, int high) {
        List<Integer> result = null;
        for (Integer element : list) {
            if (element < high) {
                result = a(result);
                result.add(element);
            }
        }
        return result;
    }

    static List<Integer> findLower2(List<Integer> list, int high) {
        List<Integer> result = null;
        for (Integer element : list) {
            if (element < high) {
                result = a(result);
                result.add(element);
            }
        }
        if (result == null) {
            //null object
            return Collections.EMPTY_LIST;
        } else {
            return result;
        }
    }

    //lazy init
    static List<Integer> a(List<Integer> result) {
        if (result == null) {
            result = new ArrayList<>();
        }
        return result;
    }
}
