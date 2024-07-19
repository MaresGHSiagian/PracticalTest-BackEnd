package com.example.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FizzBuzzService {

    public List<String> getFizzBuzz() {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            String line = "";
            if (i % 3 == 0) line += "Fizz";
            if (i % 5 == 0) line += "Buzz";
            if (line.isEmpty()) line = String.valueOf(i);
            result.add(line);
        }
        return result;
    }
}
