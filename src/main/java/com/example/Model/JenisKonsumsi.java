package com.example.Model;

import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class JenisKonsumsi {

    private LocalDateTime createdAt;

    private String name;

    private Integer maxPrice;

    private String id;

}
