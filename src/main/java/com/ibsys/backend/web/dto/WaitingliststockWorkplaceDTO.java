package com.ibsys.backend.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Builder
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class WaitingliststockWorkplaceDTO {
    private List<WaitingliststockWaitinglistDTO> waitinglist;
    private int id;
    private int timeneed;
}
