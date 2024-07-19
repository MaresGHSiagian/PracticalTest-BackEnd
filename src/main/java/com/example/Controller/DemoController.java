package com.example.Controller;

import com.example.Service.DemoService;
import com.example.dto.DashboardSummaryResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dashboard")
@RequiredArgsConstructor
public class DemoController {

    private final DemoService demoService;

    @GetMapping("/summary")
    public List<DashboardSummaryResponseDTO> getDashboardSummary() {
        return demoService.getDashboardSummary();
    }
}
