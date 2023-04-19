package com.sezo.function.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TollRecord {

    private String stationId;
    private String licensePlate;
    private String timestamp;

}
