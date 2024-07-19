package com.example.Service;

import com.example.Model.Booking;
import com.example.Model.JenisKonsumsi;
import com.example.Model.NumberOfSnack;
import com.example.Model.Snack;
import com.example.dto.DashboardSummaryResponseDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class DemoService {

    @Value("${mock.api.url.booking-list}")
    private String bookingListURL;

    @Value("${mock.api.url.jenis-konsumsi}")
    private String jenisKonsumsiURL;

    private final RestTemplate restTemplate;

    public List<DashboardSummaryResponseDTO> getDashboardSummary() {
        List<Booking> bookingList = getBookingsData();
        List<JenisKonsumsi> jenisKonsumsiList = getJenisKonsumsi();

        List<DashboardSummaryResponseDTO> summary = new ArrayList<>();

        for (Booking booking : bookingList) {
            List<Snack> snacks = booking.getListConsumption();
            int consumtionNominal = 0;
            for (Snack snack : snacks) {
                for (JenisKonsumsi jenisKonsumsi : jenisKonsumsiList) {
                    if (snack.getName().equalsIgnoreCase(jenisKonsumsi.getName())) {
                        consumtionNominal += booking.getParticipants() * jenisKonsumsi.getMaxPrice();
                    }
                }
            }

            DashboardSummaryResponseDTO dto = DashboardSummaryResponseDTO.builder()
                    .officeName(booking.getOfficeName())
                    .roomName(booking.getRoomName())
                    .numberOfSnackList(
                            booking.getListConsumption().stream().map(snack -> NumberOfSnack.builder()
                                    .name(snack.getName())
                                    .number(booking.getParticipants())
                                    .build())
                                    .collect(Collectors.toList())
                    )
                    .usedPercentage(booking.getParticipants().doubleValue())
                    .consumptionNominal(consumtionNominal)
                    .build();

            summary.add(dto);
        }

        return summary;
    }

    private List<Booking> getBookingsData() {
        ResponseEntity<List<Booking>> responseEntity = restTemplate.exchange(
                bookingListURL,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {}
        );
        if (responseEntity.getStatusCode().value() != HttpStatus.OK.value()) {
            throw new RuntimeException("Failed to get booking data!");
        }

        log.info("{}", responseEntity.getBody());
        return responseEntity.getBody();
    }

    private List<JenisKonsumsi> getJenisKonsumsi() {
        ResponseEntity<List<JenisKonsumsi>> responseEntity = restTemplate.exchange(
                jenisKonsumsiURL,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {}
        );
        if (responseEntity.getStatusCode().value() != HttpStatus.OK.value()) {
            throw new RuntimeException("Failed to get jenis konsumsi data!");
        }

        log.info("{}", responseEntity.getBody());
        return responseEntity.getBody();
    }

}
