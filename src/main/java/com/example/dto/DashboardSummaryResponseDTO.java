package com.example.dto;

import com.example.Model.NumberOfSnack;
import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DashboardSummaryResponseDTO {

    private String officeName; // Unit Induk ??

    private String roomName;

    private Double usedPercentage; // Asumsikan satu ruangan mampu menampung 100 orang/kursi

    private Integer consumptionNominal;

    private List<NumberOfSnack> numberOfSnackList;

}
