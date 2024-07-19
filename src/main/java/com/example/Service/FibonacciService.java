package com.example.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FibonacciService {

    public List<Integer> getFibonacciSeries(int count) {
        List<Integer> result = new ArrayList<>();
        if (count <= 0) return result;

        int[] fib = new int[count];
        
        fib[0] = 0;
        result.add(fib[0]);
        if (count > 1) {
            fib[1] = 1;
            result.add(fib[1]);
        }
        
        for (int i = 2; i < count; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            result.add(fib[i]);
        }
        
        return result;
    }
}
