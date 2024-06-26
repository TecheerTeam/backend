package com.techeer.abandoneddog.pet_board.dto;

import com.techeer.abandoneddog.pet_board.entity.Status;
import lombok.Getter;

import java.util.List;

@Getter
public class PetBoardFilterRequest {
    private String categories;
    private boolean isYoung;
    private Status status;
    private int minYear;
    private int maxYear;
    private String title;

    // Getters and Setters
}