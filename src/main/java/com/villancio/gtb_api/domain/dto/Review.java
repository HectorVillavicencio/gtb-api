package com.villancio.gtb_api.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Review {
    private int idPatient;

    private String Observation;

    private int hr;

    private int highPressure;

    private int lowPressure;

    private int satu;

    private int gluc;

}
