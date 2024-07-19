package com.example.Controller;

import com.example.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FunctionController {

    @Autowired
    private TextService textService;

    @Autowired
    private FizzBuzzService fizzBuzzService;

    @Autowired
    private FibonacciService fibonacciService;

    @Autowired
    private StockService stockService;

    @Autowired
    private NumberCountService numberCountService;

    @GetMapping("/convert-text")
    public String convertText(@RequestParam String input) {
        return textService.convertToReadable(input);
    }

    @GetMapping("/fizz-buzz")
    public List<String> getFizzBuzz() {
        return fizzBuzzService.getFizzBuzz();
    }

    @GetMapping("/fibonacci")
    public List<Integer> getFibonacci(@RequestParam int count) {
        return fibonacciService.getFibonacciSeries(count);
    }

    @GetMapping("/stock-profit")
    public int getStockProfit(@RequestParam int[] prices) {
        return stockService.maxProfit(prices);
    }

    @GetMapping("/count-numbers")
    public long countNumbers(@RequestParam List<String> list) {
        return numberCountService.countNumbers(list);
    }
}
