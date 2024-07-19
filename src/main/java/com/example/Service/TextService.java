package com.example.Service;

import org.springframework.stereotype.Service;

@Service
public class TextService {

    public String convertToReadable(String input) {
        String[] lines = input.split("\n");
        StringBuilder result = new StringBuilder();
        
        for (String line : lines) {
            String[] words = line.split(" ");
            for (String word : words) {
                result.append(new StringBuilder(word).reverse().toString()).append(" ");
            }
            result.append("\n");
        }
        
        return result.toString().trim();
    }
}
