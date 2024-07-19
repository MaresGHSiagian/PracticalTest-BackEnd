package com.example.Service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NumberCountService {

    public long countNumbers(List<String> list) {
        return list.stream().filter(s -> s.matches("\\d+")).count();
    }
}
