package com.example.Model;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Booking {

    private LocalDateTime bookingDate;

    private String officeName;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private List<Snack> listConsumption;

    private Integer participants;

    private String roomName;

    private String id;

}
